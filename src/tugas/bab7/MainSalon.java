package tugas.bab7;

import java.util.Scanner;

public class MainSalon {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ProdukSalon, JasaSalon, Member;
        String nama;
        System.out.println("============ >> SALON AFN << ============\n");
        System.out.print("Masukkan nama: ");
        nama = in.nextLine();
        while (true) {
            System.out.println("\n=============  Produk Salon  =============\n");
            System.out.println("1. Vitamin Rambut = Rp. 86.000 " + "\n2. Masker Wajah = Rp. 140.000" + "\n3. Masker Creambath = Rp. 48.000" + "\n4. Tidak Ada");
            System.out.print("Masukkan pilihan: ");
            ProdukSalon = in.nextInt();
            System.out.println("\n=============  Jasa Salon  =============\n");
            System.out.println("1. Creambath = Rp. 45.000" + "\n2. Potong = Rp. 20.000" + "\n3. Facial = Rp. 58.000" + "\n4. Tidak Ada");
            System.out.print("Masukkan pilihan: ");
            JasaSalon = in.nextInt();
            System.out.println("\n=============  Member Salon  =============\n");
            System.out.println("1. Premium" + "\n2. Gold" + "\n3. Silver" + "\n4. Non Member" + "\n5. Exit");
            System.out.print("Masukkan pilihan: ");
            Member = in.nextInt();

            switch (Member) {
                case 1:
                    Salon afn = new APremium(nama, Member);
                    afn.jasaSalon(JasaSalon);
                    afn.produkSalon(ProdukSalon);
                    afn.getJenisMember(Member);
                    afn.strukBarang();
                    break;
                case 2:
                    Salon afn2 = new AGold(nama, Member);
                    afn2.jasaSalon(JasaSalon);
                    afn2.produkSalon(ProdukSalon);
                    afn2.getJenisMember(Member);
                    afn2.strukBarang();
                    break;
                case 3:
                    Salon afn3 = new ASilver(nama, Member);
                    afn3.jasaSalon(JasaSalon);
                    afn3.produkSalon(ProdukSalon);
                    afn3.getJenisMember(Member);
                    afn3.strukBarang();
                case 4:
                    Salon afn4 = new ANon(nama, Member);
                    afn4.jasaSalon(JasaSalon);
                    afn4.produkSalon(ProdukSalon);
                    afn4.getJenisMember(Member);
                    afn4.strukBarang();
                case 5:
                    System.exit(0);

            }
        }
    }
}
