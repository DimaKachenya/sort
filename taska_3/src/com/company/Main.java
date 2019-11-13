package com.company;
import java.util.Scanner;

public class Main {





    static void vibor_sort(int [] arr,int size)
    {
        int max_num_of_arr=arr[0];
        int ind_of_max_num=0;
        int size_second=size ;
        int prom_znach=-1;

      for(int i=0;i<size;i++)
        {

            max_num_of_arr=arr[0];
            ind_of_max_num=0;
            for(int j=0;j<size_second;j++)
            {
                if(max_num_of_arr<arr[j])
                {
                    max_num_of_arr=arr[j];
                    ind_of_max_num=j;

                }
            }

            size_second--;
            prom_znach=arr[size_second];
            arr[size_second]=arr[ind_of_max_num];
            arr[ind_of_max_num]=prom_znach;

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



        vibor_sort(arr,n);


        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }


    }
}
