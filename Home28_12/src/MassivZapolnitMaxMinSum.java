
public class MassivZapolnitMaxMinSum {

    public static void main(String[] args) {
        short []mass=new short[100];
        for(short i=99;i>=0;i--){
            mass[i]=(short)(1+i);
            System.out.print(mass[i]+" ");
        }
        System.out.println();
        short max=mass[0];
        short min=mass[0];
        for(short i=0;i<mass.length;i++) {
            if (mass[i] > max) {
                max = mass[i];
            }
            if (mass[i] < min) {
                min = mass[i];
            }
        }
            System.out.println("Max element="+max);
            System.out.println("Min element="+min);
        short sum=0;
        for(short i=0;i<mass.length;i++){
            if(mass[i]!=max&&mass[i]!=min){
                sum+=mass[i];
            }
        }
        System.out.println("Summa elementov bez max i min="+sum);
    }
}
