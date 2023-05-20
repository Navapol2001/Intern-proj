package com.example.demo;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepo;

import java.sql.SQLException;

public class App {
    public static void main(String[] args) throws Exception {
        //get connection
        //query
        //iterate result set and produce
        try(StudentRepo repo = new StudentRepo()) {
            repo.open(); //method connect
//            repo.save(new Student(4, "Jane"));
//            repo.save(new Student(1, "John"));
//            repo.save(new Student(2, "Mary"));
//            repo.save(new Student(3, "Peter"));
            //findAll(repo);
            repo.deleteById(1);

            //repo.findAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private static void findById(StudentRepo repo,Integer id) throws SQLException {
        Student student = repo.findById(id).orElse(null);
        System.out.println(student);
    }
    private static void findAll(StudentRepo repo) throws SQLException {
        repo.findAll().forEach(System.out::println);
    }

    private static void insert(StudentRepo repo) throws SQLException {
        repo.save(new Student(1,"pramoth"));
        repo.save(new Student(2,"Non"));
        repo.save(new Student(3,"Ter"));
        repo.save(new Student(4,"op"));
        repo.save(new Student(5,"Ploy"));
    }
}
