
package Hitung;

public class matematikaBeraksi {
    public static void main(String[] args) {
        //membuat objek
        matematika yofie = new matematika (7,1);
        
        System.out.println("Hasil Penjumlahan : " + yofie.setPenjumlahan());
        System.out.println("Hasil Pengurangan : " + yofie.setPengurangan());
        System.out.println("Hasil Perkalian   : " + yofie.setPerkalian());
        System.out.println("Hasil Pembagian   : " + yofie.setPembagian());
    }
}
