package Introduction;

import java.util.Scanner;

public class JavaLoops1 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        scanner.close();

        if(N>=2&&N<=20){
            for(int i=1; i<11; i++){
                System.out.println(N+" x "+i+" = "+(N*i));
            }
        }


    }

}