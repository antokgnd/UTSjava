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
                    for(Kout=0;Kout<=5;Kout++){
                        if(Kout==5){ 
                            System.out.println("GAMEOVER! Anda Gagal");
                            CekGameOver++; 
                        }
                        else{  
                            System.out.println("Tebakan Anda ? " + AngKaAcak);
                            int AkuTeb=input2.nextInt();
                            int Kurang=4-Kout;
                            if(AkuTeb==AngKaAcak){
                                if(Kout==0){
                                    NilaiPasJalan=PiLevel*100; 
                                }
                                else if(Kout==1){
                                    NilaiPasJalan=PiLevel*70; 
                                }
                                else if(Kout==2){
                                    NilaiPasJalan=PiLevel*50; 
                                }
                                else if(Kout==3){
                                    NilaiPasJalan=PiLevel*30;
                                }
                                else{
                                    NilaiPasJalan=0; 
                                }
                                int NeTebak=Kout+1;
                                
                                System.out.println("Selamat Anda berhasil menebak Angka dalam " + NeTebak + " kali tebakan. Sekor anda adalah " + NilaiPasJalan);
                                break;

                            }
                            else{ 
                                if(AkuTeb>AngKaAcak){
                                    System.out.println("Tebakan Anda terlalu Besar! Anda mempunyai kesempatan " + Kurang + " kali lagi" );
                                }
                                else{

                                    System.out.println("Tebakan Anda terlalu Kecil! Anda mempunyai kesempatan " + Kurang + " kali lagi" );
                            }
                            }
                        }
                    }
                    if(CekGameOver>0){
                        break;
                    }
                    
                    if(PiLevel==5){ 
                        break;
                    }
                    else{
                    aKumulasi[StarNilaiO]=NilaiPasJalan;    
                    System.out.println("Ketik 'next' dan tekan enter untuk lanjut ke Level berikutnya atau ketik 'exit' untuk keluar : ");
                    nextLevel=input.nextLine(); 
                    PiLevel++;