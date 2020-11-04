package com.tugasPBO;
import java.util.Scanner;
/* Nama  : Argya Aulia Fauzandika
   NIM   : 10119035
   Kelas : PBO1 / IF-1
   Deskripsi : program perhitungan operasi matematika sederhana
* */

public class Kalkulator {
    public double value1;
    public double value2;

    public double tambahBilangan(){
        return value1 + value2;
    }

    public double kurangBilangan(){
        return value1 - value2;
    }

    public double kaliBilangan(){
        return value1 * value2;
    }

    public double bagiBilangan(){
        return value1 / value2;
    }

    public double sisaBilangan(){
        return value1 % value2;
    }

    public static void main(String[] args){
        Kalkulator calculate = new Kalkulator();
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan bilangan ke-1 : ");
        calculate.value1 = scan.nextDouble();
        System.out.print("Masukkan bilangan ke-2 : ");
        calculate.value2 = scan.nextDouble();

        System.out.println("hasil pertambahan : "+ calculate.tambahBilangan());
        System.out.println("hasil pengurangan : "+ calculate.kurangBilangan());
        System.out.println("hasil perkalian : "+ calculate.kaliBilangan());
        System.out.println("hasil pembagian : "+ calculate.bagiBilangan());
        System.out.println("hasil sisa bagi : "+ calculate.sisaBilangan());
    }
}
