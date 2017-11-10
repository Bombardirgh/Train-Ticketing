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
public class Booking extends Tiket{
    private int kodeBooking;

    public Booking(String jamBerangkat, String tglBerangkat, String tujuan, String asal) {
        super(jamBerangkat, tglBerangkat, tujuan, asal);
    }
}
