package sub.project;

import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter the number: ");
        int number= scanner.nextInt();
        if (number %2==0) {

            System.out.println("Since the number is divisible by 2 it is even");
        }else if (number %2==1) {
            System.out.println("The number gives a remainder of 1 so it is odd");
        }


    }
}
