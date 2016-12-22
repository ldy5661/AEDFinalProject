/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Patient.Patient;
import Business.Role.AdminRole;
import Business.Role.CustomerServiceRole;
import Business.Role.DoctorRole;
import Business.Role.DrugSalesAdminRole;
import Business.Role.HHSAdminRole;
import Business.Role.LabAssistantRole;
import Business.Role.PatientRole;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;

/**
 *
 * @author dongyueli
 */
public class ConfigureASystem {
    
    public static EcoSystem configureABusiness() {
         
        EcoSystem ecoSystem = EcoSystem.getInstance();
        
        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
           
        //set system admin
        Employee employee = ecoSystem.getEmployeeDirectory().createEmployee("LDY");
        UserAccount ua = ecoSystem.getUserAccountDirectory().createUserAccount("aa", "aa", employee, new SystemAdminRole());

        //set network1
        Network n1 = ecoSystem.createAndAddNetwork();
        n1.setName("MA-Massachusetts");
        
        //set enterprise1 of network1
        Enterprise e1 = n1.getEnterpriseDirectory().createAndAddEnterprise("Massachusetts General Hospital", Enterprise.EnterpriseType.Hospital);
        Employee employee1 = e1.getEmployeeDirectory().createEmployee("Emily");
        UserAccount ua1 = e1.getUserAccountDirectory().createUserAccount();
        ua1.setUsername("admin1");
        ua1.setPassword("admin1");
        ua1.setName("Emily");
        ua1.setRole(new AdminRole());
        
        //set organization1 of enterprise1 of network1
        Organization  org1 = e1.getOrganizationDirectory().createOrganization(Organization.Type.Doctor);
        org1.setName("Doctor Department");
        Employee employee11 = org1.getEmployeeDirectory().createEmployee("Doc1");
        UserAccount ua2 = org1.getUserAccountDirectory().createUserAccount();
        ua2.setPassword("doc1");
        ua2.setUsername("doc1");
        ua2.setName("doc1");
        ua2.setEmployee(employee11);
        ua2.setRole(new DoctorRole());
        
        //set organization2 of enterprise1 of network1
        Organization  org2 = e1.getOrganizationDirectory().createOrganization(Organization.Type.Patient);
        org2.setName("Patient Department");
        Patient patient1 = org2.getPatientDirectory().createPtient("Pt1");
        UserAccount ua3 = org2.getUserAccountDirectory().createUserAccount();
        ua3.setPassword("pt1");
        ua3.setUsername("pt1");
        ua3.setName("pt1");
        ua3.setPatient(patient1);
        ua3.setRole(new PatientRole());
        
        Organization  org3 = e1.getOrganizationDirectory().createOrganization(Organization.Type.Lab);
        org3.setName("Lab Department");
        Employee lab1 = org3.getEmployeeDirectory().createEmployee("Lab1");
        UserAccount ua4 = org3.getUserAccountDirectory().createUserAccount();
        ua4.setPassword("lab1");
        ua4.setUsername("lab1");
        ua4.setName("lab1");
        ua4.setEmployee(lab1);
        ua4.setRole(new LabAssistantRole());
        
        Enterprise e2 = n1.getEnterpriseDirectory().createAndAddEnterprise("MA Equipment manufacturer", Enterprise.EnterpriseType.EquipmentManufacturer);
        Employee employee2 = e2.getEmployeeDirectory().createEmployee("Emily1");
        UserAccount ua5 = e2.getUserAccountDirectory().createUserAccount();
        ua5.setUsername("admin2");
        ua5.setPassword("admin2");
        ua5.setName("Emily");
        ua5.setRole(new AdminRole());
        
        Organization  org21 = e2.getOrganizationDirectory().createOrganization(Organization.Type.CustomerService);
        org21.setName("Customer Service Organization");
        Employee cs1 = org21.getEmployeeDirectory().createEmployee("Cs1");
        UserAccount ua6 = org21.getUserAccountDirectory().createUserAccount();
        ua6.setPassword("cs1");
        ua6.setUsername("cs1");
        ua6.setName("cs1");
        ua6.setEmployee(cs1);
        ua6.setRole(new CustomerServiceRole());
        
        Enterprise e3 = n1.getEnterpriseDirectory().createAndAddEnterprise("CVS Pharmacy", Enterprise.EnterpriseType.Pharmacy);
        Employee employee3 = e3.getEmployeeDirectory().createEmployee("Emily11");
        UserAccount ua7 = e3.getUserAccountDirectory().createUserAccount();
        ua7.setUsername("admin3");
        ua7.setPassword("admin3");
        ua7.setName("Emily11");
        ua7.setRole(new AdminRole());
        
        Organization  org31 = e3.getOrganizationDirectory().createOrganization(Organization.Type.DrugSales);
        org31.setName("Drug Sales Organization");
        Employee ds1 = org31.getEmployeeDirectory().createEmployee("Ds1");
        UserAccount ua8 = org31.getUserAccountDirectory().createUserAccount();
        ua8.setPassword("ds1");
        ua8.setUsername("ds1");
        ua8.setName("ds1");
        ua8.setEmployee(ds1);
        ua8.setRole(new DrugSalesAdminRole());
        
        
        Enterprise e100 = n1.getEnterpriseDirectory().createAndAddEnterprise("Walgreens", Enterprise.EnterpriseType.Pharmacy);
        Employee employee300 = e100.getEmployeeDirectory().createEmployee("Emily11");
        UserAccount ua100 = e100.getUserAccountDirectory().createUserAccount();
        ua100.setUsername("admin100");
        ua100.setPassword("admin100");
        ua100.setName("Emily11");
        ua100.setRole(new AdminRole());
        
        Organization  org100 = e100.getOrganizationDirectory().createOrganization(Organization.Type.DrugSales);
        org100.setName("Drug Sales Organization");
        Employee ds2 = org100.getEmployeeDirectory().createEmployee("Ds2");
        UserAccount ua101 = org100.getUserAccountDirectory().createUserAccount();
        ua101.setPassword("ds2");
        ua101.setUsername("ds2");
        ua101.setName("ds2");
        ua101.setEmployee(ds2);
        ua101.setRole(new DrugSalesAdminRole());
        
        Enterprise e4 = n1.getEnterpriseDirectory().createAndAddEnterprise("Mass Government", Enterprise.EnterpriseType.Government);
        Employee employee4 = e4.getEmployeeDirectory().createEmployee("Emily11");
        UserAccount ua9 = e4.getUserAccountDirectory().createUserAccount();
        ua9.setUsername("admin4");
        ua9.setPassword("admin4");
        ua9.setName("Emily11");
        ua9.setRole(new AdminRole());
        
        Organization  org41 = e4.getOrganizationDirectory().createOrganization(Organization.Type.HHS);
        org41.setName("Health And Human Services Organization");
        Employee hhs1 = org41.getEmployeeDirectory().createEmployee("hhs1");
        UserAccount ua10 = org41.getUserAccountDirectory().createUserAccount();
        ua10.setPassword("hhs1");
        ua10.setUsername("hhs1");
        ua10.setName("hhs1");
        ua10.setEmployee(hhs1);
        ua10.setRole(new HHSAdminRole());
       
        //set network2
        Network n2 = ecoSystem.createAndAddNetwork();
        n2.setName("NY-New York");
        Enterprise e21 = n2.getEnterpriseDirectory().createAndAddEnterprise("New York-Presbyterian", Enterprise.EnterpriseType.Hospital);
        Employee employee211 = e21.getEmployeeDirectory().createEmployee("Linda");
        UserAccount ua11 = e21.getUserAccountDirectory().createUserAccount();
        ua11.setUsername("admin5");
        ua11.setPassword("admin5");
        ua11.setName("Linda");
        ua11.setRole(new AdminRole());
        
        
        
        Organization  org211 = e21.getOrganizationDirectory().createOrganization(Organization.Type.Patient);
        org211.setName("Patient Department");
        Patient patient2 = org211.getPatientDirectory().createPtient("Pt2");
        UserAccount ua12 = org211.getUserAccountDirectory().createUserAccount();
        ua12.setPassword("pt2");
        ua12.setUsername("pt2");
        ua12.setName("pt2");
        ua12.setPatient(patient2);
        ua12.setRole(new PatientRole());
        
        Organization  org212 = e21.getOrganizationDirectory().createOrganization(Organization.Type.Doctor);
        org212.setName("Doctor Department");
        Employee employee212 = org212.getEmployeeDirectory().createEmployee("Doc2");
        UserAccount ua13 = org1.getUserAccountDirectory().createUserAccount();
        ua13.setPassword("doc2");
        ua13.setUsername("doc2");
        ua13.setName("doc2");
        ua13.setEmployee(employee212);
        ua13.setRole(new DoctorRole());
        
        return ecoSystem;
    }       
}
