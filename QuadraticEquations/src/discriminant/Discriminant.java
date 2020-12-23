package discriminant;


public class Discriminant {
    private int a;
    private int b;
    private int c;


    public void setA(int a)
    {
       this.a=a;
    }


    public void setB(int b) {
        this.b = b;
    }

    public void  setC(int c)
    {
        this.c=c;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public double getDiscriminant()
    {
        return Math.pow(b,2)- 4 * a * c;
    }


}
