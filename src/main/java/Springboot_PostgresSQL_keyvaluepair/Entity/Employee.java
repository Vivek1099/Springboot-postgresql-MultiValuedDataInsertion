package Springboot_PostgresSQL_keyvaluepair.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Arrays;

@Entity(name="emptable")
public class Employee
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String name;
    String[] phoneno;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getPhoneno() {
        return phoneno;
    }

    public void setPhoneno(String[] phoneno) {
        this.phoneno = phoneno;
    }

}
