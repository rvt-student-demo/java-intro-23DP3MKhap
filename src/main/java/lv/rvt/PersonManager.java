package lv.rvt;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.nio.Buffer;
import java.nio.file.StandardOpenOption;
import java.io.BufferedWriter;

public class PersonManager {

    public static ArrayList<Person> getPersonList() throws Exception {
        BufferedReader reader = Helper.getReader("persons.csv");

        ArrayList<Person> personList = new ArrayList<>();
        String line;

        reader.readLine();
        
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(",");

            String name; 
            String adres;
            int age;
            name = parts[0];
            adres = parts[2];
            age = Integer.valueOf(parts[1]); 
            

            Person person = new Person(name, adres, age);
            personList.add(person);
        }
        return personList;
    }
    
    public static void addPerson(Person person) throws Exception{
        BufferedWriter writer = Helper.getWriter("persons.csv", StandardOpenOption.APPEND);

        writer.newLine();
        writer.write(person.getName() + "," + person.getAge() + "," + person.getAdres()); 
        writer.close();
    
    }


}
