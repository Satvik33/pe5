package com.stackroute;

import java.util.Comparator;

public class StudentSorter implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        int compareAge = s2.getAge() - s1.getAge();
        int compareName = s2.getName().compareTo(s1.getName());
        int compareId = s2.getId() - s1.getId();
        if(compareAge == 0){
            if(compareName == 0){
                return compareId;
            }
            else{
                return compareName;
            }
        }
        else {
            return compareAge;
        }
    }
}
