/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

/**
 *
 * @author Admin
 */
public class NgoBaoChanh_59130155_StrateryPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cong cong = new Cong();
        System.out.println(" 17 +19 = " +cong.tinh(17, 19));
        Tru tru = new Tru();
        System.out.println("26 - 13 = " +tru.tinh(26,13));
        Nhan nhan = new Nhan();
        System.out.println(" 17*19 = " +nhan.tinh(17, 19));
    }
}
