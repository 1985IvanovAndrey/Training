import java.util.Scanner;

public class CloserTo10 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter number one: ");
        double a=in.nextDouble();
        System.out.print("Enter number two: ");
        double b=in.nextDouble();
        int c=10;
        double m=Math.abs(c-a);
        double n=Math.abs(c-b);
        if(m==n){
            System.out.println("Numbers ravni");
        }
        if(m>n)
            System.out.println(b+" closer to "+c);
        else
            System.out.println(a+" closer to "+c);

    }

}
