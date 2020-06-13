// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.app.model;

import com.app.model.Course;
import com.app.model.Student;
import io.springlets.format.EntityFormat;
import javax.persistence.Entity;
import org.springframework.util.Assert;

privileged aspect Student_Roo_Jpa_Entity {
    
    declare @type: Student: @Entity;
    
    declare @type: Student: @EntityFormat;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String Student.ITERABLE_TO_ADD_CANT_BE_NULL_MESSAGE = "The given Iterable of items to add can't be null!";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String Student.ITERABLE_TO_REMOVE_CANT_BE_NULL_MESSAGE = "The given Iterable of items to add can't be null!";
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param registeredCoursesToAdd
     */
    public void Student.addToRegisteredCourses(Iterable<Course> registeredCoursesToAdd) {
        Assert.notNull(registeredCoursesToAdd, ITERABLE_TO_ADD_CANT_BE_NULL_MESSAGE);
        for (Course item : registeredCoursesToAdd) {
            this.registeredCourses.add(item);
            item.getStudents().add(this);
        }
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param registeredCoursesToRemove
     */
    public void Student.removeFromRegisteredCourses(Iterable<Course> registeredCoursesToRemove) {
        Assert.notNull(registeredCoursesToRemove, ITERABLE_TO_REMOVE_CANT_BE_NULL_MESSAGE);
        for (Course item : registeredCoursesToRemove) {
            this.registeredCourses.remove(item);
            item.getStudents().remove(this);
        }
    }
    
}
