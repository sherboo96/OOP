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
public class ClassB extends ClassA implements ClassInterface{

    public ClassB(int id, String name, int age, Boolean isMale) {
        super(id, name, age, isMale);
    }
    
    void print() {
        System.out.println("Class B");
    }

    @Override
    public int calculateExpectedGraduate(int yearOfBirth) {
        int _yearOfBirth = yearOfBirth;
        return _yearOfBirth + 22;
    }
}
