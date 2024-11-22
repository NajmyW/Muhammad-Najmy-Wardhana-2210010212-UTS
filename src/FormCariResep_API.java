
import java.awt.Image;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Acer
 */
public class FormCariResep_API extends javax.swing.JFrame {
    // Referensi ke FormSearchFood untuk komunikasi antar form
    private final FormSearchFood formSearchFood;

    /**
     * Konstruktor untuk FormCariResep_API
     * @param formSearchFood - Referensi ke form utama (FormSearchFood)
     */
    public FormCariResep_API(FormSearchFood formSearchFood) {
        // Inisialisasi komponen GUI
        initComponents();

        // Inisialisasi model tabel dengan kolom "Nama Makanan" dan "Url"
        tableModel = new DefaultTableModel(new String[]{"Nama Makanan", "Url"}, 0);

        // Menghubungkan model tabel ke komponen tabel di GUI
        tableResep.setModel(tableModel);

        // Menyimpan referensi ke form utama untuk komunikasi antar form
        this.formSearchFood = formSearchFood;
    }

    // Deklarasi model tabel untuk menyimpan dan menampilkan data di tabel
    private final DefaultTableModel tableModel;

    // Objek Settings untuk mengelola data (misalnya, penyimpanan, pengambilan, dll.)
    Settings data = new Settings();
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        inputMakan = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        btnSimpan = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        iconFoto = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableResep = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1290, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.NORTH);

        jPanel2.setBackground(new java.awt.Color(102, 102, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 24))); // NOI18N
        jPanel2.setLayout(new java.awt.GridBagLayout());

        jPanel3.setBackground(new java.awt.Color(102, 102, 0));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "FORM CARI RESEP ONLINE", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 24), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel3.setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nama Makanan :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(10, 13, 13, 0);
        jPanel3.add(jLabel1, gridBagConstraints);

        jButton2.setText("Detail");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.insets = new java.awt.Insets(13, 13, 13, 13);
        jPanel3.add(jButton2, gridBagConstraints);

        jButton3.setText("Keluar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 9;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.insets = new java.awt.Insets(13, 13, 13, 13);
        jPanel3.add(jButton3, gridBagConstraints);

        inputMakan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputMakanActionPerformed(evt);
            }
        });
        inputMakan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                inputMakanKeyReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.ipadx = 150;
        gridBagConstraints.insets = new java.awt.Insets(13, 13, 13, 0);
        jPanel3.add(inputMakan, gridBagConstraints);

        jButton1.setText("Cari");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new java.awt.GridBagConstraints());

        btnSimpan.setText("Simpan");
        btnSimpan.setEnabled(false);
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 5;
        jPanel3.add(btnSimpan, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(22, 22, 22, 22);
        jPanel2.add(jPanel3, gridBagConstraints);

        jPanel4.setLayout(new java.awt.GridLayout(1, 0));

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jPanel4.add(jScrollPane2);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 500;
        gridBagConstraints.ipady = 200;
        gridBagConstraints.insets = new java.awt.Insets(22, 22, 22, 22);
        jPanel2.add(jPanel4, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridheight = 10;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(22, 22, 22, 22);
        jPanel2.add(iconFoto, gridBagConstraints);

        jPanel5.setLayout(new java.awt.GridLayout());

        tableResep.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tableResep);

        jPanel5.add(jScrollPane1);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridheight = 10;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 500;
        gridBagConstraints.ipady = 200;
        jPanel2.add(jPanel5, gridBagConstraints);

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        dispose(); //untuk menutup JFrame yang aktif
    }//GEN-LAST:event_jButton3ActionPerformed

    private void inputMakanKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputMakanKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_inputMakanKeyReleased

    private void inputMakanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputMakanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputMakanActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // Mendapatkan indeks baris yang dipilih oleh pengguna pada tabel `tableResep`
        int row = tableResep.getSelectedRow();
        // Mengambil nilai dari kolom kedua (index 1) pada baris yang dipilih
        // Kemudian memanggil metode `getDetail` dengan parameter nilai dari kolom tersebut
        getDetail(tableResep.getValueAt(row, 1).toString());
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Mengecek apakah field inputMakan kosong
        if (inputMakan.getText().isEmpty()) {
            // Menampilkan pesan peringatan kepada pengguna jika field kosong
            JOptionPane.showMessageDialog(
                null, 
                "Mohon Isi pencarian Nama Makanan nya!", // Pesan error
                "Gagal Mencari Nama Makanan",          // Judul dialog
                JOptionPane.INFORMATION_MESSAGE        // Tipe pesan (informasi)
            );
        } else {
            // Menghapus ikon pada komponen iconFoto (jika ada)
            iconFoto.setIcon(null);

            // Mengosongkan teks pada komponen jTextArea1
            jTextArea1.setText("");

            // Menonaktifkan tombol Simpan agar tidak bisa diklik
            btnSimpan.setEnabled(false);

            // Memanggil metode getDataAPIs dengan parameter teks dari inputMakan
            // Fungsi ini kemungkinan digunakan untuk mengambil data dari API berdasarkan nama makanan
            getDataAPIs(inputMakan.getText());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        // Mendapatkan indeks baris yang dipilih di tabel `tableResep`
       int row = tableResep.getSelectedRow();

       // Mengambil nilai dari kolom pertama (Nama Makanan) dan kedua (URL) pada baris yang dipilih
       String namaMakanan = tableResep.getValueAt(row, 0).toString();
       String urls = tableResep.getValueAt(row, 1).toString();

       // Validasi: Memastikan nama makanan tidak kosong
       if (namaMakanan.isEmpty()) {
           // Menampilkan pesan peringatan jika nama makanan kosong
           JOptionPane.showMessageDialog(
               null,
               "Mohon pilih salah satu!", // Pesan peringatan
               "Gagal Menyimpan",         // Judul dialog
               JOptionPane.INFORMATION_MESSAGE // Jenis pesan
           );
       } else {
           // Mendapatkan bahan dari teks di `jTextArea1` (diambil dari bagian "Bahan-Bahan")
           String bahan = jTextArea1.getText().split("Bahan-Bahan :")[1].split("Cara Membuat :")[0];

           // Mendapatkan tutorial/cara membuat dari teks di `jTextArea1` (diambil dari bagian "Cara Membuat")
           String tutor = jTextArea1.getText().split("Cara Membuat :")[1];

           try {
               // Memanggil metode `addData` pada objek `data` untuk menambahkan data ke database
               data.addData(namaMakanan, bahan, tutor, urls, true);

               // Memperbarui tabel di form utama (`formSearchFood`)
               formSearchFood.refreshTable();

               // Menutup form saat ini setelah data berhasil disimpan
               dispose();
           } catch (SQLException ex) {
               // Menangkap dan mencetak pesan error jika terjadi masalah dengan SQL
               Logger.getLogger(FormCariResep_API.class.getName()).log(Level.SEVERE, null, ex);
           }
       }
    }//GEN-LAST:event_btnSimpanActionPerformed
private void getDetail(String text) {
    try {
        // Membuat URL API berdasarkan teks yang diberikan
        String apiUrl = "https://anabot.my.id/api/search/detail/resepKoki?urlresep=" + text + "&apikey=tugasUTS";

        // Membuat objek URL dan membuka koneksi HTTP
        URL url = new URL(apiUrl);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET"); // Mengatur metode request sebagai GET

        StringBuilder response;
        try (
            // Membaca respon dari API menggunakan BufferedReader
            BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()))
        ) {
            response = new StringBuilder();
            String line;
            while ((line = in.readLine()) != null) {
                response.append(line); // Menyimpan respon dalam bentuk string
            }
        }

        // Parsing respon JSON
        JSONObject jsonResponse = new JSONObject(response.toString()); // Membuat objek JSON dari respon
        JSONObject suggestion = jsonResponse.getJSONObject("result");  // Mengambil objek "result"

        // Mengambil data bahan, tutorial, dan URL gambar dari JSON
        String bahan = suggestion.getString("bahan");
        String tutor = suggestion.getString("tutorial");
        String img = suggestion.getString("image");

        // Menampilkan bahan dan cara membuat pada `jTextArea1`
        jTextArea1.setText("Bahan-Bahan :\n    " + bahan + "\n\nCara Membuat : \n " + tutor);

        // Mengaktifkan tombol Simpan
        btnSimpan.setEnabled(true);

        // Mengambil URL gambar dari JSON dan membaca gambar
        URL urls = new URL(img);
        ImageIcon originalIcon = new ImageIcon(ImageIO.read(urls));

        // Menentukan ukuran maksimum untuk ikon gambar
        int maxWidth = 450;  // Lebar maksimum
        int maxHeight = 450; // Tinggi maksimum

        // Mengubah ukuran ikon gambar agar sesuai dengan dimensi maksimum
        Image imgs = originalIcon.getImage();
        Image scaledImg = imgs.getScaledInstance(maxWidth, maxHeight, Image.SCALE_SMOOTH);

        // Menampilkan gambar yang sudah diubah ukurannya pada `iconFoto`
        iconFoto.setIcon(new ImageIcon(scaledImg));
    } catch (IOException | JSONException ex) {
        // Menampilkan pesan error jika terjadi kesalahan
        JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
}

    private void getDataAPIs(String text) {
    try {
        // Membuat URL API dengan parameter pencarian
        // `text.replace(" ", "%20")` mengganti spasi dengan '%20' agar sesuai dengan format URL
        String apiUrl = "https://anabot.my.id/api/search/resepKoki?resep=" + text.replace(" ", "%20") + "&apikey=tugasUTS";

        // Membuat objek URL dan membuka koneksi HTTP
        URL url = new URL(apiUrl);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET"); // Mengatur metode request sebagai GET

        StringBuilder response;
        try (
            // Membaca respon dari API menggunakan BufferedReader
            BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()))
        ) {
            response = new StringBuilder();
            String line;
            while ((line = in.readLine()) != null) {
                response.append(line); // Menyimpan respon dalam bentuk string
            }
        }

        // Parsing respon JSON
        JSONObject jsonResponse = new JSONObject(response.toString()); // Membuat objek JSON dari respon
        JSONArray suggestions = jsonResponse.getJSONArray("result");  // Mengambil array "result" dari JSON

        // Menghapus semua baris yang ada di tabel
        DefaultTableModel model = (DefaultTableModel) tableResep.getModel();
        model.setRowCount(0);

        // Iterasi setiap objek dalam array "result" dan menambahkan ke tabel
        for (int i = 0; i < suggestions.length(); i++) {
            JSONObject suggestion = suggestions.getJSONObject(i); // Mengambil objek JSON
            String value = suggestion.getString("title");          // Mengambil judul resep
            String urls = suggestion.getString("url");             // Mengambil URL resep

            // Menambahkan baris ke tabel
            model.addRow(new Object[]{value, urls});
        }

    } catch (IOException | JSONException ex) {
        // Menampilkan pesan error jika terjadi masalah
        JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
}

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormCariResep_API.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormCariResep_API.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormCariResep_API.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormCariResep_API.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
//                new FormCariResep_API().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSimpan;
    private javax.swing.JLabel iconFoto;
    private javax.swing.JTextField inputMakan;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTable tableResep;
    // End of variables declaration//GEN-END:variables
}