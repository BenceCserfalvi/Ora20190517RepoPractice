/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ora20190517repopractice;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author N007
 */
public class Ora20190517RepoPractice {

    public static void main(String[] args) throws FileNotFoundException {

        Reader.read();
        Collections.sort(Reader.persons,new PersonNameComparator());
        printingPeopleEmailAdressesByCity("Chicago");
    }
    
    public static void printingPeopleEmailAdressesByCity(String city){
        for (Person person : Filter.cityFilter(city, Reader.persons)) {
            System.out.println(person.getEmailAdress());
        }
    }
    

    public static void printPeopleInCity() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Adjon meg egy várost: ");
        String city = sc.nextLine();
        List<Person> cloneList = new ArrayList<>();
        for (Person person : Reader.persons) {
            cloneList.add(person);
        }
        List<Person> peopleInCity = Filter.cityFilter(city, cloneList);
        if (peopleInCity.size() > 0) {
            for (Person person : peopleInCity) {
                System.out.println(person.getName());
            }
        } else {
            System.out.println("Ebben a városban lakó emberről nincs adatunk.");
        }
    }

}
