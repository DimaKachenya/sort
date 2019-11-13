package com.company;
import java.awt.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner in=new Scanner(System.in);
        System.out.print("Введите размеры первого и второго массива: ");
        int size_mass_one=in.nextInt();
        int size_mass_two=in.nextInt();
        System.out.print("Введите в какую позицию первого массива нужно вставить второй массив : ");
        int k=in.nextInt();
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
        int j=0,a=0;
        for (int i = k; i <size_mass_one+size_mass_two ; i++)
        {
            if(j<size_mass_two) {
                prom_num = my_first_arr[i];
                my_first_arr[i] = my_second_arr[j];
                my_second_arr[j] = prom_num;
                j++;
            }
            else
            {
                my_first_arr[i] = my_second_arr[a];
                a++;


            }

        }

        for (int i=0;i<size_mass_one+size_mass_two;i++)
        {
            System.out.print(my_first_arr[i]+" ");
        }
        System.out.println();


    }
}
