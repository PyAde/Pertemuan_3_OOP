class PembayaranPajakMobil extends PembayaranPajakKendaraan {
    int ccMesin;
    String jenisMobil; 

    public PembayaranPajakMobil(String idTransaksi, String metodePembayaran, 
                                String tanggalPembayaran, int ccMesin, String jenisMobil) {
            super(idTransaksi, metodePembayaran, tanggalPembayaran);
            this.ccMesin = ccMesin;
            this.jenisMobil = jenisMobil;

     }  
     public String getJenisMobil () {
        return jenisMobil;
     }

     public double hitungTagihanPajak () {
        if(ccMesin <= 1500) {
            totalTagihan = 5000000;
        } else if(ccMesin <= 2500 ){
            totalTagihan = 10000000;
        } else {
            totalTagihan = 15000000;
        }
        return totalTagihan;


     }
 }