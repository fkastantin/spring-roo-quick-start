package com.app.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.app.model.Student;

/**
 * = StudentRepositoryImpl
 *
 * Implementation of StudentRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = StudentRepositoryCustom.class)
public class StudentRepositoryImpl extends QueryDslRepositorySupportExt<Student> implements StudentRepositoryCustom{

    /**
     * Default constructor
     */
    StudentRepositoryImpl() {
        super(Student.class);
    }
}