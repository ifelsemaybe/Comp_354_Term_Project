package com.company;

public class Driver {

    public static void main(String[] args) {

        Math_Functions m = new Math_Functions();

        try{

            System.out.println(m.arccos(0.80));

        }

        catch (IllegalArgumentException ex){

            System.out.println(ex.getMessage());

        }

    }
}
