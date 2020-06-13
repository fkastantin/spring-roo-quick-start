package com.app.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.app.model.Course;

/**
 * = CourseRepositoryImpl
 *
 * Implementation of CourseRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = CourseRepositoryCustom.class)
public class CourseRepositoryImpl extends QueryDslRepositorySupportExt<Course> implements CourseRepositoryCustom{

    /**
     * Default constructor
     */
    CourseRepositoryImpl() {
        super(Course.class);
    }
}