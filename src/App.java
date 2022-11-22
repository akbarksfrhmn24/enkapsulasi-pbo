class Manusia{
    private String nama;
    private Uang uang;

    Manusia(String nilai){
        this.nama=nilai;
    }

    public void setUang(Uang uang){
        this.uang=uang;
    }

    public void status(){
        System.out.println("Nama : "+this.nama);
        System.out.println("Punya uang "+this.uang.getUang());
    }

    public String getNama(){
        return this.nama;
    }

    public void gantiNama(String nama){
        this.nama = nama;
    }
}

class Uang{
    private int kembalian;
    private int uang;
    private Manusia manusia;
    private Barang barang;

    Uang(){
        this.uang = 100000;
    }

    public int getUang(){
        return this.uang;
    }

    public void setManusia(Manusia manusia){
        this.manusia=manusia;
    }

    public void gantiUang(int uang) {
        this.uang = uang;
    }

    public void beli(){
        System.out.println("Saya membeli "+this.barang.getNama()+" seharga "+this.barang.getHarga());
        if (this.uang > this.barang.getHarga()){
            kembalian = this.uang - this.barang.getHarga();
        }else{
            kembalian = 0;
            this.uang-=kembalian;
        }
    }

    public int getKembalian(){
        return kembalian;
    }

    public void setBarang(Barang barang){
        this.barang=barang;
    }

}

class Barang{
    private String nama;
    private int harga;

    Barang(String nilai,int value){
        this.nama=nilai;
        this.harga=value;
    }

    public int getHarga(){
        return this.harga;
    }

    public String getNama(){
        return this.nama;
    }

    public void gantiBarang(String nilai, int value) {
        this.nama = nilai;
        this.harga = value;
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Manusia orang1 = new Manusia("Gian");
        Barang barang1 = new Barang("Tas", 75000);
        Uang nominal1 = new Uang();
        orang1.setUang(nominal1);
        nominal1.setManusia(orang1);
        orang1.status();
        nominal1.setBarang(barang1);
        nominal1.beli();
        System.out.println("Uang kembalian adalah " + nominal1.getKembalian());
        System.out.println("\n=========Manusia Baru=========\n");
        orang1.gantiNama("Akbar");
        nominal1.gantiUang(70000);
        barang1.gantiBarang("Baju", 20000);
        orang1.status();
        nominal1.beli();
        System.out.println("Uang kembalian adalah " + nominal1.getKembalian());
    }
}
