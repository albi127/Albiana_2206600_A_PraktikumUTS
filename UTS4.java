/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts;

/**
 *
 * @author anya
 */

    class Balok {
    private int panjang;
    private int lebar;
    private int tinggi;

    public Balok() {
        this.panjang = 1;
        this.lebar = 1;
        this.tinggi = 1;
    }

    public Balok(int panjangBaru, int lebarBaru, int tinggiBaru) {
        this.panjang = panjangBaru;
        this.lebar = lebarBaru;
        this.tinggi = tinggiBaru;
    }

    public int getLuas() {
        return 2 * ((panjang * lebar) + (panjang * tinggi) + (lebar * tinggi));
    }

    public int getKeliling() {
        return 4 * (panjang + lebar + tinggi);
    }

    public int getVolume() {
        return panjang * lebar * tinggi;
    }

    public void setPanjang(int panjangBaru) {
        this.panjang = panjangBaru;
    }

    public void setLebar(int lebarBaru) {
        this.lebar = lebarBaru;
    }

    public void setTinggi(int tinggiBaru) {
        this.tinggi = tinggiBaru;
    }

    public int getPanjang() {
        return panjang;
    }

    public int getLebar() {
        return lebar;
    }

    public int getTinggi() {
        return tinggi;
    }
}

public class UTS4 {
    public static void main(String[] args) {
        Balok balok1 = new Balok();
        Balok balok2 = new Balok(30, 40, 50);
        Balok balok3 = new Balok(25, 35, 45);

        cetakInfoBalok("balok 1", balok1);
        cetakInfoBalok("balok 2", balok2);
        cetakInfoBalok("balok 3", balok3);
    }

    public static void cetakInfoBalok(String nama, Balok balok) {
        System.out.println(nama + " dengan panjang: " + balok.getPanjang() + ", lebar: " + balok.getLebar() + ", dan tinggi: " + balok.getTinggi() + ". Luasnya: " + balok.getLuas() + ", sedangkan kelilingnya: " + balok.getKeliling() + " dan volumenya: " + balok.getVolume());
    }
}


