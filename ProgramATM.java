import java.io.IOException;
import javax.swing.JOptionPane;

public class ProgramATM {

public static void main(String[] args) throws IOException {
Proses icomeit = new Proses(“ok.txt”);

String id = JOptionPane.showInputDialog(“Masukkan No Tabungan dan Password”);
int cek = icomeit.cekId(id);
String inpMenu;
if (cek == 0) {
JOptionPane.showMessageDialog(null, “DATA DITOLAK”, “LOGIN…”, JOptionPane.ERROR_MESSAGE);
} else {
do {
inpMenu = JOptionPane.showInputDialog(“Selamat Datang ” + icomeit.namaNasabah()
+ “\nMenu”
+ “\n1. Cek Saldo”
+ “\n2. Ambil Uang”
+ “\n3. Simpan Uang”
+ “\n4. Transfer Uang”
+ “\n5. Selesai”);
if (inpMenu.equals(“1”)) {
JOptionPane.showMessageDialog(null, “Saldo Anda Rp ” + icomeit.cekSaldo());
} else if (inpMenu.equals(“2”)) {
String inpAmbil = JOptionPane.showInputDialog(“Masukkan Uang Yang Akan Diambil”);
int ambil = Integer.parseInt(inpAmbil);
icomeit.ambilUang(ambil);
} else if (inpMenu.equals(“3”)) {
String inpSimpan = JOptionPane.showInputDialog(“Masukkan Uang Yang Akan Disimpan”);
int simpan = Integer.parseInt(inpSimpan);
icomeit.simpanUang(simpan);
} else if (inpMenu.equals(“4”)) {
String inptransfer = JOptionPane.showInputDialog(“Masukkan dg Format [ID tabungan JumlahUang]”);
icomeit.transfer(inptransfer);
} else {
JOptionPane.showMessageDialog(null, “Sampai Jumpa”);
System.exit(0);
}
} while (true);
}
}
}