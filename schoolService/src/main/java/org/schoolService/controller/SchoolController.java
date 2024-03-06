package org.schoolService.controller;

import org.schoolService.entity.School;
import org.schoolService.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RequestMapping(value = "/school")
@RestController
public class SchoolController {
    @Autowired
    private SchoolService schoolService;

    @PostMapping("/createSchool")
    public School addSchool(@RequestBody School school){
        return schoolService.addSchool(school);
    }
    @GetMapping("/getSchools")
    public List<School> fetchSchools(){
        return  schoolService.fetchSchools();
    }
    @GetMapping("/getSchool/{id}")
    public School fetchSchoolById(@PathVariable int id){
        return schoolService.fetchSchoolById(id);
    }
}
