package View;

import javax.swing.*;
import java.awt.*;

public class KTPResultView extends JFrame {
    private JLabel nikLabel, namaLabel, tempatTanggalLahirLabel, jenisKelaminLabel, golDarahLabel;
    private JLabel alamatLabel, rtRwLabel, kelurahanLabel, kecamatanLabel, agamaLabel;
    private JLabel statusPerkawinanLabel, pekerjaanLabel, kewarganegaraanLabel;
    private JLabel berlakuHinggaLabel, kotaTanggalPembuatanLabel;
    private JLabel fotoLabel, tandaTanganLabel;

    public KTPResultView() {
        setTitle("Hasil Data KTP");
        setSize(500, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(15, 1, 10, 10));

        add(new JLabel("Provinsi DKI Jakarta, Jakarta Barat"));
        add(new JLabel("Republik Harapan Bangsa"));

        nikLabel = new JLabel();
        namaLabel = new JLabel();
        tempatTanggalLahirLabel = new JLabel();
        jenisKelaminLabel = new JLabel();
        golDarahLabel = new JLabel();
        alamatLabel = new JLabel();
        rtRwLabel = new JLabel();
        kelurahanLabel = new JLabel();
        kecamatanLabel = new JLabel();
        agamaLabel = new JLabel();
        statusPerkawinanLabel = new JLabel();
        pekerjaanLabel = new JLabel();
        kewarganegaraanLabel = new JLabel();
        berlakuHinggaLabel = new JLabel();
        kotaTanggalPembuatanLabel = new JLabel();
        fotoLabel = new JLabel("Foto: (Ditampilkan)");
        tandaTanganLabel = new JLabel("Tanda Tangan: (Ditampilkan)");

        add(new JLabel("Data KTP:"));
        add(nikLabel);
        add(namaLabel);
        add(tempatTanggalLahirLabel);
        add(jenisKelaminLabel);
        add(golDarahLabel);
        add(alamatLabel);
        add(rtRwLabel);
        add(kelurahanLabel);
        add(kecamatanLabel);
        add(agamaLabel);
        add(statusPerkawinanLabel);
        add(pekerjaanLabel);
        add(kewarganegaraanLabel);
        add(berlakuHinggaLabel);
        add(kotaTanggalPembuatanLabel);
        add(fotoLabel);
        add(tandaTanganLabel);
    }

    public void setKTPData(String nik, String nama, String ttl, String jenisKelamin, String golDarah,
                           String alamat, String rtRw, String kelurahan, String kecamatan, String agama,
                           String statusPerkawinan, String pekerjaan, String kewarganegaraan,
                           String berlakuHingga, String kotaTanggalPembuatan, String fotoPath, String tandaTanganPath) {
        nikLabel.setText("NIK: " + nik);
        namaLabel.setText("Nama: " + nama);
        tempatTanggalLahirLabel.setText("TTL: " + ttl);
        jenisKelaminLabel.setText("Jenis Kelamin: " + jenisKelamin);
        golDarahLabel.setText("Golongan Darah: " + golDarah);
        alamatLabel.setText("Alamat: " + alamat);
        rtRwLabel.setText("RT/RW: " + rtRw);
        kelurahanLabel.setText("Kelurahan: " + kelurahan);
        kecamatanLabel.setText("Kecamatan: " + kecamatan);
        agamaLabel.setText("Agama: " + agama);
        statusPerkawinanLabel.setText("Status Perkawinan: " + statusPerkawinan);
        pekerjaanLabel.setText("Pekerjaan: " + pekerjaan);
        kewarganegaraanLabel.setText("Kewarganegaraan: " + kewarganegaraan);
        berlakuHinggaLabel.setText("Berlaku Hingga: " + berlakuHingga);
        kotaTanggalPembuatanLabel.setText("Kota/Tanggal Pembuatan: " + kotaTanggalPembuatan);
        fotoLabel.setText("Foto: " + fotoPath);
        tandaTanganLabel.setText("Tanda Tangan: " + tandaTanganPath);
    }
}
