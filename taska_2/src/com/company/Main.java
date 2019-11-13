package com.company;

import java.util.Scanner;

public class Main {


            static void bablesort(int[] arr,int size)
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
                System.out.print("Введите размеры первого и второго массива: ");
                int size_mass_one=in.nextInt();
                int size_mass_two=in.nextInt();

                int [] my_first_arr=new int[size_mass_one+size_mass_two];
                int [] my_second_arr=new int[size_mass_two];

                for (int i=0;i<size_mass_one;i++)
                {
                    my_first_arr[i]=(int)(Math.random()*100);
                    System.out.print(my_first_arr[i]+" ");
                }
                System.out.println();
                for (int i=0;i<size_mass_two;i++)
                {
                    my_second_arr[i]=(int)(Math.random()*100);
                    System.out.print(my_second_arr[i]+" ");
                }
                System.out.println();

                int prom_num;
                int j=0;
                    for(int i=size_mass_one;i<size_mass_one+size_mass_two;i++)
                    {
                        my_first_arr[i]=my_second_arr[j];
                        j++;
                    }


               for (int i=0;i<size_mass_one+size_mass_two;i++)
                {
                    System.out.print(my_first_arr[i]+" ");
                }
                System.out.println();




    }
}
