package com.james.sprintbatch.demo.config;
 
import com.james.sprintbatch.demo.model.Employee;
import org.springframework.batch.item.ItemProcessor;

public class DBLogProcessor implements ItemProcessor<Employee, Employee>
{
    public Employee process(Employee employee) throws Exception
    {
        System.out.println("Inserting employee : " + employee);
        return employee;
    }
}