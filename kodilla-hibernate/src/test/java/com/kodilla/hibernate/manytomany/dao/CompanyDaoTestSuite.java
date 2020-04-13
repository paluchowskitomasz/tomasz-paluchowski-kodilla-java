package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CompanyDaoTestSuite {
    @Autowired
    CompanyDao companyDao;
    @Autowired
    EmployeeDao employeeDao;

    @Test
    public void testSaveManyToMany(){
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");

        softwareMachine.getEmployees().add(johnSmith);
        dataMaesters.getEmployees().add(stephanieClarckson);
        dataMaesters.getEmployees().add(lindaKovalsky);
        greyMatter.getEmployees().add(johnSmith);
        greyMatter.getEmployees().add(lindaKovalsky);

        johnSmith.getCompanies().add(softwareMachine);
        johnSmith.getCompanies().add(greyMatter);
        stephanieClarckson.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(greyMatter);

        //When
        companyDao.save(softwareMachine);
        int softwareMachineId = softwareMachine.getId();
        companyDao.save(dataMaesters);
        int dataMaestersId = dataMaesters.getId();
        companyDao.save(greyMatter);
        int greyMatterId = greyMatter.getId();

        //Then
        Assert.assertNotEquals(0, softwareMachineId);
        Assert.assertNotEquals(0, dataMaestersId);
        Assert.assertNotEquals(0, greyMatterId);

        //CleanUp
        try {
            companyDao.deleteById(softwareMachineId);
            companyDao.deleteById(dataMaestersId);
            companyDao.deleteById(greyMatterId);
        } catch (Exception e) {
            //do nothing
        }
    }

    @Test
    public void testFindEmployeesByName(){
        //Given
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee maryClarckson = new Employee("Mary", "Clarckson");

        Company softwareMachine = new Company("Software Machine");

        softwareMachine.getEmployees().add(stephanieClarckson);
        softwareMachine.getEmployees().add(maryClarckson);

        stephanieClarckson.getCompanies().add(softwareMachine);
        maryClarckson.getCompanies().add(softwareMachine);

        //When
        companyDao.save(softwareMachine);
        int softwareMachineId = softwareMachine.getId();
        List<Employee> employeesByLastName = employeeDao.findEmployeesByLastName("Clarckson");

        try {
            //Then
            Assert.assertEquals(2, employeesByLastName.size());

        } finally {
            //CleanUp
            companyDao.deleteById(softwareMachineId);
        }
    }

    @Test
    public void testFindCompanyByThreeFirstLetter(){

        //Given
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        Company softwareMachine = new Company("Software Machine");
        Company softwareProduction = new Company("Software Production");
        Company dataMaesters = new Company("Data Maesters");


        softwareMachine.getEmployees().add(johnSmith);
        softwareProduction.getEmployees().add(lindaKovalsky);
        dataMaesters.getEmployees().add(stephanieClarckson);
        dataMaesters.getEmployees().add(lindaKovalsky);


        johnSmith.getCompanies().add(softwareMachine);
        stephanieClarckson.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(softwareProduction);

        //When
        companyDao.save(softwareMachine);
        int softwareMachineId = softwareMachine.getId();
        companyDao.save(dataMaesters);
        int dataMaestersId = dataMaesters.getId();

        List<Company> companyFirstThreeLetters = companyDao.findCompanyByThreeFirstLetter("Sof");

        try {
            //Then
            Assert.assertEquals(2, companyFirstThreeLetters.size());

        } finally {
            //CleanUp
            companyDao.deleteById(softwareMachineId);
            companyDao.deleteById(dataMaestersId);

        }
    }
}
