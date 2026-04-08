
package buktiPembayaran;

public class BuktiPembayaran {
    
    private final  String tanggalPelunasan;
    private final  Double totalDibayar;
    private final String statusPembayaran;

    // Constructor untuk inisialisasi objek
    public BuktiPembayaran(String tanggalPelunasan, Double totalDibayar, String statusPembayaran) {
        this.tanggalPelunasan = tanggalPelunasan;
        this.totalDibayar = totalDibayar;
        this.statusPembayaran = statusPembayaran;
    }


    public void tampilkanBuktiPembayaran() {
        System.out.println("=== BUKTI PEMBAYARAN PAJAK ===");
        System.out.println("Tanggal Pelunasan : " + this.tanggalPelunasan);
        System.out.println("Total Dibayar     : Rp " + this.totalDibayar);
        System.out.println("Status            : " + this.statusPembayaran);
        System.out.println("==============================");
    }

    public void cetakPDF() {

        System.out.println("Mencetak bukti pembayaran ke format PDF...");
    }

    public void kirimEmail() {

        System.out.println("Mengirim bukti pembayaran via Email...");
    }


    public String getTanggalPelunasan() { return tanggalPelunasan; }
    public Double getTotalDibayar() { return totalDibayar; }
    public String getStatusPembayaran() { return statusPembayaran; }
}

