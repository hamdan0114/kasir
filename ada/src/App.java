import java.util.Scanner;
public class App {
    public static void main(String[] args){
Scanner scn = new Scanner(System.in);
System.out.print("masukan tarif harga");
long harga = scn.nextLong();
System.out.print("masukan jumlah jam parkir");
int jumlah = scn.nextInt();
long total = harga * jumlah;
System.out.print("total biaya :" + total);
    }
}
