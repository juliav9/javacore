package com.juliazubets.app.homework.lesson18;

import java.io.*;
import java.util.ArrayList;

/**
 * Created by Julia Zubets on 12/2/2016.
 */
public class Catalog {
    ArrayList<Person> all = new ArrayList<>();

    public void readFromFile(String fileName) {
        String line;
        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            while ((line = br.readLine()) != null) {
                String[] person = line.split(",");

                EmployeeType[] employeeTypes = EmployeeType.values();
                StudentType[] studentTypes = StudentType.values();

                for (EmployeeType et : employeeTypes) {
                    if (et.name().equals(person[0])) {
                        Employee employee = new Employee();
                        employee.position = et;
                        employee.name = person[1];
                        employee.familyName = person[2];
                        employee.faculty = person[3];
                        all.add(employee);
                        break;
                    }
                }

                for (StudentType st : studentTypes) {
                    if (st.name().equals(person[0])) {
                        Student student = new Student();
                        student.status = st;
                        student.name = person[1];
                        student.familyName = person[2];
                        student.faculty = person[3];
                        student.course = Integer.parseInt(person[4]);
                        all.add(student);
                    }
                }
            }
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public <T extends Person> Person[] search(Class<T> type, String searchText) {
        ArrayList<Person> result = new ArrayList<>();
        for (Person p : all) {
            if (type.isInstance(p) && p.equal(searchText)) {
                result.add(p);
            }
        }

        Person[] resultArr = new Person[result.size()];
        return result.toArray(resultArr);
    }
}
