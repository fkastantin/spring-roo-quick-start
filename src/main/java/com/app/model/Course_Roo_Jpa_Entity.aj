// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.app.model;

import com.app.model.Course;
import io.springlets.format.EntityFormat;
import javax.persistence.Entity;

privileged aspect Course_Roo_Jpa_Entity {
    
    declare @type: Course: @Entity;
    
    declare @type: Course: @EntityFormat;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String Course.ITERABLE_TO_ADD_CANT_BE_NULL_MESSAGE = "The given Iterable of items to add can't be null!";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String Course.ITERABLE_TO_REMOVE_CANT_BE_NULL_MESSAGE = "The given Iterable of items to add can't be null!";
    
}
