package Introduction;

import java.lang.reflect.UndeclaredThrowableException;
import java.util.*;
import java.io.*;

public class JavaLoops2 {

    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int q=in.nextInt();
        if(q>=0&&q<=500){
            for(int i=0;i<q;i++){
                int a = in.nextInt();
                int b = in.nextInt();
                int n = in.nextInt();

                int s=0;
                if(a>=0&&b<=50&&n>=1&&n<=15){
                    for(int N=0; N<n; N++){
                        int c = (int) ((Math.pow(2,N)*b));
                        s = s + c;
                        System.out.print((a+s)+" ");
                    }
                    System.out.println();
                }else{
                    throw new IllegalArgumentException("values out of range");
                }

            }
        }else{
            throw new IllegalArgumentException("q must be inclusively between 0 and 500");
        }
        in.close();
    }
}
