/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author sherb
 */
public class ClassA extends ClassAbstraction{
    private int id;
    private String name;
    private int age;
    private  Boolean isMale;
    
    int getID() {
        return id;
    }
    
    void setID(int id) {
        this.id = id;
    }
    
    String getName() {
        return name;
    }
    
    void setName(String name) {
        this.name = name;
    }
    
    int getAge() {
        return age;
    }
    
    void setAge(int age) {
        this.age = age;
    }
    
    Boolean getIsMale() {
        return isMale;
    }
    
    void setIsMale(Boolean isMale) {
        this.isMale = isMale;
    }

    public ClassA(int id, String name, int age, Boolean isMale) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.isMale = isMale;
    }
    
    
    
    void getStudentInfo() {
        System.out.println("The student name is " + name);
        System.out.println("The student age is " + age);
        System.out.println(isMale ? "The student name is male" : "The student name is female");
    }
    
    int getYearOfBirth() {
        int getCurrentYear;
        getCurrentYear = this.getCurrentYear();
        System.out.println(this.isAccept(getCurrentYear - age) ? "Is Accepted" : "Not Accepted");
        return getCurrentYear - age;
    }
    
    private int getCurrentYear() {
        return Calendar.getInstance().get(Calendar.YEAR);
    }

    @Override
    Boolean isAccept(int yearOfBirth) {
        return (yearOfBirth < 2000);
    }
    
    @Override
    void getHisHerCertificate(Boolean getCertificate) {
        System.out.println(getCertificate ? "Yes" : "No");
    }
}

