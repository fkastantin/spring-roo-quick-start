package com.app.repository;
import com.app.model.Student;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;
import com.app.dto.StudentSearchDto;
import org.springframework.roo.addon.layers.repository.jpa.annotations.finder.RooFinder;

/**
 * = StudentRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = Student.class, finders = { @RooFinder(value = "findByFirstNameAndLastName", returnType = Student.class, formBean = StudentSearchDto.class) })
public interface StudentRepository extends DetachableJpaRepository<Student, Long>, StudentRepositoryCustom {
}
