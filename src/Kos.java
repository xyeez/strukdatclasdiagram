class Kos {
    String nama;
    Kamar kamar; // hanya 1 kamar (biar simple)

    Kos(String nama) {
        this.nama = nama;
    }

    void tambahKamar(Kamar k) {
        this.kamar = k;
    }

    void tampilkanKamar() {
        System.out.println("Kos: " + nama);
        System.out.println("Kamar " + kamar.nomor + " - " +
            (kamar.tersedia ? "Kosong" : "Terisi oleh " + kamar.penyewa.nama));
    }
}

class Kamar {
    int nomor;
    boolean tersedia = true;
    Penyewa penyewa;

    Kamar(int nomor) {
        this.nomor = nomor;
    }

    void isiKamar(Penyewa p) {
        penyewa = p;
        tersedia = false;
    }
}

class Penyewa {
    String nama;

    Penyewa(String nama) {
        this.nama = nama;
    }
}
