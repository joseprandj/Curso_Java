package secao10.Vetor.vetor10;

public class Student {

    private String name;
    private double n1;
    private double n2;
    private char aproved;

    public Student(String name, double n1, double n2, char aproved) {
        this.name = name;
        this.n1 = n1;
        this.n2 = n2;
        this.aproved = aproved;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }

    public char getAproved() {
        return aproved;
    }

    public void setAproved(char aproved) {
        this.aproved = aproved;
    }
}
