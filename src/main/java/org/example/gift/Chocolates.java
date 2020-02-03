package org.example.gift;

import org.example.comparator.Com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//inheritance
public class Chocolates extends Sweets
{
    private int total_chocolates;
    private int weight = 15;

    List<Integer> chocolate = new ArrayList<>();

    //getter and setter (Encapsulation)
    public int getTotal_chocolates() {
        return total_chocolates;
    }
    public void setTotal_chocolates(int total_chocolates) {
        this.total_chocolates = total_chocolates;
    }
    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void details(int c[])
    {
        for (int i=0;i<c.length;i++)
        {
            chocolate.add(c[i]);
            total_chocolates+=c[i];
        }
    }

    public int getMax()
    {
        return Collections.max(chocolate);
    }
    public int getMin() { return Collections.min(chocolate); }

    //polymorphism (overloading)
    public void print()
    {
        System.out.println("\nChocolates :-");
        System.out.println("Total Chocolates = "+ getTotal_chocolates());
        System.out.println("Total weight = "+ getTotal_chocolates()*getWeight() + "grams");
        System.out.println("Max chocolates = "+ getMax());
        System.out.println("Min chocolates = "+ getMin());
    }

    public void print(String str)
    {
        System.out.print("Sorting Order of Chocolates :- ");
        Comparator <Integer>c = new Com();
        Collections.sort(chocolate,c);
        for(int i : chocolate)
        {
            System.out.print(i + " ");
        }
    }
}

