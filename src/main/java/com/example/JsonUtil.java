package com.example;

import com.example.model.Student;
import com.example.model.University;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.util.List;

// https://zetcode.com/java/gson/

public final class JsonUtil {

    public static String StudentToJson(Student student) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        return gson.toJson(student);
    }

    public static Student StudentFromJson(String jsonString) {
        Gson gson = new Gson();
        return gson.fromJson(jsonString, Student.class);
    }

    public static String StudentsToJson(List<Student> students){
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        return gson.toJson(students);
    }

    public static List<Student> StudentsFromJson(String jsonStudents){
        Gson gson = new Gson();
        return gson.fromJson(jsonStudents, new TypeToken<List<Student>>(){}.getType());
    }

    public static String UniversityToJson(University university) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        return gson.toJson(university);
    }

    public static University UniversityFromJson(String jsonUniversity) {
        Gson gson = new Gson();
        return gson.fromJson(jsonUniversity, University.class);
    }

    public static String UniversitiesToJson(List<University> universities){
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        return gson.toJson(universities);
    }

    public static List<University> UniversitiesFromJson(String jsonUniversities){
        Gson gson = new Gson();
        return gson.fromJson(jsonUniversities, new TypeToken<List<University>>(){}.getType());
    }
}
