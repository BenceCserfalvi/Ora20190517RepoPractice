/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ora20190517repopractice;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author progmatic
 */
public class Reader {

    public static ArrayList<Person> persons = new ArrayList<>();

    public static void read() throws FileNotFoundException {
        Scanner sc = new Scanner(new File("us-500.csv"));

        while (sc.hasNextLine()) {
            String[] line = sc.nextLine().split(",");

            String name = "";
            name.concat(line[0]);
            name.concat(" ");
            name.concat(line[1]);

            Person p = new Person(name, line[4], line[10]);
            
            persons.add(p);
        }

    }
}
