import java.util.Scanner;


public class Kubiki {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count=0;
        System.out.println("Вас приветствует игра КУБИКИ!");
        System.out.println("Игрок 1, как Вас зовут?");
        String pl1 = in.next();
        System.out.println("Игрок 2, как Вас зовут?");
        String pl2 = in.next();
        int num, sum1 = 0, sum2 = 0, count1, count2 = 0, br1, br2;
        do {
            System.out.println("Нажмите 1-для броска кубика, 2-просмотра счета и 3-для выхода и обьявления победителя!!");
            num = in.nextInt();
            switch (num) {
                case 1:
                    br1 = 1 + (int) (Math.random() * 6);
                    System.out.println(pl1 + " у Вас");
                    show(br1);
                    sum1 += br1;
                    br2 = 1 + (int) (Math.random() * 6);
                    System.out.println(pl2 + " у Вас");
                    show(br2);
                    sum2 += br2;
                    count++;
                    break;
                case 2:
                    if(count==0)
                        System.out.println("Для начала игры бросьте кубики!");
                    if (sum1 > sum2) {
                        System.out.println(pl1 + " побеждает со счетом " + sum1 + ":" + sum2 + " поздравляем!!!");
                        if (sum1 < sum2)
                            System.out.println(pl2 + " побеждает со счетом " + sum2 + ":" + sum1 + " поздравляем!!!");
                        if (sum1 == sum2)
                            System.out.println("Ничья " + sum1 + ":" + sum2);
                    }
                    break;
                case 3:
                    if(count==0)
                        System.out.println("Вы так и не разу не бросили кубики!");
                if (sum1 > sum2) {
                    System.out.println("Победил " + pl1 + " со счетом " + sum1 + ":" + sum2);
                    if (sum1 < sum2)
                        System.out.println("Победил " + pl2 + " со счетом " + sum2 + ":" + sum1);
                    if (sum1 == sum2)
                        System.out.println("Победила дружба!!! " + sum1 + ":" + sum2);
                }
                System.out.println("Игра окончена!!!!");
                    break;
                default:
                    System.out.println("Вы нажали не правильеую кнопку, повторите ввод!");
            break;
            }
        }
        while (num != 3);
    }

    public static void show(int x) {
        switch (x) {
            case 1:
                System.out.println("===========");
                System.out.println("|         |");
                System.out.println("|    0    |");
                System.out.println("|         |");
                System.out.println("===========");
                break;
            case 2:
                System.out.println("===========");
                System.out.println("|    0     |");
                System.out.println("|          |");
                System.out.println("|    0     |");
                System.out.println("===========");
                break;
            case 3:
                System.out.println("===========");
                System.out.println("|  0      |");
                System.out.println("|    0    |");
                System.out.println("|      0  |");
                System.out.println("===========");
                break;
            case 4:
                System.out.println("===========");
                System.out.println("|  0    0 |");
                System.out.println("|         |");
                System.out.println("|  0    0 |");
                System.out.println("===========");
                break;
            case 5:
                System.out.println("===========");
                System.out.println("|  0    0 |");
                System.out.println("|    0    |");
                System.out.println("|  0    0 |");
                System.out.println("===========");
                break;
            case 6:
                System.out.println("===========");
                System.out.println("|  0    0  |");
                System.out.println("|  0    0  |");
                System.out.println("|  0    0  |");
                System.out.println("===========");
                break;
        }
    }
}


