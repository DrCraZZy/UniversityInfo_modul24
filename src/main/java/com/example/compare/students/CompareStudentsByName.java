package com.example.compare.students;

import com.example.model.Student;
import org.apache.commons.lang3.StringUtils;

public class CompareStudentsByName implements CompareStrudents{
    @Override
    public int compare(Student student1, Student student2) {
        return StringUtils.compare(student1.getFullName(), student2.getFullName());
    }
}
