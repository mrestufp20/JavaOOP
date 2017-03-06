import java.util.*;
class Switchcase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int pilihan, jumlahbarang, jumlahbarang1 = 0, jumlahbarang2, harga, diskon;
        //tampilkan daftar semua barang
        System.out.println("TOKO PAK JONI KEREN");
        System.out.println("1. Beras\n2. Telur\n3. Gula");
        System.out.println("4. Minyak\n5. Tepung");
        //input pilihan barang
        System.out.print("Masukkan Pilihan Angka = ");
        pilihan = in.nextInt();
        //input jumlah barang
        //hitung harga belanja
        //tampilkan harga belanja
        switch (pilihan){
            case 1: System.out.println("Anda akan membeli beras");
                    System.out.print("Masukkan Jumlah Beras = ");
                    jumlahbarang = in.nextInt();
                    harga = 10000*jumlahbarang;
                    System.out.println("Harga Beras = Rp. "+harga);
                    if (jumlahbarang % 5 >= 0){
                        jumlahbarang1 = jumlahbarang/5;}
                        jumlahbarang2 = jumlahbarang + jumlahbarang1;
                    
                    if (harga > 50000){
                        diskon = harga*2/100;
                        harga = harga-diskon;
                        System.out.println("Pembelian anda > 50000, Anda mendapat diskon 2% = Rp. "+diskon);
                    }
                    
                    System.out.println("Jumlah barang yang didapat = "+jumlahbarang2);
                    System.out.println("Selamat Anda cukup membayar Rp. "+harga+" untuk "+jumlahbarang2+" Kg beras");
            break;
            case 2: System.out.println("Anda akan membeli Telur");
                    System.out.print("Masukkan Jumlah Telur = ");
                    jumlahbarang = in.nextInt();
                    harga = 2500*jumlahbarang;
                    System.out.println("Harga Telur = Rp. "+harga);
                    if (jumlahbarang % 5 >= 0){
                        jumlahbarang1 = jumlahbarang/5;}
                        jumlahbarang2 = jumlahbarang + jumlahbarang1;
                        
                        if (harga > 25000){
                        diskon = harga*4/100;
                        harga = harga-diskon;
                        System.out.println("Pembelian anda > 25000, Anda mendapat diskon 4% = Rp. "+diskon);
                    }
                        
                    System.out.println("Jumlah barang yang didapat = "+jumlahbarang2);
                    System.out.println("Selamat Anda cukup membayar Rp. "+harga+" untuk "+jumlahbarang2+" buah Telur");
            break;
            case 3: System.out.println("Anda akan membeli Gula");
                    System.out.print("Masukkan Jumlah Gula = ");
                    jumlahbarang = in.nextInt();
                    harga = 4000*jumlahbarang;
                    System.out.println("Harga Gula = Rp. "+harga);
                    if (jumlahbarang % 5 >= 0){
                        jumlahbarang1 = jumlahbarang/5;}
                        jumlahbarang2 = jumlahbarang + jumlahbarang1;
                        
                        if (harga > 24000){
                        diskon = harga*5/100;
                        harga = harga-diskon;
                        System.out.println("Pembelian anda > 24000, Anda mendapat diskon 5% = Rp. "+diskon);
                    }
                        
                    System.out.println("Jumlah barang yang didapat = "+jumlahbarang2);
                    System.out.println("Selamat Anda cukup membayar Rp. "+harga+" untuk "+jumlahbarang2+" Kg Gula");
            break;
            case 4: System.out.println("Anda akan membeli Minyak");
                    System.out.print("Masukkan Jumlah Minyak = ");
                    jumlahbarang = in.nextInt();
                    harga = 5000*jumlahbarang;
                    System.out.println("Harga Minyak = Rp. "+harga);
                    if (jumlahbarang % 5 >= 0){
                        jumlahbarang1 = jumlahbarang/5;}
                        jumlahbarang2 = jumlahbarang + jumlahbarang1;
                        
                        if (harga > 35000){
                        diskon = harga*6/100;
                        harga = harga-diskon;
                        System.out.println("Pembelian anda > 35000, Anda mendapat diskon 6% = Rp. "+diskon);
                    }
                        
                    System.out.println("Jumlah barang yang didapat = "+jumlahbarang2);
                    System.out.println("Selamat Anda cukup membayar Rp. "+harga+" untuk "+jumlahbarang2+" Liter minyak");
            break;
            case 5: System.out.println("Anda akan membeli Tepung");
                    System.out.print("Masukkan Jumlah Tepung = ");
                    jumlahbarang = in.nextInt();
                    harga = 1500*jumlahbarang;
                    System.out.println("Harga Tepung = Rp. "+harga);
                    if (jumlahbarang % 5 >= 0){
                        jumlahbarang1 = jumlahbarang/5;}
                        jumlahbarang2 = jumlahbarang + jumlahbarang1;
                        
                        if (harga > 10000){
                        diskon = harga*1/100;
                        harga = harga-diskon;
                        System.out.println("Pembelian anda > 10000, Anda mendapat diskon 1% = Rp. "+diskon);
                    }
                        
                    System.out.println("Jumlah barang yang didapat = "+jumlahbarang2);
                    System.out.println("Selamat Anda cukup membayar Rp. "+harga+" untuk "+jumlahbarang2+" Kg tepung");
        }
        
    }
    }
