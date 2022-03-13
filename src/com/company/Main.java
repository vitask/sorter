package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите размер массива");
        int size = Integer.parseInt(reader.readLine());
        System.out.println("Введите минимальное число в массиве");
        int min = Integer.parseInt(reader.readLine());
        System.out.println("Введите максимальное число по массиве");
        int max = Integer.parseInt(reader.readLine());
        int array[] = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = rnd(min, max);

        }
        System.out.println("Начальный массив: " + Arrays.toString(array));

        List<Integer> zero = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();
        List<Integer> even = new ArrayList<>();
        List<Integer> all = new ArrayList<>();
        for (int i = 0; i < array.length ; i++) {
            if ((array[i])==0){
                zero.add(array[i]);
            } else if ((array[i])%2==0){
                even.add(array[i]);
            } else
                odd.add(array[i]);
        }

        Collections.sort(odd);
        Collections.sort(even,Collections.reverseOrder());
        all.addAll(odd);
        all.addAll(zero);
        all.addAll(even);

        System.out.println("Нечетные числа по не убыванию: "+ odd);
        System.out.println("Нули: "+ zero);
        System.out.println("Четные числа не по возрастанию: "+ even);
        System.out.println("Отсортированный массив по требованию: " +all);
    }

    static int rnd (int min,int max){
        Random random = new Random();
        return random.nextInt(max-min+1)+min;
    }
}
