package com.company;

import jdk.nashorn.internal.parser.JSONParser;

import javax.management.remote.rmi._RMIConnection_Stub;
import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class Main {



   static void vstavka_sort(int[]arr,int size)
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
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
           arr[i]=(int)(Math.random()*100);
            //arr[i]=in.nextInt();

        }
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        vstavka_sort(arr,n);

        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }

   }
}
