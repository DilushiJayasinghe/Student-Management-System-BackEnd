package edu.icet.repository;

import edu.icet.dto.Student;
import edu.icet.entity.StudentEntity;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<StudentEntity,Long>{

}
