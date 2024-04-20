/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts;

/**
 *
 * @author anya
 */
public class PatternA {
     public static void main(String[] args) {
        // Loop untuk baris
        for (int i = 1; i <= 6; i++) {
            // Loop untuk kolom
            for (int j = 1; j <= i; j++) {
                // Cetak angka
                System.out.print(j + " ");
            }
            // Pindah ke baris baru setelah mencetak satu baris
            System.out.println();
        }
    }

}
