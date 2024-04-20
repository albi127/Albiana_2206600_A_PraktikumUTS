/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts;

/**
 *
 * @author anya
 */
public class PatternD {
    
 public static void main(String[] args) {
        // Loop untuk baris
        for (int i = 6; i >= 1; i--) {
            // Loop untuk mencetak spasi sebelum angka
            for (int j = 1; j <= 6 - i; j++) {
                System.out.print("  "); // Menggunakan dua spasi agar pola terlihat rapih
            }
            // Loop untuk mencetak angka dari kanan ke kiri
            for (int k = i; k >= 1; k--) {
                System.out.print(k + " ");
            }
            // Pindah ke baris baru setelah mencetak satu baris
            System.out.println();
        }
    }
}
