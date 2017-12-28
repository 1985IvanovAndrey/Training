import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Arrays;


public class MassivSlovom {

    public static void main(String[] args) {
        String str="levelup";
        String []mass=new String[str.length()];
        for(int i=0;i<str.length();i++){
            mass[i]=str.substring(i,i+1);
            System.out.print(mass[i]);
        }
        System.out.println();
        System.out.print(Arrays.toString(mass));//Проверка заполненности массива
    }
}
