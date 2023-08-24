package com.sayan.jdbc2.Helper;

public class Query {
    static String insert = "insert into student (id,name,roll,marks) values(?,?,?,?);";
    static String read = "select * from student where id = ?";
    static String update = "update student set name=?,roll=?,marks=? where id=?;";
    static  String delete = "delete from student where id = ?";

    public static String getInsert() {
        return insert;
    }

    public static String getRead() {
        return read;
    }

    public static String getUpdate() {
        return update;
    }

    public static String getDelete() {
        return delete;
    }
}
