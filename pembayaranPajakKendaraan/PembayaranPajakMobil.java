package pembayaranPajakKendaraan;

public class PembayaranPajakMobil extends PembayaranPajakKendaraan {
    
    private final int ccMesin;
    private final String jenisMobil;

    // Constructor
    public PembayaranPajakMobil(String idTransaksi, String tanggalPembayaran, int ccMesin, String jenisMobil) {

        super(idTransaksi, tanggalPembayaran);
        this.ccMesin = ccMesin;
        this.jenisMobil = jenisMobil;
    }



    public double hitungTagihanPajak() {
        double pajakDasar = 0;


        if (this.jenisMobil.equalsIgnoreCase("SUV")) {
            pajakDasar = 3000000;
        } else if (this.jenisMobil.equalsIgnoreCase("Sedan")) {
            pajakDasar = 2500000;
        } else {
            pajakDasar = 2000000; 
        }


        if (this.ccMesin > 1500) {
            pajakDasar += 500000;
        }

        return pajakDasar;
    }

    public String getJenisMobil() {
        return jenisMobil;
    }
}