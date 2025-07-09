package secao8.exc1;

public class Retangulo {
    double width = 0;
    double height = 0;

    public double Area(){
        return (width * height);
    }
    public double Perimeter(){
        return 2 * (width+height);
    }
    public double Diagonal(){
        return Math.sqrt( (Math.pow(width, 2) + Math.pow(height, 2)) );
    };
}
