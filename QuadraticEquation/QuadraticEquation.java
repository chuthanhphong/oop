package QuadraticEquation;

import java.util.Scanner;
import java.util.SortedMap;

public class QuadraticEquation {
    double a;
    double b;
    double c;
     public QuadraticEquation(){};
     public QuadraticEquation(double a, double b, double c){
         this.a = a;
         this.b = b;
         this.c = c;
     }
     public double getA(){
         return  a;
     }
    public double getB(){
        return  b;
    }
    public double getC(){
        return  c;
    }
    public double delta(){
         return  b*b -4*a*c;

    }
    public double getroot1(){
         return ((-b - Math.sqrt(this.delta()))/(2*a));
    }
    public double getroo2(){
        return ((-b + Math.sqrt(this.delta()))/(2*a));
    }

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Nhập a");
        double a = sc.nextDouble();
        System.out.println("Nhập b");
        double b = sc.nextDouble();
        System.out.println("Nhập c");
        double c = sc.nextDouble();
        QuadraticEquation value = new QuadraticEquation(a,b,c);
        double delta=  value.delta();
        if(delta<0){
            System.out.println("The equation has no roots");
        }else if(delta==0){
            System.out.println("The equation has one root" );
            System.out.println(value.getroot1());
        }else {
            System.out.println("The equation has two roots");
            System.out.println(value.getroot1());
            System.out.println(value.getroo2());
        }
    }
}


