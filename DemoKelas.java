public class DemoKelas {
    public static void main(String[]args){
        Siswa Ayaa = new Siswa("Ayaa");

        Kelas k = new Kelas(Ayaa);

        Siswa nunu = new Siswa("Nunu");
        k.tambahDiBelakang(nunu);
        k.tambahDiBelakang(new Siswa("Nana"));
        k.tambahDiBelakang(new Siswa("Yaya"));
        k.tambahDiBelakang(new Siswa("Koi"));
        k.tampilkanSemua();

        System.out.println("\nJumlah siswa : "+ k.jumlahSiswa());
        System.out.println("Siswa di index 2 : "+ k.ambilDi(2).nama);
        System.out.println("Urutan Nunu : "+ k.urutan("Nunu"));

        System.out.println("\nMenghapus 'Nana'...");
        k.hapus("Nana");

        System.out.println("\nSetelah penghapusan:");
        k.tampilkanSemua();

        System.out.println("\nJumlah siswa sekarang : " + k.jumlahSiswa());
    }
}
