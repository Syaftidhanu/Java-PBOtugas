public class transaksiolshop {
	private int noTelepon, jmlhBarang ;
	private String namaBarang, alamatPembeli, tipeBarang, warnaBarang, namapembeli,  metodepembayaran, pengiriman, notepembeli;	
	public transaksiolshop (String namaBarang , String tipeBarang, int jmlhBarang, String warnaBarang, String namapembeli, String alamatPembeli, int noTelepon, String pengiriman, String metodepembayaran,  String notepembeli){
		this.namaBarang = namaBarang;
		this.tipeBarang = tipeBarang;
		this.warnaBarang = warnaBarang;
		this.jmlhBarang = jmlhBarang;
		this.namapembeli = namapembeli;
		this.alamatPembeli = alamatPembeli;
		this.noTelepon = noTelepon;
		this.pengiriman = pengiriman;
		this.metodepembayaran = metodepembayaran;
		this.notepembeli = notepembeli;
		
	}
	
		public String NamaBarang(){
			return namaBarang;
		}
		
		public String TipeBarang(){
			return tipeBarang;
		}	
		
		public int JmlhBarang(){
			return jmlhBarang;
		}
		
		public String WarnaBarang(){
			return warnaBarang;
		}
		
		public String NamaPembeli(){
			return namapembeli;
		}
		
		public String AlamatPembeli(){
			return alamatPembeli;
		}
		
		public int NoTelepon(){
			return noTelepon;
		}

		public String Pengiriman(){
			return pengiriman;
		}
		
		public String MetodePembayaran(){
			return metodepembayaran;
		}

		public String NotePembeli(){
			return notepembeli;
		}
}