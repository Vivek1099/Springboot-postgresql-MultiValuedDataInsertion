package Springboot_PostgresSQL_keyvaluepair.Controller;

import Springboot_PostgresSQL_keyvaluepair.Entity.Employee;
import Springboot_PostgresSQL_keyvaluepair.Repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeController
{
    @Autowired
    Repository erepo;

    @RequestMapping("/test")
    public String test()
    {
        return "This is demo test";
    }

    @RequestMapping("/save")
    public String save(@RequestBody Employee employee)
    {
        erepo.save(employee);
        return "data saved";
    }

    @RequestMapping("/all")
    public List<Employee> showall()
    {
        return erepo.findAll();
    }

    @RequestMapping("/{id}")
    public Optional<Employee> ById(@PathVariable int id)
    {
        return erepo.findById(id);
    }

    @RequestMapping("/search/{phoneno}")
    public List<Employee> ByPhoneno(@PathVariable String phoneno)
    {
        return erepo.findByPhoneNumber(phoneno);
    }
}
