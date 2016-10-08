package ua.belogod.mySpring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import ua.belogod.mySpring.beans.Person;

/**
 * Created by Belogod on 05.10.2016.
 */
@Controller
public class MainController {
    @RequestMapping (value = "/", method = RequestMethod.GET)
    public ModelAndView main(){
        Person person = new Person("Viktor", 36);
        return new ModelAndView("index").addObject("person", person);
    }
    @RequestMapping (value = "/qwe")
    public ModelAndView  abc (@RequestParam(name = "name")String name, @RequestParam(name = "age") int age){
        return new ModelAndView("second").addObject("person", new Person(name, age));
    }
@RequestMapping (value = "/asd")
    public String method() {
    return "another";}

}
