package org.example.gift;

import org.example.comparator.Com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//inheritance
public class Candy extends Sweets {

    private int total_candies;
    private int weight = 1;

    List<Integer> candy = new ArrayList<>();

    //getter and setter (Encapsulation)
    public int getTotal_candies() {
        return total_candies;
    }
    public void setTotal_candies(int total_candies) {
        this.total_candies = total_candies;
    }
    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void details(int c[]) {
        for (int i = 0; i < c.length; i++) {
            candy.add(c[i]);
            total_candies+=c[i];
        }
    }

    public int getMax() {
        return Collections.max(candy);
    }
    public int getMin() {
        return Collections.min(candy);
    }

    public void print() {
        System.out.println("\nCandies :- ");
        System.out.println("Total Candies = " + getTotal_candies());
        System.out.println("Total weight = "+ getTotal_candies()*getWeight() + "grams");
        System.out.println("Max candies = " + getMax());
        System.out.println("Min candies = " + getMin());
    }

    //polymorphism (overloading)
    public void print(String str) {
        System.out.print("Sorting Order of Candy :- ");
        Comparator<Integer> c = new Com();
        Collections.sort(candy,c);
        for(int i : candy)
        {
            System.out.print(i + " ");
        }
    }
}

