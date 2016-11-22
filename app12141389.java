package com.antok.app12141389.UTSjava;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author Antok
 */
public class app12141389 {
 public static void main(String[] args) {
        ArrayList <String> namaPemain = new ArrayList<>(); 
        ArrayList <Integer> skorPermainan = new ArrayList<>(); 
        Scanner input = new Scanner(System.in);
        Scanner input2= new Scanner(System.in);
        Random angkaRandom = new Random();
        String cariY;
        
        do{
            System.out.println("Masukkan 'Nama' anda atau tekan 'y' untuk keluar, kemudian tekan enter = ");
            cariY=input.nextLine();
            namaPemain.add(cariY);
            int NilaiJalan = 0; 
            int CekGameOver=0;
            
            int aKumulasi[]= new int[6];
            int NilaiPasJalan=0;
            
            if(!("y").equals(cariY)){ 
                // ------------------- START TEBAK DISINI --------------------------  
                String nextLevel;
                int PiLevel=1;   
                System.out.println("Selamat Datang " + cariY);
                do{
                int Kout, Ang, Pang;
                    System.out.println("# Level " + PiLevel);
                    int StarNilaiO=PiLevel-1;    
                    Pang=PiLevel*100;
                    System.out.println("Silahkan Tebak Antara 1 s/d " + Pang);
                    System.out.println("Anda mempunyai kesempatan menebak 5 kali.");
                    int AngKaAcak=angkaRandom.nextInt(Pang);
