/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lt.bit;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author barka
 */
@Controller
public class PersonController {

    @Autowired
    private PersonService person;


    @RequestMapping("/")
    public String viewHomePage(Model model) {


        return "index";
    }

    @RequestMapping("/list")
    public String fullList(Model model) {
        List<Person> listPersons = person.listAll();
        model.addAttribute("listPersons", listPersons);

        return "fullList";
    }

    @RequestMapping("/search")
    public ModelAndView search(@RequestParam String keyword) {
        ModelAndView mav = new ModelAndView("forward:/");
          List<Person> searchResult = person.search(keyword);
          mav.addObject("searchResult", searchResult); 
        return mav;
    }

}
