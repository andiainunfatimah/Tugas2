/* NIM : 13020210084
Nama             : Andi Ainun Fatimah Jamal
Hari/Tanggal     : Kamis,23 Maret 2023
Waktu Pengerjaan : 23.40 */


import java.util.Scanner;
public class PrintRepeat {
/**
* @param args
*/
public static void main(String[] args) {
// TODO Auto-generated method stub
/* Kamus : */
int N;
int i;
Scanner masukan=new Scanner(System.in);
/* Program */
System.out.print ("Nilai N >0 = ");
/* Inisialisasi */
N = masukan.nextInt();
i = 1;
/* First Elmt */
System.out.print ("Print i dengan REPEAT: \n");
do{
System.out.print (i+"\n"); /* Proses */ 
i++; /* Next Elmt */
}
while (i <= N); /* Kondisi pengulangan */
}
}