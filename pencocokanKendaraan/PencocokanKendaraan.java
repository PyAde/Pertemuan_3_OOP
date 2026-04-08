package pencocokanKendaraan;
public class PencocokanKendaraan {
    private final String NIK;
    private final String nomerMesin;
    private final String nomerRangka;
    private final String nomerSTNK;

    public PencocokanKendaraan(String NIK, String nomerMesin, String nomerRangka, String nomerSTNK){
        this.NIK = NIK;
        this.nomerMesin = nomerMesin;
        this.nomerRangka = nomerRangka;
        this.nomerSTNK = nomerSTNK;
    }
    public String pencocokanKendaraan(){
        String hasilPencocokan = "Proses pencocokan STNK: " + this.nomerSTNK + " & NIK: " + this.NIK;
        return hasilPencocokan;

    }
    public boolean validasiData(){
        // data kendaraan asal;
        String NiK = "012345";
        String NomerMesin = "AB-123";
        String NomerRangka = "BC-123";
        String NomerSTNK = "CD-123";

        if(this.NIK.equals(NiK) && this.nomerMesin.equals(NomerMesin) && this.nomerRangka.equals(NomerRangka) && this.nomerSTNK.equals(NomerSTNK)){
            System.out.println("Proses validasi kendaraan berhasil");
            return true;
        } else {
            System.out.println("Proses validasi kendaraan tidak berhasil");
            return false;
        }
    }
}
