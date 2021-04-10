package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
int a=0;
while (a<=10){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int number= scanner.nextInt();
        int i=1;
       while(i<31) {
           System.out.println(number + "*" + i + "=" + number * i);
           i = i + 1;
       }
    a=a+1;
        }
    }
}
