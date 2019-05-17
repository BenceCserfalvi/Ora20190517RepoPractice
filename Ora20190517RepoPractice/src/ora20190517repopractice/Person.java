package ora20190517repopractice;

/**
 *
 * @author N007
 */
public class Person {
    
    private String name;
    private String city;
    private String emailAdress;

    public Person(String name, String city, String emailAdress) {
        this.name = name;
        this.city = city;
        this.emailAdress = emailAdress;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public String getEmailAdress() {
        return emailAdress;
    }
    
}
