package tugas.bab7;

public class ASilver extends Salon {

    public ASilver(String nama, int member) {
        super(nama, member);
    }

    @Override
    public double Total() {
        diskon = hargap * 0.9;
        tot = (hargaj + hargap) * 0.9;
        return tot;
    }

    @Override
    public void strukBarang() {
        System.out.println("=========================================");
        System.out.println("\t\tSALON AFN\t\t");
        System.out.println("=========================================");
        System.out.println("Nama Pelanggan\t: " + nama);
        System.out.println("Member\t\t: " + member);
        System.out.println("Anda mendapat diskon 10%");
        System.out.println("Jasa Salon\t: " + jasa);
        System.out.println("Produk Salon\t: " + produk);
        System.out.println("Total Harga: " + Total());
        System.out.println("=========================================");

    }
}
