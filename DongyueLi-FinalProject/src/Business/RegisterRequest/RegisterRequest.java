/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.RegisterRequest;

import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Patient.Patient;
import Business.Role.Role;

/**
 *
 * @author dongyueli
 */
public class RegisterRequest {
    private String username;
    private String password;
    private Enterprise enterprise;
    private Network network;
    private Organization organization;
    private Role role;
    private String approveOrNot;
    private Patient registerpatient;
    private Employee registerdoctor;
    private String name;
    
    public RegisterRequest(){
        registerdoctor = new Employee();
        registerpatient = new Patient ();
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

    public Enterprise getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
    }

    public Network getNetwork() {
        return network;
    }

    public void setNetwork(Network network) {
        this.network = network;
    }

    public Organization getOrganization() {
        return organization;
    }

    public void setOrganization(Organization organization) {
        this.organization = organization;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getApproveOrNot() {
        return approveOrNot;
    }

    public void setApproveOrNot(String approveOrNot) {
        this.approveOrNot = approveOrNot;
    }

    public Patient getRegisterpatient() {
        return registerpatient;
    }

    public void setRegisterpatient(Patient registerpatient) {
        this.registerpatient = registerpatient;
    }

    public Employee getRegisterdoctor() {
        return registerdoctor;
    }

    public void setRegisterdoctor(Employee registerdoctor) {
        this.registerdoctor = registerdoctor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public String toString(){
        return username;
    }
    
}
