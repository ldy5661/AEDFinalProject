/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.Employee.Employee;
import Business.Patient.Patient;
import Business.RegisterRequest.RegisterRequestDirectory;
import Business.Role.Role;
import Business.WorkQueue.WorkQueue;

/**
 *
 * @author dongyueli
 */
public class UserAccount {
    private String username;
    private String password;
    private Employee employee;
    private Patient patient;
    private Role role;
    private WorkQueue workQueue;
    private RegisterRequestDirectory registerRequestDirectory;
    private String name;
    
    
    public UserAccount() {
        workQueue = new WorkQueue();
        registerRequestDirectory = new RegisterRequestDirectory();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    public RegisterRequestDirectory getRegisterRequestDirectory() {
        return registerRequestDirectory;
    }

    public void setRegisterRequestDirectory(RegisterRequestDirectory registerRequestDirectory) {
        this.registerRequestDirectory = registerRequestDirectory;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return username;
    }
    
}
