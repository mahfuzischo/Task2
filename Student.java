/*
Mahfuzul Islam Chowdhury
ID:2012020111
Section:C
E-mail:cse_2012020111@lus.ac.bd
Date of submission: 8 Aug 2021
 */
package mahfuz;

public class Student {
    String name;
    int id;
    static String UniversityName = "Leading University";
    Student() {
        System.out.println("defaul constructor");
    }
    Student(int id) {
        System.out.println("Student id : " + id);
    }

        Student(String name , int id)
        {
            this.name = name;
            this.id = id;
            System.out.println("Student Name and ID : " +name + " " +id);
        }
        void display()
         {
        System.out.println(UniversityName);
         }
    }


