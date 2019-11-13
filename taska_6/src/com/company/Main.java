package com.company;

import java.awt.*;
import java.util.Scanner;

public class Main {
    static void shellsort(int[] arr,int size)
    {
        int swap=0;



        for (int i=0;i<size;i++)
        {
            for (int j = i ; j >= 0; j--) {
                if((i!=(size-1))&& (arr[j] > arr[j+1]))
                {
                    swap = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = swap;
                }
                else
                {
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
	// write your code here

        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int [] arr=new int [n];

        for(int i=0;i<n;i++)
        {
            arr[i]=(int)(Math.random()*100);
            System.out.print(arr[i]+" ");
        }

        shellsort(arr,n);


    }
}
