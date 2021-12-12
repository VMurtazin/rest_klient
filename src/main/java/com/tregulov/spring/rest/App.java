package com.tregulov.spring.rest;

import com.tregulov.spring.rest.configuration.MyConfig;
import com.tregulov.spring.rest.entity.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        System.out.println( "Wait..." );
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(MyConfig.class);
        Communication communication=context.getBean("communication", Communication.class);


//        List<Employee> allEmployees=communication.getAllEmployees();
//        System.out.println(allEmployees);

        Employee empById=communication.getEmployee(5);
        System.out.println(empById);

//        Employee emp=new Employee(5,"Slava","Ivanov","IT",1550);
//        communication.saveEmployee(emp);

        communication.deleteEmploye(5);

    }
}
