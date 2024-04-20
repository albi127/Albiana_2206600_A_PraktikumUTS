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
public class UTS3 {
    
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna memasukkan bilangan bulat
        System.out.print("Masukkan bilangan bulat: ");
        int number = scanner.nextInt();

        // Memeriksa apakah bilangan tersebut merupakan palindrom
        if (isPalindrome(number)) {
            System.out.println(number + " adalah palindrom");
        } else {
            System.out.println(number + " bukan palindrom");
        }

        scanner.close();
    }

    // Metode untuk membalikkan bilangan bulat
    public static int reverse(int number) {
        int reversedNumber = 0;
        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }
        return reversedNumber;
    }

    // Metode untuk memeriksa apakah bilangan bulat merupakan palindrom
    public static boolean isPalindrome(int number) {
        // Membandingkan bilangan asli dengan bilangan yang telah dibalik
        return number == reverse(number);
    }
}
