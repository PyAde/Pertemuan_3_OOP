public class PembayaranPajakMotor {
    private final int ccMesin;
    private final String jenisMotor;

    public PembayaranPajakMotor(int ccMesin, String jenisMotor) {
        this.ccMesin = ccMesin;
        this.jenisMotor = jenisMotor;
    }

    public String getJenisMotor() {
        return jenisMotor;
    }

    public double hitungTagihanPajak() {
        double pajak;
        if (ccMesin <= 150) {
            pajak = 250000;
        } else if (ccMesin <= 250) {
            pajak = 550000;
        } else {
            pajak = 1200000;
        }
        return pajak;
    }
}