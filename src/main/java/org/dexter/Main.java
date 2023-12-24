package org.dexter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.print.Doc;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        ApplicationContext context =  new ClassPathXmlApplicationContext("spring.xml");

//        Nurse doctor =context.getBean(Nurse.class);
//        Doctor doctor =(Doctor) context.getBean("doctor");  //with id using cassting
//        doctor.assist();
//        System.out.println(doctor.getQualification());
//        doctor.getNurse().assist();

        // using Interface

        Staff staff = context.getBean(Nurse.class);
        staff.assist();


    }
}