package Model;

import java.util.Date;
import java.util.List;

public class KTPModel {
    private String nik;
    private String nama;
    private String tempatLahir;
    private Date tanggalLahir;
    private String jenisKelamin;
    private String golonganDarah;

    private String alamat;
    private String rtRw;
    private String kelurahan;
    private String kecamatan;

    private String agama;
    private String statusPerkawinan;
    private List<String> pekerjaan;
    private String kewarganegaraan;
    private String fotoPath;
    private String tandaTanganPath;
    private String berlakuHingga;
    private String kotaPembuatanKTP;
    private Date tanggalPembuatanKTP;

    public KTPModel() {
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getTempatLahir() {
        return tempatLahir;
    }

    public void setTempatLahir(String tempatLahir) {
        this.tempatLahir = tempatLahir;
    }

    public Date getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(Date tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public String getGolonganDarah() {
        return golonganDarah;
    }

    public void setGolonganDarah(String golonganDarah) {
        this.golonganDarah = golonganDarah;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getRtRw() {
        return rtRw;
    }

    public void setRtRw(String rtRw) {
        this.rtRw = rtRw;
    }

    public String getKelurahan() {
        return kelurahan;
    }

    public void setKelurahan(String kelurahan) {
        this.kelurahan = kelurahan;
    }

    public String getKecamatan() {
        return kecamatan;
    }

    public void setKecamatan(String kecamatan) {
        this.kecamatan = kecamatan;
    }

    public String getAgama() {
        return agama;
    }

    public void setAgama(String agama) {
        this.agama = agama;
    }

    public String getStatusPerkawinan() {
        return statusPerkawinan;
    }

    public void setStatusPerkawinan(String statusPerkawinan) {
        this.statusPerkawinan = statusPerkawinan;
    }

    public List<String> getPekerjaan() {
        return pekerjaan;
    }

    public void setPekerjaan(List<String> pekerjaan) {
        this.pekerjaan = pekerjaan;
    }

    public String getKewarganegaraan() {
        return kewarganegaraan;
    }

    public void setKewarganegaraan(String kewarganegaraan) {
        this.kewarganegaraan = kewarganegaraan;
    }

    public String getFotoPath() {
        return fotoPath;
    }

    public void setFotoPath(String fotoPath) {
        this.fotoPath = fotoPath;
    }

    public String getTandaTanganPath() {
        return tandaTanganPath;
    }

    public void setTandaTanganPath(String tandaTanganPath) {
        this.tandaTanganPath = tandaTanganPath;
    }

    public String getBerlakuHingga() {
        return berlakuHingga;
    }

    public void setBerlakuHingga(String berlakuHingga) {
        this.berlakuHingga = berlakuHingga;
    }

    public String getKotaPembuatanKTP() {
        return kotaPembuatanKTP;
    }

    public void setKotaPembuatanKTP(String kotaPembuatanKTP) {
        this.kotaPembuatanKTP = kotaPembuatanKTP;
    }

    public Date getTanggalPembuatanKTP() {
        return tanggalPembuatanKTP;
    }

    public void setTanggalPembuatanKTP(Date tanggalPembuatanKTP) {
        this.tanggalPembuatanKTP = tanggalPembuatanKTP;
    }

    public boolean isValid() {
        return nik != null && !nik.isEmpty() &&
                nama != null && !nama.isEmpty() &&
                tempatLahir != null && !tempatLahir.isEmpty() &&
                tanggalLahir != null &&
                jenisKelamin != null && !jenisKelamin.isEmpty() &&
                alamat != null && !alamat.isEmpty() &&
                fotoPath != null && !fotoPath.isEmpty() &&
                tandaTanganPath != null && !tandaTanganPath.isEmpty();
    }

    @Override
    public String toString() {
        return "Citizen{" +
                "NIK='" + nik + '\'' +
                ", Nama='" + nama + '\'' +
                '}';
    }
}