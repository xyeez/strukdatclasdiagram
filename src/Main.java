public class Main {
    public static void main(String[] args) {

        Kos kos = new Kos("Kos AHAS");

        Kamar kamar1 = new Kamar(1);
        Penyewa penyewa1 = new Penyewa("Budi");

        kamar1.isiKamar(penyewa1);

        kos.tambahKamar(kamar1);
        kos.tampilkanKamar();
    }
}
