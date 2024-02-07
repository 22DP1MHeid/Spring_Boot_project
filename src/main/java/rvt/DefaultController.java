package rvt;

import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import rvt.exercises.Person;
import rvt.exercises.Student;
import rvt.temp.A;
import rvt.temp.B;
import rvt.temp.C;

@Controller
public class DefaultController {

    @GetMapping(value = "/")
    String index(@RequestParam(name="name", required=false, defaultValue="null") String name, Model model) {
        return "index";
    }
    
    @GetMapping(value = "/about")
    ModelAndView about(@RequestParam HashMap<String, String> queryStringParams) {

        String name = queryStringParams.get("name");
        String age = queryStringParams.get("age");

        ModelAndView modelAndView = new ModelAndView("about");
        modelAndView.addObject("name", name);
        modelAndView.addObject("age", age);

        return modelAndView;
    }

    public static void testABC() {

        A a = new A();
        B b = new B();
        C c = new C();

        a.a();
        b.b();
        c.c();
    }

    public static void testInheritance() {

        C c = new C();

        c.a();
        c.b();
        c.c();
    }

    public static void testPerson() {

        Person ada = new Person("Ada Lovelace", "24 Maddox St. London W1S 2QN");
        Person esko = new Person("Esko Ukkonen", "Mannerheimintie 15 00100 Helsinki");
        System.out.println(ada);
        System.out.println(esko);
    }

    public static void testStudent() {

        Student ollie = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");
        System.out.println(ollie);
        System.out.println("Study credits " + ollie.credits());
        ollie.study();
        System.out.println("Study credits "+ ollie.credits());
    }
}