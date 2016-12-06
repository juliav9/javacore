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

                for (EmployeeType et : EmployeeType.values()) {
                    if (et.name().equals(person[0])) {
                        Employee emploee = new Employee();
                        emploee.position = et;
                        emploee.name = person[1];
                        emploee.familyName = person[2];
                        emploee.faculty = person[3];
                        all.add(emploee);
                        break;
                    }
                }

                for (StudentType st : StudentType.values()) {
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

    public Person[] find(int type, String searchText) {
        ArrayList<Person> result = new ArrayList<>();
        switch (type) {
            case 1:
                for (Person p : all) {
                    if (p.familyName.contains(searchText) || p.name.contains(searchText)) {
                        result.add(p);
                    }
                }
                break;
            case 2:
                for (Person p : all) {
                    if (Employee.class.isInstance(p) && (p.familyName.contains(searchText) || p.name.contains(searchText) || p.faculty.contains(searchText))) {
                        result.add(p);
                    }
                }
                break;
            case 3:
                for (Person p : all) {
                    if (Student.class.isInstance(p)) {
                        Student s = (Student) p;
                        if (s.familyName.contains(searchText) || s.name.contains(searchText) || s.faculty.contains(searchText) || Integer.toString(s.course).equals(searchText)) {
                            result.add(p);
                        }
                    }
                }
                break;
        }

        Person[] personArr = new Person[result.size()];
        return result.toArray(personArr);
    }
}
