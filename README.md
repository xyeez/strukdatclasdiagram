# budi pingin nge Kos (OOP Java)

## 📌 Deskripsi Kasus
Bisnis kos sering mengalami masalah dalam pencatatan kamar dan penyewa, seperti tidak mengetahui kamar kosong atau sudah terisi. Oleh karena itu, dibuat sistem sederhana berbasis Object-Oriented Programming (OOP) untuk membantu mengelola data kamar dan penyewa secara terstruktur.

---

## 📊 Class Diagram
```mermaid
classDiagram
    class Kos {
        -String nama
        -Kamar kamar
        +tambahKamar(Kamar k)
        +tampilkanKamar()
    }

    class Kamar {
        -int nomor
        -boolean tersedia
        -Penyewa penyewa
        +isiKamar(Penyewa p)
    }

    class Penyewa {
        -String nama
    }

    Kos --> Kamar
    Kamar --> Penyewa


