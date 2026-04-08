public class BuktiPembayaran {
    
    // Atribut (Private)
    private String tanggalPelunasan;
    private Double totalDibayar;
    private String statusPembayaran;

    // Constructor untuk inisialisasi objek
    public BuktiPembayaran(String tanggalPelunasan, Double totalDibayar, String statusPembayaran) {
        this.tanggalPelunasan = tanggalPelunasan;
        this.totalDibayar = totalDibayar;
        this.statusPembayaran = statusPembayaran;
    }

    // Method (Public)
    public void tampilkanBuktiPembayaran() {
        System.out.println("=== BUKTI PEMBAYARAN PAJAK ===");
        System.out.println("Tanggal Pelunasan : " + this.tanggalPelunasan);
        System.out.println("Total Dibayar     : Rp " + this.totalDibayar);
        System.out.println("Status            : " + this.statusPembayaran);
        System.out.println("==============================");
    }

    public void cetakPDF() {
        // Logika teknis untuk mengonversi data struk menjadi file berekstensi .pdf
        System.out.println("Mencetak bukti pembayaran ke format PDF...");
    }

    public void kirimEmail() {
        // Logika teknis untuk mengirimkan file/teks bukti ke email pengguna
        System.out.println("Mengirim bukti pembayaran via Email...");
    }

    // Getter dan Setter (Standar Enkapsulasi)
    public String getTanggalPelunasan() { return tanggalPelunasan; }
    public Double getTotalDibayar() { return totalDibayar; }
    public String getStatusPembayaran() { return statusPembayaran; }
}
