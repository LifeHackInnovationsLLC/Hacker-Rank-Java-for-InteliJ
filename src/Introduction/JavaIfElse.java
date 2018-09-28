package Introduction;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class JavaIfElse {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        scanner.close();

        if(N>=1&&N<=100) { //Constraints

            if (N % 2 != 0) {//Condition 1 Odd
                System.out.println("Weird");
                return;
            }else{//Condition 2a even
                if(N>=2 && N<=5){//Condition 2b 2<n<5
                   System.out.println("Not Weird");
                    return;
                }
                if(N>=6 && N<=20){
                    System.out.println("Weird");
                    return;
                }
                if(N>20){
                    System.out.println("Not Weird");
                    return;
                }

            }

        }else{
            System.out.println("Out of limit");
        }
    }
}
