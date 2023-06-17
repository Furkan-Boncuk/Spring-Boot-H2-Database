package com.furkanboncuk.SpringBootH2Database.repository;

import com.furkanboncuk.SpringBootH2Database.entity.College;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CollegeRepository extends CrudRepository<College, Long> {

}
