package tugas.bab7;

public class ANon extends Salon {

    public ANon(String nama, int member) {
        super(nama, member);
    }

    @Override
    public double Total() {
        tot = hargap + hargaj;
        return tot;
    }

    @Override
    public void strukBarang() {
        System.out.println("=========================================");
        System.out.println("\t\tSALON AFN\t\t");
        System.out.println("=========================================");
        System.out.println("Nama Pelanggan\t: " + nama);
        System.out.println("Member\t\t: " + member);
        System.out.println("Jasa Salon\t: " + jasa);
        System.out.println("Produk Salon\t: " + produk);
        System.out.println("Total Harga: " + Total());
        System.out.println("=========================================");

    }
}
