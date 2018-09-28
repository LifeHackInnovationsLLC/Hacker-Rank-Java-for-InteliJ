package Introduction;

import java.util.Scanner;


public class JavaOutputFormatting {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1=sc.next();
            int x=sc.nextInt();
            String x1=String.format("%03d", x);

            String space=" ";
            for(int j=0; j<(14-s1.length()); j++){
                space=space+" ";
            }
            String extra_space=space;

            String fullString=s1+extra_space+x1;
            System.out.println(fullString);
            //Complete this line

        }
        System.out.println("================================");





//        Scanner sc=new Scanner(System.in);
//
//        String[] s = new String[0];
//        int[] x = new int[0];
//
//
//
//        for(int i=0;i<3;i++){
//            s[i]=sc.next();
//            x[i]=sc.nextInt();
//        }
//
//        System.out.println("================================");
//        System.out.println(String.format("%3s",s[0]).replace(" ", "0"));
//
//        System.out.println("================================");

    }
}
