package pembayaranPajakKendaraan;
import buktiPembayaran.BuktiPembayaran;
public abstract class PembayaranPajakKendaraan {
    

    protected String idTransaksi;
    protected double totalTagihan;
    protected String metodePembayaran;
    protected String tanggalPembayaran;

    // Constructor
    public PembayaranPajakKendaraan(String idTransaksi, String tanggalPembayaran) {
        this.idTransaksi = idTransaksi;
        this.tanggalPembayaran = tanggalPembayaran;
        this.totalTagihan = 0.0; 
    }
    
    public abstract double hitungTagihanPajak();

    
    public BuktiPembayaran prosesPembayaran(String status) {
        
        this.totalTagihan = hitungTagihanPajak();
        
        
        System.out.println("Transaksi [" + this.idTransaksi + "] sedang diproses...");
        System.out.println("Total Tagihan: Rp " + this.totalTagihan);
        

        return new BuktiPembayaran(this.tanggalPembayaran, this.totalTagihan, status);
    }

    public void setMetodePembayaran(String metodePembayaran) {
        this.metodePembayaran = metodePembayaran;
    }
    public String getIdTransaksi() { return idTransaksi; }
    public double getTotalTagihan() { return totalTagihan; }
}