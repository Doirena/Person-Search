/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lt.bit;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author barka
 */
@Service
@Transactional
public class PersonService {

    @Autowired
    private PersonRepository persn;

    public List<Person> search(String keyword) {
        return persn.search(keyword);
    }

    public List<Person> listAll() {
        return persn.findAll();
    }

}
