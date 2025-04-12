package code;

import java.util.Scanner;

public class numberReverse {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int number = s.nextInt();

        int revNum=0;
        while(number!=0){
            int rem=number%10;
            revNum=revNum*10+rem;
            number=number/10;
        }
        System.out.println(revNum);
    }
}
