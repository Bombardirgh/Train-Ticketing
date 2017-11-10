/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pemesanantiketkereta;

/**
 *
 * @author AdityaEM
 */
public class Kereta {
    private String nama;
    private String noKursi;
    private String kelas;
    private Posisi posisi;
    private Jadwal[] jadwal; 
    private int i=0;
 
    public Kereta(String nama, String noKursi, String kelas) {
        this.jadwal = jadwal;
        this.nama = nama;
        this.noKursi = noKursi;
        this.kelas = kelas;
    }
    
    public void tambahJadwal(String jam){
        Jadwal j = new Jadwal(jam);
        jadwal[i] = j;
        i++;
    }

    public void pindahPosisi(String namaStasiun, int gerbong, int jalur){
        this.posisi.setNamaStasiun(namaStasiun);
        this.posisi.setGerbong(gerbong);
        this.posisi.setJalur(jalur);
    }
    
}
