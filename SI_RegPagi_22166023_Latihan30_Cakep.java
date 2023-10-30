/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package si_regpagi_22166023_latihan30_cakep;
import java.util.Scanner;
/**
 *
 * @author User
 * AMA : Peni Nurul Fauzah
 * KELAS : PBO29
 * NIM : 22166023
 * DESKRIPSI PROGRAM : Cakep
 */
public class SI_RegPagi_22166023_Latihan30_Cakep {

    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
        
        System.out.println("Kamu ngerjain sendiri latihan 17 sampai latihan 30 ini? ");
        System.out.print("Jawab (Yoi/Enggak): ");
        String jawab = scanner.next();
        
        if (jawab.contains("Yoi")) {
            System.out.println("Cakep Bener. Good Job");
        } else {
            System.out.println("Tetep Cakep sih.");
            System.out.println("Sing Penting Paham Konsep nye yee.");
            System.out.println("Keep the code works dude.");
        }
    }
}
