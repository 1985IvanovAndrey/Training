import java.util.Arrays;
import java.util.Scanner;

public class IgraKosti {
    public static void main(String[] args) {
        System.out.println("Добро пожаловать в игру КУБИКИ!!!\n"+
                            "Сколько участвует игроков?");
        Scanner in=new Scanner(System.in);
        int players=in.nextInt();
        String massPlayers[]=new String[players];

        for(int i=1;i<=players;i++){
            System.out.print("Имя игрока №"+i+":");
            massPlayers[i-1]=in.next();
        }
        //System.out.println(Arrays.toString(massPlayers));
        System.out.println("Введите кол-во бросков каждого участника: ");
        int numberOfShots=in.nextInt();
        for(int j=1;j<=numberOfShots;j++){
        for(int i=1;i<=players;i++){
            int n=1+(int)(Math.random()*6);
            System.out.println("Бросает игрок "+massPlayers[i-1]+", Вам выпало: "+n);



        }


        }

        int n=1+(int)(Math.random()*6);





    }
}
