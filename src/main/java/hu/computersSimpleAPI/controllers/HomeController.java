package hu.computersSimpleAPI.controllers;

import hu.computersSimpleAPI.domain.Computer;
import hu.computersSimpleAPI.service.ComputerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HomeController {

    @Autowired
    private ComputerService service;

    @GetMapping("/")
    public String home(){
        return "Működik!";
    }

    @GetMapping("/computers")
    public List<Computer> getComputers(){
        return service.getComputers();
    }

    @GetMapping("/computers/{id}")
    public Computer getComputer(@PathVariable("id") int id){
        return service.getComputerBySerial(id);
    }
    @GetMapping("/computers/man/{manufacture}")
    public List<Computer>  getComputerByManufacture(@PathVariable("manufacture") String manufacture){
        return service.getComputersByManufacture(manufacture);
    }

    @PostMapping("/computers")
    public Computer addComputer(@RequestBody Computer computer){
        return service.addComputer(computer);
    }
}
