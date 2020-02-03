package org.example;

import org.example.gift.Candy;
import org.example.gift.Chocolates;
import org.example.gift.Sweets;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of Children :-");
        int n = s.nextInt();

        Sweets sweet1 = new Chocolates();
        Sweets sweet2 = new Candy();

        int chocolate[] = new int[n];
        int candy[] = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter Child's Sweets:-");
            System.out.println("Enter Number of Chocolates :-");
            chocolate[i] = s.nextInt();
            System.out.println("Enter Number of Candy :-");
            candy[i] = s.nextInt();
        }

        sweet1.details(chocolate);
        sweet2.details(candy);
        sweet1.print();
        sweet1.print("chocolate");
        sweet2.print();
        sweet2.print("candy");
    }
}
