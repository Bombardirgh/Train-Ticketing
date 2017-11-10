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
public class Penumpang {
    private String nama;
    private String alamat;
    private String gender;
    private Tiket[] tiket;
    private int i=0;

    public Penumpang(String nama, String alamat, String gender) {
        this.nama = nama;
        this.alamat = alamat;
        this.gender = gender;
    }
    
    public void tambahTiket(Tiket t){
        tiket[i] = t;
        i++;
    }
    
    public void showAllTiket(){
        for(int j = 0; j < tiket.length;j++){
            System.out.println();
        }
    }
}
