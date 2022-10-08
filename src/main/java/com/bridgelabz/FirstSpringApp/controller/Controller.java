/**
 * Spring Boot Application
 */
package com.bridgelabz.FirstSpringApp.controller;

import com.bridgelabz.FirstSpringApp.Entity.Data;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {
    /**
     *
     * Show Welcome message
     */
    @RequestMapping(value = {"/", "/hello"})
    public String hello() {
        return "Hello from Bridgelabz";
    }

    /**
     * name parameter pass
     */
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello(@RequestParam String name) {
        return "Hello "+ name + " from Bridgelabz " ;
    }

    /**
     * Using path variable for name input
     *
     */
    @RequestMapping(value = "/hello/{name}", method = RequestMethod.GET)
    public String pathhello(@PathVariable String name) {
        return "Hello "+ name + " from Bridgelabz " ;
    }

    @PostMapping("/add-details")
    public String details(@RequestBody Data data){
        return "Hello "+ data.getFirstname() +" "+ data.getLastname();
    }
}
