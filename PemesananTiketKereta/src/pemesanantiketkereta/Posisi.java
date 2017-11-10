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
public class Posisi {
    private int gerbong;
    private int jalur;
    private String namaStasiun; 

    public Posisi(int gerbong, int jalur, String namaStasiun) {
        this.gerbong = gerbong;
        this.jalur = jalur;
        this.namaStasiun = namaStasiun;
    }

    public int getGerbong() {
        return gerbong;
    }

    public void setGerbong(int gerbong) {
        this.gerbong = gerbong;
    }

    public int getJalur() {
        return jalur;
    }

    public void setJalur(int jalur) {
        this.jalur = jalur;
    }

    public String getNamaStasiun() {
        return namaStasiun;
    }

    public void setNamaStasiun(String namaStasiun) {
        this.namaStasiun = namaStasiun;
    }
    
    
}
