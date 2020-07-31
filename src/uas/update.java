/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas;

import javax.swing.JOptionPane;

/**
 *
 * @author DEWANET
 */
public class update {

    Koneksi konek = new Koneksi();

    public void update(int ktp, int umur, String nama, String alamat, String kerja, String jk) {

        try {
            konek.koneksi();
            java.sql.Statement statement = konek.con.createStatement();

            String sql_kerja = "update koperasi set Pekerjaan = '" + kerja + "'where KTP = '" + ktp + "'";
            String sql_nama = "update koperasi set Nama = '" + nama + "'where KTP = '" + ktp + "'";
            String sql_umur = "update koperasi set Umur = '" + umur + "'where KTP = '" + ktp + "'";
            String sql_alamat = "update koperasi set Alamat = '" + alamat + "'where KTP = '" + ktp + "'";
            String sql_jk = "update koperasi set Jenis_Kelamin = '" + jk + "'where KTP = '" + ktp + "'";
           
            
            String sql_ktp1 = "update koperasi set KTP = '" + ktp + "'where Nama = '" + nama + "'";
            String sql_ktp2 = "update koperasi set KTP = '" + ktp + "'where Alamat = '" + alamat + "'";
            
            statement.executeUpdate(sql_ktp1);
            statement.executeUpdate(sql_ktp2);
            statement.executeUpdate(sql_nama);
            statement.executeUpdate(sql_umur);
            statement.executeUpdate(sql_alamat);
            statement.executeUpdate(sql_kerja);
            statement.executeUpdate(sql_jk);
          
            statement.close();

            JOptionPane.showMessageDialog(null, "Berhasil Diubah");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
}
