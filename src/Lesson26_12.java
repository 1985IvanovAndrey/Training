public class Lesson26_12 {

   // private static long a;

    public static void main(String[] args) {
        //System.out.println("Hello World!");
       // int a=15;
        //long b=12L;
        //float c=22.5f;
        //double h=22.5D;

        //float res=(float)h+c;

        //boolean flag1=false;
        //System.out.println(flag1);
        String str="first str";
        str.contains("f");


        //System.out.println(str.length());
       // System.out.println(str.length()==9);
        //System.out.println(str.contains("f"));
        //int a=5;
        //double c=45;

        //String str2="first str";
        //String str1="first str";

        //String strNew=new String("fox");
        //String strNew2=new String("fox");
        //System.out.println(strNew==strNew2);
        //String strNew=str;
        //String str3=str.substring(0,3);
        //System.out.println(str3);
        String str1="1";
        String str2="2";
        int a=15;
        System.out.println(a);
        String aStr=String.valueOf(a);
        int one=Integer.parseInt(str1);
        float f=Float.parseFloat(str1);
        int two=Integer.parseInt(str2);
        int  sum=one+two;
        System.out.println(sum);
        float fd=Float.parseFloat(str2);
        System.out.println(f+fd);
        String str3="www34";
        //int ab=Integer.parseInt(str3);
        String st=str3.substring(3);
        System.out.println(st);
        int [] mass=new int [10];
        mass[0]=5;
        mass[1]=5;
        mass[2]=7;
        mass[3]=5;
        mass[4]=9;
        for(int i=0;i<mass.length;i++){
            System.out.println(mass[i]+" ");
        }
        //String str="abfgfgfg";
        //int mass2[]=str;
        String mass4[]={"One","Two","Four"};
        for(String h : mass4){
            System.out.println(h);

        }

        //int mass []=new int[];

        //System.out.println(mass2.length);
        //System.out.println(mass2.toString());









    }
}
