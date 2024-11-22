
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Acer
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Settings {
    // Membuat koneksi ke database menggunakan metode `getKoneksi` dari kelas `Koneksi`
    Connection conn = Koneksi.getKoneksi();
    // Deklarasi variabel untuk menyimpan pernyataan SQL yang akan dijalankan
    PreparedStatement pst;

    // Metode untuk menambahkan data ke dalam tabel `recipes`
    public String addData(String namaMakan, String bahan, String tutor, String urls, boolean cek) throws SQLException {
        // Mengecek apakah parameter `urls` kosong atau null
        if (urls == null || urls.isEmpty()) {
            urls = "-"; // Mengisi `urls` dengan nilai default "-" jika kosong
        }
        
        // Query SQL untuk menambahkan data ke tabel `recipes`
        String queryTambah = "INSERT INTO recipes VALUES (null, ?, ?, ?, ?);";
        // Menyiapkan pernyataan SQL untuk diisi dengan data
        pst = conn.prepareStatement(queryTambah);
        // Mengisi parameter query dengan data yang diterima
        pst.setString(1, namaMakan); // Nama makanan
        pst.setString(2, bahan);    // Bahan makanan
        pst.setString(3, tutor);    // Tutorial
        pst.setString(4, urls);     // URL gambar atau referensi

        // Menjalankan pernyataan SQL untuk menambahkan data ke database
        int result = pst.executeUpdate(); // Mengembalikan jumlah baris yang dimodifikasi
        if (result > 0) { // Mengecek apakah ada data yang berhasil ditambahkan
            // Jika parameter `cek` bernilai true, tampilkan pesan sukses
            if (cek) {
                JOptionPane.showMessageDialog(null, "Data berhasil ditambahkan", "Sukses", JOptionPane.INFORMATION_MESSAGE);
            } else {
                return null; // Jika `cek` false, tidak ada pesan, langsung keluar
            }
            // Mengembalikan pesan sukses dalam format JSON
            return "{ \"status\": 200, \"message\": \"Sukses Tambah Data\" }";
        } else {
            // Jika data gagal ditambahkan, mengembalikan pesan gagal dalam format JSON
            return "{ \"status\": 500, \"message\": \"Gagal Tambah Data\" }";
        }
    }
}

