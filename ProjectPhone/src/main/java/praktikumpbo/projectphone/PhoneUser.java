/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikumpbo.projectphone;

/**
 *Andika Prayoga Siswono_21103012
 * @author andik
 */
public class PhoneUser {
//    attribute
    private Phone phone;
//    Konstruktor
    public PhoneUser(Phone phone) {
        this.phone = phone;
    }
//    method
    void turnOnThePhone() {
        this.phone.powerOn();
    }

    void turnOffThePhone() {
        this.phone.powerOff();
    }

    void makePhoneLouder() {
        this.phone.volumeUp();
    }

    void makePhoneSilent() {
        this.phone.volumeDown();
    }
}
