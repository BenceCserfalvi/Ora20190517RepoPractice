/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ora20190517repopractice;

/**
 *
 * @author N007
 */
public class Person {
    
    private String name;
    private int age;
    private String city;
    private String emailAdress;
    private String homeAdress;

    public Person(String name, int age, String city, String emailAdress, String homeAdress) {
        this.name = name;
        this.age = age;
        this.city = city;
        this.emailAdress = emailAdress;
        this.homeAdress = homeAdress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getEmailAdress() {
        return emailAdress;
    }

    public void setEmailAdress(String emailAdress) {
        this.emailAdress = emailAdress;
    }

    public String getHomeAdress() {
        return homeAdress;
    }

    public void setHomeAdress(String homeAdress) {
        this.homeAdress = homeAdress;
    }
    
    
    
    
}
