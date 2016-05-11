package tugas.bab7;

public abstract class Salon {

    protected String nama, member, pil, jasa, produk;
    protected int p;
    protected double hargaj, hargap, diskon, tot;

    public Salon(String nama, int member) {
        this.nama = nama;
        this.p = p;
    }

    public String getNama() {
        return nama;
    }

    public String getPil() {
        return pil;
    }

    public void getJenisMember(int p) {
        if (p == 1) {
            member = "Premium";
        } else if (p == 2) {
            member = "Gold";
        } else if (p == 3) {
            member = "Silver";
        } else if (p == 4) {
            member = "Non Anggota";
        }
    }

    public String getMember() {
        return member;
    }

    public void jasaSalon(int j) {
        switch (j) {
            case 1:
                jasa = "Creambath\t: Rp. 45.000";
                hargaj = 45000;
                break;
            case 2:
                jasa = "Potong\t: Rp. 20.000";
                hargaj = 20000;
                break;
            case 3:
                jasa = "Facial\t: Rp. 58.000";
                hargaj = 58000;
                break;
            default:
                System.out.println("Masukkan anda salah");
        }
    }

    public void produkSalon(int p) {
        switch (p) {
            case 1:
                produk = "Vitamin Rambut\t: Rp. 86.000";
                hargap = 86000;
                System.out.println(produk);
                break;
            case 2:
                produk = "Masker Wajah\t: Rp. 140.000";
                hargap = 140000;
                System.out.println(produk);
                break;
            case 3:
                produk = "Masker Creambath\t: Rp. 48.000";
                hargap = 48000;
                System.out.println(produk);
                break;
            default:
                System.out.println("Masukkan anda salah");
        }
    }

    public abstract void strukBarang();

    public abstract double Total();
}
