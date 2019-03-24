public class kolomtransaksi{
	/*(int noTelepon, jmlhBarang, String namaBarang, String alamatPembeli, String tipeBarang, String warnaBarang, 
	String metodepembayaran, String namaPembeli, String kurirpengiriman, String notepembeli)*/
	public static void main (String[] args){
		transaksiolshop as = new transaksiolshop("Unicorn Watch", "Jam Tangan", 1, "white", "Syafti", "Jl kenanga no.34 ", 89, "Pengiriman via JNE", "transfer via atm BNI", "Terima Kasih");
		System.out.println("	Kolom Pembelian ");
		System.out.println("--------------------------");
		System.out.println("Nama Barang		: "+as.NamaBarang());
		System.out.println("Tipe Barang		: "+as.TipeBarang());
		System.out.println("Warna Barang		: "+as.WarnaBarang());
		System.out.println("Jumlah Barang 		: "+as.JmlhBarang());
		System.out.println("Nama Pembeli	 	: "+as.NamaPembeli());
		System.out.println("Alamat Pembeli		: "+as.AlamatPembeli());
		System.out.println("No Telp			: "+as.NoTelepon());
		System.out.println("Kurir Pengiriman	: "+as.Pengiriman());
		System.out.println("Metode Pembayaran 	: "+as.MetodePembayaran());
		System.out.println("Note Pembeli		: "+as.NotePembeli());
	}
}