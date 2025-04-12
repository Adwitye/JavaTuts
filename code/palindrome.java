package code;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check if whether its a palindrome or not:");
        int number = sc.nextInt();
        boolean isPalindrome = true;

        if(number>0){
        while(findsize(number)>1){
            int currSize= findsize(number);
            int pow = (int)Math.pow(10,currSize-1);
            int firstdigit = number/pow;
            int lastdigit = number%10;
            if(firstdigit == lastdigit){
                //chop the firstNumber;
                number = number%pow;  //this will chop the firstnumber like 121%100 = 21
                //chop the lastNumber;
                number=number/10; //this will chop the lastnumber like 121/10 = 12
            }
            else{
                isPalindrome =false;
                break;
            }
        }}
        else{
            isPalindrome =false;
        }
        if(isPalindrome){
            System.out.println("Palindrome Number");
        }
        else{
            System.out.println("Not a Palindrome");
        }
    }

    public static Integer findsize(Integer number){
        int size=0;
        while(number>0){
            size++;
            number=number/10;
        }
        return size;
    }
}
