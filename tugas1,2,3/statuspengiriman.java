class statuspengiriman extends transaksiolshop {
	public String sttspengiriman;
	
	statuspengiriman (String kodePemesanan,String namaBarang , String tipeBarang, int jmlhBarang, String warnaBarang, String namaPembeli, String alamatPembeli, String noTelepon, String pengiriman,String metodepembayaran, String sttspengiriman)
	{
		super(kodePemesanan ,namaBarang ,tipeBarang ,jmlhBarang ,warnaBarang ,namaPembeli ,alamatPembeli ,noTelepon , pengiriman, metodepembayaran );
		this.sttspengiriman = sttspengiriman;
	}
	
		public String getsttspengiriman(){
			return sttspengiriman;
		}
		
		//overide
		public void NamaToko()
		{
			System.out.println("Toko Sukses");
		}
		
		public String run(){
			return ("Kode Pemesanan		: "+getKodePemesanan()+"\nNama Barang		: "+getNamaBarang()+"\nTipe Barang		: "+getTipeBarang()+"\nWarna Barang		: "+getWarnaBarang()+"\nJumlah Barang 		: "+getJmlhBarang()+"\nNama Pembeli	 	: "+getNamaPembeli()+"\nAlamat Pembeli		: "+getAlamatPembeli()+"\nNo Telp			: "+getNoTelepon()+"\nKurir Pengiriman	: "+getPengiriman()+"\nMetode Pembayaran 	: "+getMetodePembayaran()+"\nStatus Pengiriman	: "+getsttspengiriman());
		}
}