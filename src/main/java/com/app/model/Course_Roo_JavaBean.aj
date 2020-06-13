// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.app.model;

import com.app.model.Course;
import com.app.model.Student;
import java.util.Objects;
import java.util.Set;

privileged aspect Course_Roo_JavaBean {
    
    /**
     * Gets id value
     * 
     * @return Long
     */
    public Long Course.getId() {
        return this.id;
    }
    
    /**
     * Sets id value
     * 
     * @param id
     * @return Course
     */
    public Course Course.setId(Long id) {
        this.id = id;
        return this;
    }
    
    /**
     * Gets version value
     * 
     * @return Integer
     */
    public Integer Course.getVersion() {
        return this.version;
    }
    
    /**
     * Sets version value
     * 
     * @param version
     * @return Course
     */
    public Course Course.setVersion(Integer version) {
        this.version = version;
        return this;
    }
    
    /**
     * Gets courseName value
     * 
     * @return String
     */
    public String Course.getCourseName() {
        return this.courseName;
    }
    
    /**
     * Sets courseName value
     * 
     * @param courseName
     * @return Course
     */
    public Course Course.setCourseName(String courseName) {
        this.courseName = courseName;
        return this;
    }
    
    /**
     * Gets students value
     * 
     * @return Set
     */
    public Set<Student> Course.getStudents() {
        return this.students;
    }
    
    /**
     * Sets students value
     * 
     * @param students
     * @return Course
     */
    public Course Course.setStudents(Set<Student> students) {
        this.students = students;
        return this;
    }
    
    /**
     * This `equals` implementation is specific for JPA entities and uses 
     * the entity identifier for it, following the article in 
     * https://vladmihalcea.com/2016/06/06/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
     * 
     * @param obj
     * @return Boolean
     */
    public boolean Course.equals(Object obj) {
        if (this == obj) {
            return true;
        }
        // instanceof is false if the instance is null
        if (!(obj instanceof Course)) {
            return false;
        }
        return getId() != null && Objects.equals(getId(), ((Course) obj).getId());
    }
    
    /**
     * This `hashCode` implementation is specific for JPA entities and uses a fixed `int` value to be able 
     * to identify the entity in collections after a new id is assigned to the entity, following the article in 
     * https://vladmihalcea.com/2016/06/06/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
     * 
     * @return Integer
     */
    public int Course.hashCode() {
        return 31;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return String
     */
    public String Course.toString() {
        return "Course {" + 
                "id='" + id + '\'' + 
                ", version='" + version + '\'' + 
                ", courseName='" + courseName + '\'' + "}" + super.toString();
    }
    
}
