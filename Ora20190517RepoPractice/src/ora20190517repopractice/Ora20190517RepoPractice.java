/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ora20190517repopractice;

import java.io.FileNotFoundException;
import java.util.Collections;

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
    

}
