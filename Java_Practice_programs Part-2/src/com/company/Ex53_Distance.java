package com.company;

//Add two distances in inch-feet by creating a class named 'AddDistance'.

import java.util.Scanner;

class Ex53_Distance {
    private int feet;
    private int inches;

    public void getDistance() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter feet: ");
        feet=sc.nextInt();
        System.out.print("Enter inches: ");
        inches=sc.nextInt();
    }
    public void showDistance()
    {
        System.out.println("Feet: "+ feet + "\tInches: "+ inches);
    }

    public void addDistance(Ex53_Distance D1, Ex53_Distance D2)
    {
        inches=D1.inches+D2.inches;
        feet=D1.feet+D2.feet+(inches/12);
        inches=inches%12;
    }
}

class AddTwoDistance
{
    public static void main(String []s)
    {
        try
        {

            Ex53_Distance D1=new Ex53_Distance();
            Ex53_Distance D2=new Ex53_Distance();
            Ex53_Distance D3=new Ex53_Distance();

            //read first distance
            System.out.println("Enter first distance: ");
            D1.getDistance();

            //read second distance
            System.out.println("Enter second distance: ");
            D2.getDistance();

            //add distances
            D3.addDistance(D1,D2);
            //print distance
            System.out.println("Total distance is:" );
            D3.showDistance();
        }
        catch (Exception e)
        {
            System.out.println("Exception occurred :"+ e.toString());
        }
    }
}

