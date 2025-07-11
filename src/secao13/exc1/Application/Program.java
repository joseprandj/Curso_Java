package secao13.exc1.Application;

import secao13.exc1.Entities.ImportedProduct;
import secao13.exc1.Entities.Product;
import secao13.exc1.Entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double customFee = 0;
        String dateProduct = null;
        SimpleDateFormat dfm = new SimpleDateFormat("dd/MM/yyyy");
        List<Product> products = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();
        for (int i = 0 ; i < n ; i++) {
            System.out.printf("Product #%d data:\n", (i + 1));
            System.out.print("Common, used or imported (c/u/i)? ");
            char tipeProduct = sc.next().charAt(0);
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Price: ");
            Double price = sc.nextDouble();
            if (tipeProduct == 'c' || tipeProduct == 'C') {
                Product commonProduct = new Product(name, price);
                products.add(commonProduct);
            } else if (tipeProduct == 'u' || tipeProduct == 'U') {
                System.out.print("Manufacture date (DD/MM/YYY): ");
                dateProduct = sc.next();
                Product usedProduct = new UsedProduct(name, price, dfm.parse(dateProduct));
                products.add(usedProduct);
            } else {
                System.out.print("Customs fee: ");
                customFee = sc.nextDouble();
                Product importProduct = new ImportedProduct(name, price, customFee);
                products.add(importProduct);
            }

        }
        System.out.println("PRICE TAGS:");
        for (Product product : products){
            System.out.print(product.priceTag() + '\n');
        }

        sc.close();
    }
}
