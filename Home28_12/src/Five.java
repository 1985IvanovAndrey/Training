import java.util.Scanner;

public class Five {

    static Scanner in = new Scanner(System.in);

    public static boolean Five(){
       System.out.print("Введите число: ");
       int num=in.nextInt();
        return num>5;
    }

    public static void main(String[] args) {
        System.out.println(Five());
    }
}
