package secao8.exc3;

public class Aluno {
    String name;
    double n1,n2,n3;

    public double TotalN(){
        return (n1+n2+n3);
    }

    public String AprovedReproved(double media){
        if (media >= 60){
            return "PASS";
        } else {
            return
                    "FAILED\n"
                    + "MISSING " + String.format("%.2f", (60 - media) ) + " POINTS";
        }
    }
}
