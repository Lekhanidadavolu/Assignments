package com.Exception;

import java.util.Scanner;
public class Resumption
{
	public static void main(String[] args) {
        int offset;
        System.out.println("Enter offset value:");
        Scanner sc=new Scanner(System.in);
        offset = sc.nextInt();
        while (true) {  //try to read the last element in the array
            try {
                int[] arrayToOverflow = {1,2,3,4,5};
                System.out.println("The last element (" + "index=" + offset + ") in the array is: " + arrayToOverflow[offset]);
                break;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(offset + " is too big!");
                offset--;
            }
        }
    }
}
