package pembayaranPajakKendaraan;

public class PembayaranPajakMotor extends PembayaranPajakKendaraan {
    

    private final int ccMesin;
    private final String jenisMotor;


    public PembayaranPajakMotor(String idTransaksi, String tanggalPembayaran, int ccMesin, String jenisMotor) {

        super(idTransaksi, tanggalPembayaran);
        this.ccMesin = ccMesin;
        this.jenisMotor = jenisMotor;
    }


    @Override
    public double hitungTagihanPajak() {
        double pajakDasar = 0;

        if (this.ccMesin <= 150) {
            pajakDasar = 300000;
        } else if (this.ccMesin <= 250) {
            pajakDasar = 500000;
        } else {
            pajakDasar = 1000000; 
        }


        if (this.jenisMotor.equalsIgnoreCase("Sport")) {
            pajakDasar += 150000;
        }

        return pajakDasar;
    }

    public String getJenisMotor() {
        return jenisMotor;
    }
}