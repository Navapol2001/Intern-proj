package com.example.demo.repository;

import com.example.demo.model.Student;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StudentRepo implements AutoCloseable{
    private Connection conn;
    @Override
    public void close() throws Exception {
        System.out.println("Closing connection");
        if(conn != null) {
            conn.close();
            System.out.println("Connection closed");
        }
    }

    public void open() throws SQLException {
        conn = DriverManager.getConnection("jdbc:h2:./target/db;AUTO_SERVER=TRUE", "sa", "sa");
    }

    public void save(Student st) throws SQLException {
        if (conn == null) {
            throw new IllegalStateException("must call open() first");
        }
        try (Statement statement = conn.createStatement()) { //normal statement
            String sql = String.format("insert into student(id, name) values(%d, '%s')", st.getId(), st.getName());
            System.out.println(sql);
            statement.executeUpdate(sql);
            //statement.executeUpdate("insert into student(id, name) values(" + st.getId() + ", '" + st.getName() + "')"); //create table student(id int, name varchar(255))
        }
    }
    public Optional<Student> findById(Integer id) throws SQLException {
        try (PreparedStatement statement = conn.prepareStatement("select id,name from student where id=?")) { //prepate statement
            statement.setInt(1, id);
            ResultSet rs = statement.executeQuery();
            if (rs.next()) {
                int id1 = rs.getInt("id");
                String name = rs.getString("name");
                Student student = new Student(id1, name);
                return Optional.of(student);
            } else {
                return Optional.empty();
            }
        }
        //return Optional.empty();
    }
    public List<Student> findAll() throws SQLException {
        List<Student> students = new ArrayList<>();
        try (PreparedStatement statement = conn.prepareStatement("select id,name from student")) { //prepate statement
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                int id1 = rs.getInt("id");
                String name = rs.getString("name");
                Student student = new Student(id1, name);
                students.add(student);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return students;
    }

    public void deleteById(int id) throws SQLException {
        if (conn == null) {
            throw new IllegalStateException("must call open() first");
        }
        try (Statement statement = conn.createStatement()) { //normal statement
            String sql = String.format("delete from student where id=%d", id);
            System.out.println(sql);
            statement.executeUpdate(sql);
        }
    }
}
