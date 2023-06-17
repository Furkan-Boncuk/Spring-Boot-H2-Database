package com.furkanboncuk.SpringBootH2Database.controller;

import com.furkanboncuk.SpringBootH2Database.entity.College;
import com.furkanboncuk.SpringBootH2Database.repository.CollegeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/college")
public class CollegeController {

    private CollegeRepository collegeRepository;

    @Autowired
    public CollegeController(CollegeRepository theCollegeRepository) {
        this.collegeRepository = theCollegeRepository;
    }

    @PostMapping("/save")
    public String saveCollege(@RequestBody College college) {
        collegeRepository.save(college);
        return "College data saved successfully...";
    }

    @GetMapping("/get")
    public ResponseEntity<List<College>> getCollege() {
        List<College> collegeList = new ArrayList<>();
        collegeRepository.findAll().forEach(collegeList::add);
        return new ResponseEntity<>(collegeList, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteCollegeById(@PathVariable("id") long id) {
        collegeRepository.deleteById(id);
        return "College record with "+id+" deleted successfully...";
    }

    @PutMapping("/update/{id}")
    public String updateCollegeById(@PathVariable("id") long id, @RequestBody College college) {
        Optional<College> oldCollege = collegeRepository.findById(id);
        if(oldCollege.isPresent()) {
            college.setCollegeId(id);
            collegeRepository.save(college);
            return "College details with "+id+" updated successfully...";
        } else {
            return "College details with "+id+" not found...";
        }
    }

}
