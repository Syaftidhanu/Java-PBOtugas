public class transaksiolshop {
	protected int  jmlhBarang ;
	protected String kodePemesanan, namaBarang, alamatPembeli, tipeBarang, warnaBarang, namaPembeli,  metodepembayaran, pengiriman, noTelepon;
	
	//overload
	protected transaksiolshop()
	{
		kodePemesanan = "123b";
		namaBarang = " Jam Modern ";
		tipeBarang = " Jam Tangan ";
		warnaBarang = " Putih ";
		jmlhBarang = 2 ;
		namaPembeli = " Joko ";
		alamatPembeli = " Jl kenanga no.34 ";
		noTelepon =" 083812165499 ";
		pengiriman = " Pengiriman via JNE ";
		metodepembayaran = " transfer via atm BNI ";
	}
	
	//overload
	protected transaksiolshop (String kodePemesanan,String namaBarang , String tipeBarang, int jmlhBarang, String warnaBarang, String namaPembeli, String alamatPembeli, String noTelepon, String pengiriman,String metodepembayaran)
	{
		this.kodePemesanan = kodePemesanan;
		this.namaBarang = namaBarang;
		this.tipeBarang = tipeBarang;
		this.warnaBarang = warnaBarang;
		this.jmlhBarang = jmlhBarang;
		this.namaPembeli = namaPembeli;
		this.alamatPembeli = alamatPembeli;
		this.noTelepon = noTelepon;
		this.pengiriman = pengiriman;
		this.metodepembayaran = metodepembayaran;
		
	}
		//overide
		public void NamaToko()
		{
			System.out.println("Toko Jaya");
		}
	
		public String getKodePemesanan()
		{
			return kodePemesanan;
		}
		
		public String getNamaBarang()
		{
			return namaBarang;
		}
		
		public String getTipeBarang()
		{
			return tipeBarang;
		}	
		
		public int getJmlhBarang()
		{
			return jmlhBarang;
		}
		
		public String getWarnaBarang()
		{
			return warnaBarang;
		}
		
		public String getNamaPembeli()
		{
			return namaPembeli;
		}
		
		public String getAlamatPembeli()
		{
			return alamatPembeli;
		}
		
		public String getNoTelepon()
		{
			return noTelepon;
		}

		public String getPengiriman()
		{
			return pengiriman;
		}
		
		public String getMetodePembayaran()
		{
			return metodepembayaran;
		}

}