public class kolomtransaksi{
	/*(int noTelepon, jmlhBarang, String namaBarang, String alamatPembeli, String tipeBarang, String warnaBarang, 
	String metodepembayaran, String namaPembeli, String kurirpengiriman, String notepembeli)*/
	public static void main (String[] args){
		
		System.out.println();
		System.out.println();
//String NamaToko,String kodePemesanan,String namaBarang , String tipeBarang, int jmlhBarang, String warnaBarang, String namaPembeli, String alamatPembeli, String noTelepon, String pengiriman, String metodepembayaran, String sttspengiriman
		statuspengiriman run1 = new statuspengiriman("123b", "Jam Modern","Jam Tangan",2 ,"Putih", "Joko", "Jl kenanga no.34", "083812165499", "Pengiriman via JNE", "transfer", "Telah Sampai");
		run1.NamaToko();
		System.out.println("================================================================================");
		System.out.println("================================================================================");
		System.out.println(run1.run());
		

	}
}