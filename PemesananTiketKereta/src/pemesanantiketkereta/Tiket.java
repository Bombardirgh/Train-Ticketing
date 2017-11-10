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
public class Tiket {
    private String jamBerangkat;
    private String tglBerangkat;
    private String tujuan;
    private String asal;

    public Tiket(String jamBerangkat, String tglBerangkat, String tujuan, String asal) {
        this.jamBerangkat = jamBerangkat;
        this.tglBerangkat = tglBerangkat;
        this.tujuan = tujuan;
        this.asal = asal;
    }
    
    
}
