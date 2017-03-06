import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

/*
* To change this template, choose Tools | Templates
* and open the template in the editor.
*/
/**
*
* @author aries
*/
class ATM {

private DataTabungan tabungan;
private String[] line;
DataTabungan[] tbg;
int currentId = 0;

public DataTabungan getTabungan() {
return tabungan;
}

public void setTabungan(DataTabungan val) {
tabungan = val;
}

public Proses(String val) throws IOException {
bacaFile(val);
tbg = new DataTabungan[10];
for (int i = 0; i < line.length; i++) {
if (line[i] == null) {
break;
}
tbg[i] = new DataTabungan();
StringTokenizer st = new StringTokenizer(line[i]);
tbg[i].setIdTabungan(st.nextToken());
tbg[i].setNama(st.nextToken());
tbg[i].setPassword(st.nextToken());
tbg[i].setSaldo(Integer.parseInt(st.nextToken()));
}
}

public void bacaFile(String val) throws IOException {
BufferedReader reader;
File f;
line = new String[10];
f = new File(val);
reader = new BufferedReader(new FileReader(f));
int i = 0;
while (true) {
line[i] = reader.readLine();
if (line[i] == null) {
break;
}
i++;
}
}

public int cekId(String id) {
StringTokenizer st = new StringTokenizer(id);
String idTab = st.nextToken();
String password = st.nextToken();

for (int i = 0; i < line.length; i++) {
if (line[i] == null) {
break;
}
if (idTab.equals(tbg[i].getIdTabungan()) && password.equals(tbg[i].getPassword())) {
currentId = i;
return 1;
}
}
return 0;
}

public String namaNasabah() {
return tbg[currentId].getNama();
}

public int cekSaldo() {
return tbg[currentId].getSaldo();
}

public void ambilUang(int ambil) {
int saldo = tbg[currentId].getSaldo() – ambil;
tbg[currentId].setSaldo(saldo);
}

public void simpanUang(int simpan) {
int saldo = tbg[currentId].getSaldo() + simpan;
tbg[currentId].setSaldo(saldo);
}

public void transfer(String trans) {
StringTokenizer st = new StringTokenizer(trans);
String id = st.nextToken();
int uangTrans = Integer.parseInt(st.nextToken());
int cek = 0;
for (int i = 0; i < line.length; i++) { if (line == null) { break; } if (tbg[i]!=null&&id.equals(tbg[i].getIdTabungan())) { cek++; String inpMenu = JOptionPane.showInputDialog( “Nama : ” + tbg[i].getNama() + “\nID Tabungan : ” + tbg[i].getIdTabungan() + “\nJumlah Transfer : ” + uangTrans + “\n1> Lanjut. 0> Batal”);
if (inpMenu.equals(“1”)) {
int saldo = tbg[currentId].getSaldo() – uangTrans;
tbg[currentId].setSaldo(saldo);
return;
} else {
JOptionPane.showMessageDialog(null, “Transfer Terhadap ” + tbg[i].getNama() + ” Telah Anda Batalkan”);
return;
}
}
}
if (cek == 0) {
JOptionPane.showMessageDialog(null, “Nasabah Dengan ID ” + id + ” Belum Terdaftar”);
return;
}
}
}