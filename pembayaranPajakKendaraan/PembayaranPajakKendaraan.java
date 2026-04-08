package pembayaranPajakKendaraan;
import buktiPembayaran.BuktiPembayaran;
public abstract class PembayaranPajakKendaraan {
    
    // Atribut 'protected' agar bisa diakses oleh class anak (Mobil/Motor)
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

    // Method utama untuk memproses pembayaran dan mencetak struk
    public BuktiPembayaran prosesPembayaran(String status) {
        // 1. Hitung pajak menggunakan rumus dari class anak
        this.totalTagihan = hitungTagihanPajak();
        
        // 2. Cetak info ke layar
        System.out.println("Transaksi [" + this.idTransaksi + "] sedang diproses...");
        System.out.println("Total Tagihan: Rp " + this.totalTagihan);
        

        return new BuktiPembayaran(this.tanggalPembayaran, this.totalTagihan, status);
    }

    // Setter
    public void setMetodePembayaran(String metodePembayaran) {
        this.metodePembayaran = metodePembayaran;
    }

    // Getter
    public String getIdTransaksi() { return idTransaksi; }
    public double getTotalTagihan() { return totalTagihan; }
}