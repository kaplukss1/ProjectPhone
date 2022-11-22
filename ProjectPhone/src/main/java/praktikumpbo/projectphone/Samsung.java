/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikumpbo.projectphone;

/**
 *Andika Prayoga Siswono_21103012
 * @author andik
 */
public class Samsung implements Phone {
//    attribute
    private int volume;
    private boolean isPowerOn;
//    konstruktor
    public Samsung() {
        // set volume awal
        this.volume = 50;
    }
//    method
    public void powerOn() {
        isPowerOn = true;
        System.out.println("Handphone menyala...");
        System.out.println("Selamat datang di Samsung");
        System.out.println("Android version 29");
    }
    public void powerOff() {
        isPowerOn = false;
        System.out.println("Handphone dimatikan");
    }
    public void volumeUp() {
        if (isPowerOn) {
            if (this.volume == MAX_VOLUME) {
                System.out.println("Volume FULL!!");
                System.out.println("sudah " + this.getVolume() + "%");
            } else {
                this.volume += 10;
                System.out.println("Volume sekarang: " + this.getVolume());
            }
        } else {
            System.out.println("Nyalakan dulu donk HP-nya!!");
        }
    }
    public void volumeDown() {
        if (isPowerOn) {
            if (this.volume == MIN_VOLUME) {
                System.out.println("Volume = 0%");
            } else {
                this.volume -= 10;
                System.out.println("Volume sekarang: " + this.getVolume());
            }
        } else {
            System.out.println("Nyalakan dulu donk HP-nya!!");
        }
    }
    public int getVolume() {
        return this.volume;
    }
}
