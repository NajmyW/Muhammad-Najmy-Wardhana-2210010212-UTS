# Aplikasi Resep Makanan

Aplikasi ini adalah sebuah tugas akademik yang dibuat menggunakan **Apache NetBeans** dengan Java GUI berbasis JFrame. Aplikasi ini memungkinkan pengguna untuk mencari resep makanan secara online melalui API, menampilkan data resep, dan mengelola data tersebut.

## Fitur Utama

### 1. Form API - **Cari Resep Online**
- Pengguna dapat mencari resep makanan menggunakan API dari [anabot.my.id](https://anabot.my.id/).
- Hasil pencarian akan menampilkan:
  - Nama Makanan
  - URL Referensi dari [Cookpad](https://cookpad.com/)
  - Daftar Bahan-bahan
  - Cara Membuat
- Data resep dapat disimpan ke dalam database lokal.

### 2. Form Resep Makanan - **Manajemen Data Resep**
- Pengguna dapat menambahkan data resep secara manual:
  - Nama Makanan
  - Daftar Bahan
  - Cara Membuat
  - URL Referensi
- Mendukung fitur pengelolaan data:
  - **Tambah**: Simpan data baru.
  - **Edit**: Mengubah data resep yang ada.
  - **Hapus**: Menghapus data dari database.
  - **Cari**: Mencari data dari database.
  - **Export PDF**: Mengekspor data ke dalam file PDF.
  - **Import/Export CSV**: Mengimpor dan mengekspor data dalam format CSV.
  - **Reset**: Mengosongkan form input.

## Teknologi yang Digunakan

- **Java**: Bahasa pemrograman utama untuk aplikasi ini.
- **Apache NetBeans**: IDE untuk pengembangan aplikasi.
- **MySQL**: Sebagai database untuk menyimpan data resep.
- **API**: Menggunakan [anabot.my.id](https://anabot.my.id/) untuk mengambil data resep makanan secara online.
- **Cookpad**: URL referensi yang ditampilkan untuk resep makanan.
- **iText PDF**: Untuk membuat dan mengekspor file PDF.
- **CSV**: Untuk impor/ekspor data dalam format CSV.


## library yang Digunakan:
   - `mysql-connector-j-9.1.0.jar`
   - `json-20230618.jar`
   - `urlencoder.jar`
   - `itextpdf-5.5.9.jar`
   - `commons-lang3-3.17.0.jar`

## Struktur Proyek

### Source Packages
- `FormCariResep_API.java`: Menangani pencarian resep menggunakan API.
- `FormSearchFood.java`: Menampilkan dan mengelola data resep makanan.
- `Koneksi.java`: Mengelola koneksi ke database.
- `Settings.java`: Mengatur konfigurasi API dan database.

### Libraries
- `mysql-connector-j-9.1.0.jar`: Untuk koneksi ke database MySQL.
- `json-20230618.jar`: Parsing data JSON dari API.
- `urlencoder.jar`: Untuk encoding URL.
- `itextpdf-5.5.9.jar`: Membuat file PDF.
- `commons-lang3-3.17.0.jar`: Library utilitas tambahan untuk Java.

## Sumber Data

- **[anabot.my.id](https://anabot.my.id/)**: API untuk mengambil data resep makanan.
- **[Cookpad](https://cookpad.com/)**: URL referensi untuk resep makanan.

## Kontributor

- **Nama Anda** - Mahasiswa/Tugas Akademik

## Lisensi

Proyek ini menggunakan lisensi MIT. Anda bebas untuk menggunakan, memodifikasi, dan mendistribusikan proyek ini.

---

Happy coding! 🚀