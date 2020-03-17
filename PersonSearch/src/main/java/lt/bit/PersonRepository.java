/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lt.bit;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author barka
 */
public interface PersonRepository extends JpaRepository<Person, Long> {
           @Query(value = "SELECT p FROM Person p WHERE p.name LIKE '%' || :keyword || '%'"
            + " OR p.birthday LIKE '%' || :keyword || '%'")
    public List<Person> search(@Param("keyword") String keyword);
}
