import com.sun.org.apache.xpath.internal.SourceTree;
public class Interval{
    public static void main(String[] args) {
        int a=-10;
        int d=a;
        int b=25;
        for(int i=a;i<=b;i++){
            System.out.print(i+" ");
        }
        System.out.println();
while(a<=b){
    System.out.print(a+" ");
    a++;
}
        System.out.println();
        do {
            System.out.print(d + " ");
            d++;
        }  while(d<=b);
        }
}
