/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

/**
 *
 * @author sherb
 */
public abstract class ClassAbstraction {
    
    abstract Boolean isAccept(int yearOfBirth);
    
    void getHisHerCertificate(Boolean getCertificate) {
        System.out.println(getCertificate ? "Yes" : "No");
    }
}
