package com.registerer.student.dao;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.registerer.student.model.StudentInfo;
@Repository
public interface StudentDataEntryRepository extends CrudRepository<StudentInfo, Integer> {

}
