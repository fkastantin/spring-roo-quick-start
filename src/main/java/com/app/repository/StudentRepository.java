package com.app.repository;
import com.app.model.Student;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = StudentRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = Student.class)
public interface StudentRepository extends DetachableJpaRepository<Student, Long>, StudentRepositoryCustom {
}
