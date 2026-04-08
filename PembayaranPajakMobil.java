public class PembayaranPajakMobil {
    int ccMesin;
    String jenisMobil;
    
public PembayaranPajakMobil(int ccMesin, String jenisMobil) {
    this.ccMesin = ccMesin;
    this.jenisMobil = jenisMobil;
}
public String getJenisMobil() {
    return jenisMobil;
}

public double hitungTagihanPajak() {
    double totalTagihan;
    if (ccMesin <= 1500) {
        totalTagihan = 5000000;
    } else if (ccMesin <= 2500) {
        totalTagihan = 10000000;
    } else {
        totalTagihan = 15000000;
    }
    return totalTagihanPajak;
}
}
