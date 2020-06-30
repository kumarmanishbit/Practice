package com.mani.soni;

import java.io.*;

public class TestSerializable {
    
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Employee emp = new Employee();
        emp.setAddress("Hyderabad");
        emp.setAge((byte) 31);
        emp.setName("Manish");
        System.out.println(emp.whoIsThis());

        FileOutputStream fout = new FileOutputStream("/Users/kumam8/Documents/Personal/manish.ser");
        ObjectOutputStream obj = new ObjectOutputStream(fout);
        obj.writeObject(emp);

        obj.close();
        System.out.println("Completed");


        FileInputStream fin = new FileInputStream("/Users/kumam8/Documents/Personal/manish.ser");
        ObjectInputStream oin = new ObjectInputStream(fin);

        Employee emp1 = (Employee) oin.readObject();

        oin.close();
        System.out.println(emp1.whoIsThis());

    }
}
