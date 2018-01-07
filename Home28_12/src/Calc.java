import java.util.Scanner;

/**
 * Created by DOM on 07.01.2018.
 */
public class Calc {

    static Scanner in = new Scanner(System.in);

    public static int getInt() {
        System.out.println("Введите число: ");
        int num = in.nextInt();
        return num;
    }

    public static char getOperation() {
        System.out.println("Введите операцию: ");
        char oper=in.next().charAt(0);
        return oper;
    }

    public static int calc(int num1, int num2, char znak) {
        int res;
        switch (znak) {
            case '+':
                res = num1 + num2;
                break;
            case '-':
                res = num1 - num2;
                break;
            case '*':
                res = num1 * num2;
                break;
            case '/':
                res = num1 / num2;
                break;
            default:
                System.out.println("Неверно ввели операцию, повторите ввод:");
                res = calc(num1, num2, getOperation());
        }
        return res;
    }

    public static void main(String[] args) {
    int num1=getInt();
    int num2=getInt();
        char znak=getOperation();
        int rez=calc(num1,num2,znak);
        System.out.println("Результат равен="+rez);


    }
}



