package com.company;

import java.util.Scanner;

public class Main {

     static void buble_sort(int[] arr,int size)
    {

        int swap;
        boolean flag=true;
        int k=0;
        while (true)
        {
            flag=true;
            for(int i=0;i<size-1;i++)
            {

                if(arr[i]>arr[i+1])
                {
                    swap=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=swap;
                    flag=false;
                }

            }
            if(flag==true)
                break;
            // k++;
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

        }
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        buble_sort(arr,n);

        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }

    }
}
