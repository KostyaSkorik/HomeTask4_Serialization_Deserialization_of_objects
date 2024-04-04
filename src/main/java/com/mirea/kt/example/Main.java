package com.mirea.kt.example;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        System.out.println("HomeTask 4, Variant 2. Студент: Скорик Константин Алексеевич, Группа: РИБО-05-22");
        Scanner scanner = new Scanner(System.in);
        int flag=1;
        ArrayList<String> messagePath = new ArrayList<>();
        while (flag==1){
            System.out.println("Введите номер команды: 1-десериализовать объект, 0-завершить программу");
            int command = scanner.nextInt();
            if (command==1){
                System.out.println("Введите путь к файлу для его десериализации");
                String path = scanner.next();
                messagePath.add(path);
                flag=1;

            }else{
                flag=0;
            }
        }


        for (String path: messagePath){
            LoaderRunnable lr = new LoaderRunnable(path);
            Thread th = new Thread(lr);
            th.start();
            th.interrupt();

        }




    }
}