package com.mtm.examples.serialization;

import java.io.*;

// 1. Only objects that support java.io.Serializable interface can be written to streams.
// 2. All wrapper class and String implements java.io.Serializable interface
// 3. static and transient members are not serialized

class Employee implements Serializable {

    private static final long serialVersionUID = 1L;
    static String company = "Infosys";
    Integer empId;
    String empName;
    transient Integer age;

    public Employee(Integer empId, String empName, Integer age) {
        this.empId = empId;
        this.empName = empName;
        this.age = age;
    }
}

public class SerializeAndDeserializeDemo {

    public static void main(String[] args) throws Exception {
        Employee s1 = new Employee(176664, "Manjunath", 25);

        // Serialize
        FileOutputStream fout = new FileOutputStream("/Users/Manjunath_MT/Desktop/output.txt");
        ObjectOutputStream out = new ObjectOutputStream(fout);

        out.writeObject(s1);
        out.flush();
        out.close();
        System.out.println("Serialized o/p: SUCCESS");

        // Deserialize
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("/Users/Manjunath_MT/Desktop/output.txt"));
        Employee emp = (Employee) in.readObject();
        System.out.println("\nDeserialized o/p:\n" + "ID: " + emp.empId + "\nName: " + emp.empName);
        in.close();
    }

}
