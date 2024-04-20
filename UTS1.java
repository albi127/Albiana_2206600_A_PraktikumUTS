/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts;
import java.util.Scanner;

/**
 *
 * @author anya
 */
public class UTS1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna memasukkan tiga angka
        System.out.print("Masukkan tiga angka: ");
        int number = scanner.nextInt();

        // Memeriksa apakah angka yang dimasukkan merupakan palindrom
        if (isPalindrome(number)) {
            System.out.println(number + " adalah palindrom");
        } else {
            System.out.println(number + " bukan palindrom");
        }

        scanner.close();
    }

    // Metode untuk memeriksa apakah suatu angka merupakan palindrom
    public static boolean isPalindrome(int number) {
        int originalNumber = number;
        int reversedNumber = 0;

        // Membalikkan digit angka
        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        // Membandingkan angka asli dengan angka yang telah dibalik
        return originalNumber == reversedNumber;
    }
}


    