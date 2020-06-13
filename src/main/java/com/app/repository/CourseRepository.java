package com.app.repository;
import com.app.model.Course;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = CourseRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = Course.class)
public interface CourseRepository extends DetachableJpaRepository<Course, Long>, CourseRepositoryCustom {
}
