// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.app.web;

import com.app.model.Course;
import com.app.web.StudentJsonMixin;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Set;

privileged aspect StudentJsonMixin_Roo_JSONMixin {
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    @JsonIgnore
    private Set<Course> StudentJsonMixin.registeredCourses;
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return Set
     */
    public Set<Course> StudentJsonMixin.getRegisteredCourses() {
        return registeredCourses;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param registeredCourses
     */
    public void StudentJsonMixin.setRegisteredCourses(Set<Course> registeredCourses) {
        this.registeredCourses = registeredCourses;
    }
    
}
