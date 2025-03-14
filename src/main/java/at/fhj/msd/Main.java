package at.fhj.msd;

public class Main{
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        System.out.println(c1.add(1.5,3.4));
        System.out.println(c1.minus(6.9,1.5));
        System.out.println(c1.multiply(2,5.0));
        System.out.println(c1.divide(30,5));
    }
}