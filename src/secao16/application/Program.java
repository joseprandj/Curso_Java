package secao16.application;

import secao16.model.entities.Contract;
import secao16.model.entities.Instaliment;
import secao16.model.services.ContractService;
import secao16.model.services.PaypalService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");


        try {
            System.out.println("Entre os dados do contrato:");
            System.out.print("Numero: ");
            Integer numberContract = sc.nextInt();
            System.out.print("Data (dd/MM/yyyy): ");
            LocalDate dateContract = LocalDate.parse(sc.next(), fmt);
            System.out.print("Valor do contrato:");
            Double priceContract = sc.nextDouble();

            Contract contracts = new Contract(numberContract, dateContract, priceContract);

            System.out.print("Entre com o numero de parcelas: ");
            Integer numberInstaliment = sc.nextInt();

            ContractService contractService = new ContractService(new PaypalService());
            contractService.processContract(contracts, numberInstaliment);
            System.out.println("Parcelas:");
            for (Instaliment instaliment : contracts.getInstalments()){
                System.out.print(instaliment);
            }

        } catch (Exception e) {
            e.getMessage();
        }
        finally {
            sc.close();
        }
    }
}
