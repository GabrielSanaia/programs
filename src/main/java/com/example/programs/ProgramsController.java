package com.example.programs;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;

@RestController
@RequestMapping("/programs")
public class ProgramsController {

    @GetMapping("/getPrograms")
    public ArrayList<String> getPrograms(){
        return new ArrayList<>(
                Arrays.asList("Program1", "Program2", "Program3"));
    }
}
