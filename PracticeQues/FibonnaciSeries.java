package PracticeQues;

import java.util.Scanner;

public class FibonnaciSeries {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Range of Nuber  to Print Fibonnaci :) ");
        int n=sc.nextInt();
        fibonnaci(n);

    }

    static void fibonnaci(int n){
        int a=0;int b=1;
        for(int i=0;i<=n;i++){
            System.out.print(a+" ");
            int nextNum=a+b;
            a=b;
            b=nextNum;
        }
    }
}
