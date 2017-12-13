package me.degunawan.latihanrcyclerview;

/**
 * Created by tik on 12/13/17.
 */

public class Presiden {
    String nama;
    String ke_berapa;
    String masa_jabatan;
    String more_info;

    public String getGambar_presiden() {
        return gambar_presiden;
    }

    public void setGambar_presiden(String gambar_presiden) {
        this.gambar_presiden = gambar_presiden;
    }

    String gambar_presiden;

    public Presiden(String nama, String ke_berapa, String masa_jabatan, String more_info, String gambar_presiden) {
        this.nama = nama;
        this.ke_berapa = ke_berapa;
        this.masa_jabatan = masa_jabatan;
        this.more_info = more_info;
        this.gambar_presiden = gambar_presiden;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKe_berapa() {
        return ke_berapa;
    }

    public void setKe_berapa(String ke_berapa) {
        this.ke_berapa = ke_berapa;
    }

    public String getMasa_jabatan() {
        return masa_jabatan;
    }

    public void setMasa_jabatan(String masa_jabatan) {
        this.masa_jabatan = masa_jabatan;
    }

    public String getMore_info() {
        return more_info;
    }

    public void setMore_info(String more_info) {
        this.more_info = more_info;
    }
}
