package secao12.exc1.Application;

import secao12.exc1.entities.Client;
import secao12.exc1.entities.Order;
import secao12.exc1.entities.OrderItem;
import secao12.exc1.entities.Product;
import secao12.exc1.entities.enums.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sfd = new SimpleDateFormat("dd/MM/yyyy");
        Date moment = new Date();
        SimpleDateFormat mf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        SimpleDateFormat bdf = new SimpleDateFormat("dd/MM/yyyy");


        System.out.println("Enter cliente data:");
        System.out.print("Name: ");
        String name = sc.next();
        System.out.print("Email: ");
        String email = sc.next();
        System.out.print("Birth date (DD/MM/YYYY): ");
        Date date = sfd.parse(sc.next());
        Client client = new Client(name, email, date);

        System.out.println("Enter order data:");
        System.out.print("Status: ");
        String status = sc.next();
        Order order = new Order(moment, OrderStatus.valueOf(status));

        System.out.print("How many items to this order? ");
        int n = sc.nextInt();
        for (int i = 0 ; i < n ; i++){
            System.out.printf("Enter #%d item data:\n", (i+1) );
            System.out.print("Product name: ");
            String pname = sc.next();
            System.out.print("Product price: ");
            double price = sc.nextDouble();
            System.out.print("Quantity: ");
            int qtd = sc.nextInt();
            Product product = new Product(pname, price);
            OrderItem itens = new OrderItem(qtd, price, product);
            order.addItem(itens);
        }

        System.out.println("\nORDER SUMMARY:");
        String dtfm = mf.format(moment);
        System.out.print("Order moment: " + dtfm);
        System.out.print("\nOrder statud: " +  order.getStatus());
        String bfm = bdf.format(client.getBirthDay());
        System.out.printf("\nClient: %s (%s) - %s", client.getName(), bfm , client.getEmail());
        System.out.println("\nOrder items:");
        System.out.print(order);

        sc.close();
    }
}
