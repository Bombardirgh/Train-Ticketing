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
public class Jadwal {
    private String jam;
    private Penumpang[] penumpang = new Penumpang[50];
    private int i = 0;

    public Jadwal(String jam) {
        this.jam = jam;

    }
    
    public void tambahPenumpang(Penumpang p){
        if(penumpang.length <= 50){
            penumpang[i] = p;
            i++;
        } else System.out.println("Kereta Penuh");
    }
    
    
}
