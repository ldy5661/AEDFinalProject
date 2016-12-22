/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Patient.Patient;
import Business.Patient.Record;
import java.util.Date;

/**
 *
 * @author dongyueli
 */
public class PatientDoctorWorkRequest extends WorkRequest {

    private Patient patient;
    private Record Record;
    
    private String testResult;
    
    private String labStatus;
    private String preStatus;
    private String respondStatus;
    private String govStatus;
    private String drugStatus;
    
    private String vsNormalorNot;
    private String ftNormalorNot;
    
    private Date date;
    private String patientName;
    private String responMessage;
    private String labReceiver;
    
    private String drugName;
    private String drugQuantity;
    private String doctorResponseMessage;

    @Override
    public Date getDate() {
        return date;
    }

    public void setDate() {
        this.date = new Date();
    }
    
    public String getTestResult() {
        return testResult;
    }

    public void setTestResult(String testResult) {
        this.testResult = testResult;
    }

    public Patient getThePatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Record getRecord() {
        return Record;
    }

    public void setRecord(Record Record) {
        this.Record = Record;
    }

    public String getLabStatus() {
        return labStatus;
    }

    public void setLabStatus(String labStatus) {
        this.labStatus = labStatus;
    }

    public String getPreStatus() {
        return preStatus;
    }

    public void setPreStatus(String preStatus) {
        this.preStatus = preStatus;
    }

    public String getRespondStatus() {
        return respondStatus;
    }

    public void setRespondStatus(String respondStatus) {
        this.respondStatus = respondStatus;
    }

    public String getGovStatus() {
        return govStatus;
    }

    public void setGovStatus(String govStatus) {
        this.govStatus = govStatus;
    }

    public String getVsNormalorNot() {
        return vsNormalorNot;
    }

    public void setVsNormalorNot(String vsNormalorNot) {
        this.vsNormalorNot = vsNormalorNot;
    }

    public String getFtNormalorNot() {
        return ftNormalorNot;
    }

    public void setFtNormalorNot(String ftNormalorNot) {
        this.ftNormalorNot = ftNormalorNot;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getResponMessage() {
        return responMessage;
    }

    public void setResponMessage(String responMessage) {
        this.responMessage = responMessage;
    }

    public String getLabReceiver() {
        return labReceiver;
    }

    public void setLabReceiver(String labReceiver) {
        this.labReceiver = labReceiver;
    }

    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }

    public String getDrugQuantity() {
        return drugQuantity;
    }

    public void setDrugQuantity(String drugQuantity) {
        this.drugQuantity = drugQuantity;
    }

    public String getDrugStatus() {
        return drugStatus;
    }

    public void setDrugStatus(String drugStatus) {
        this.drugStatus = drugStatus;
    }

    public String getDoctorResponseMessage() {
        return doctorResponseMessage;
    }

    public void setDoctorResponseMessage(String doctorResponseMessage) {
        this.doctorResponseMessage = doctorResponseMessage;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    @Override
    public String toString() {
        return getDate().toString();
    }

    public void setVsNormalorNot(Boolean normalOrNot) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setFtNormalorNot(Boolean needMoreExcerciseOrNot) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
