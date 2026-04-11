package pembayaranPajakKendaraan;
import buktiPembayaran.BuktiPembayaran;
public abstract class PembayaranPajakKendaraan {
    

    protected String idTransaksi;
    protected double totalTagihan;
    protected String metodePembayaran;
    protected String tanggalPembayaran;
    protected  BuktiPembayaran bukti;

  
    public PembayaranPajakKendaraan(String idTransaksi, String tanggalPembayaran) {
        this.idTransaksi = idTransaksi;
        this.tanggalPembayaran = tanggalPembayaran;
        this.totalTagihan = 0.0; 
    }
    
    public abstract double hitungTagihanPajak();

    
    public BuktiPembayaran prosesPembayaran(String status) {
        
        this.totalTagihan = hitungTagihanPajak();
        
        
        this.bukti = new BuktiPembayaran(this.tanggalPembayaran, this.totalTagihan, status);
        return this.bukti;
    }

    public void setMetodePembayaran(String metodePembayaran) {
        this.metodePembayaran = metodePembayaran;
    }
    public String getIdTransaksi() { 
        return idTransaksi; 
    }
    public double getTotalTagihan() { 
        return totalTagihan; 
    }
}