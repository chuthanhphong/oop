import java.awt.*;
import java.util.Scanner;

public class Rectangle {
        double width;
        double height;
        public Rectangle(){};
        public Rectangle(double width ,double height){
            this.width=width;
            this.height =height;
        }
        public double getarea(){
            return this.width*this.height;
        }
        public double getperimeter(){
            return (this.height+this.height)*2;
        }
        public String display(){
            return "Chiều Dài là  " + width + "Chiều rộng là  " + height;
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chiều dài");
        double width = sc.nextDouble();
        System.out.println("Nhập chiều rộng ");
        double height = sc.nextDouble();
        Rectangle rc = new Rectangle(width,height);
        System.out.println(rc.display());
        System.out.println(" Diện tích là " +rc.getarea());
        System.out.println("Chu vi là :" + rc.getperimeter());

    }
}

