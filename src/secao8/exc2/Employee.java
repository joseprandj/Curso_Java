package secao8.exc2;

public class Employee {
    String name = "Joao Silva";
    double grossSalary = 6000.00;
    double tax = 1000.00;

    public double NetSalary(){
        return (grossSalary - tax);
    }

    public double IncreaseSalary( double percent){
        percent = (percent/100);
        return grossSalary + (grossSalary * percent) - tax;
    }

    public String toString(){
        return
                "Name: " + name
                + "\nGross salary: " + String.format("%.2f", grossSalary)
                + "\nTax: " + String.format("%.2f", tax)
                + "\n\nEmployee: " + name + ", $ " + String.format("%.2f\n\n", NetSalary());
    }
}
