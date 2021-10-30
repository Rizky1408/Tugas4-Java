package com.bab4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int pilihan;

        // deklarasi variabel case 1
        int number = 10;
        char letter = 'a';
        boolean result = true;
        String str = "Hello";

        //deklarasi variabel case 2
        int number1 = 10;
        int number2 = 20;
        int number3 = 45;
        int AverageIs;

        //deklarasi variabel case 3
        int angka1  = 10;
        int angka2  = 23;
        int angka3  = 5;
        int terbesar= 0;
        System.out.println("1.Deklarasi Dan Mencetak Variabel");
        System.out.println("2.Menghitung nilai rata-rata dari iga angka ");
        System.out.println("3.Menampilkan Nilai terbesar");
        System.out.println("4.Operator Precedence");

        //mendapatkan input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan Pilihan :");
        pilihan = scanner.nextInt();

        switch (pilihan) {
            case 1 :
                System.out.println("");
                System.out.println("Number :" + number);
                System.out.println("letter :" + letter);
                System.out.println("result :" + result);
                System.out.println("str    :" +str);
                break;

            case 2 :
                AverageIs = (number1 + number2 + number3) / 3;
                System.out.println("Number 1   :" + number1);
                System.out.println("Number 2   :" + number2);
                System.out.println("Number 3   :" + number3);
                System.out.println("Average is :" + AverageIs);

            case 3 :
                if(angka1 > angka2 & angka1 > angka3){
                    terbesar = angka1;
                }else if(angka2 > angka1 & angka2 > angka3){
                    terbesar = angka2;
                }else if(angka3 > angka1 & angka3 > angka2){
                    terbesar = angka3;
                }
                System.out.println("Number 1       :" + angka1);
                System.out.println("Number 2       :" + angka2);
                System.out.println("Number 3       :" + angka3);
                System.out.println("Angka terbesar :" + terbesar);
                break;

            case 4 :
                System.out.println("((a / b ) ^ c ^ d (-g * h)) - e + f + i");
                System.out.println("((3 * 10) * (2 /15) ^ (2 ^ 2)) - 2 + 4");
                System.out.println("((r ^ s) * (2 / 15) ^ x) - v  + y++");
        }
    }
}
