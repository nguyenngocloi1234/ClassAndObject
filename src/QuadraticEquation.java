public class QuadraticEquation {
    private double a,b,c;
    private double delta;

    public QuadraticEquation(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }
    public double getB() {
        return b;

    }

    public double getC() {
        return c;

    }

    public double getDiscriminant(){
        return delta = Math.pow(b,2) - 4*a*c;
    }

    public double getRoot1(){
        if (delta <0)
            return 0;
        else
            return  (-b + Math.sqrt(delta))/(2*a);
    }

    public double getRoot2(){
        if( delta <0)
            return 0;
        else
            return (-b -Math.sqrt(delta))/(2*a);
    }
}
