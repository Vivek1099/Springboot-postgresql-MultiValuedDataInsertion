package Springboot_PostgresSQL_keyvaluepair.Repository;

import Springboot_PostgresSQL_keyvaluepair.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface Repository extends JpaRepository<Employee,Integer>
{
    @Query(value = "SELECT * FROM emptable WHERE ?1 = ANY(phoneno)", nativeQuery = true)
    List<Employee> findByPhoneNumber(@Param("phoneNumber") String phoneNumber);
}
