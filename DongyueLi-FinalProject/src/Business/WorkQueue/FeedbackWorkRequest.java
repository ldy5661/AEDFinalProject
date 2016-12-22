/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.UserAccount.UserAccount;
import java.util.Date;

/**
 *
 * @author dongyueli
 */
public class FeedbackWorkRequest extends WorkRequest{
    
    private String feedbackMessage;
    private UserAccount customerService;
    private String satisfied1;
    private String satisfied2;
    private String satisfied3;
    private String satisfied4;
    
    private String verysatisfied1;
    private String verysatisfied2;
    private String verysatisfied3;
    private String verysatisfied4;
    
    private String notsatisfied1;
    private String notsatisfied2;
    private String notsatisfied3;
    private String notsatisfied4;
    
    private Date date;

    @Override
    public Date getDate() {
        return date;
    }

    public void setDate() {
        this.date = new Date();
    }

    public String getFeedbackMessage() {
        return feedbackMessage;
    }

    public void setFeedbackMessage(String feedbackMessage) {
        this.feedbackMessage = feedbackMessage;
    }

    public UserAccount getCustomerService() {
        return customerService;
    }

    public void setCustomerService(UserAccount customerService) {
        this.customerService = customerService;
    }

    public String getSatisfied1() {
        return satisfied1;
    }

    public void setSatisfied1(String satisfied1) {
        this.satisfied1 = satisfied1;
    }

    public String getSatisfied2() {
        return satisfied2;
    }

    public void setSatisfied2(String satisfied2) {
        this.satisfied2 = satisfied2;
    }

    public String getSatisfied3() {
        return satisfied3;
    }

    public void setSatisfied3(String satisfied3) {
        this.satisfied3 = satisfied3;
    }

    public String getSatisfied4() {
        return satisfied4;
    }

    public void setSatisfied4(String satisfied4) {
        this.satisfied4 = satisfied4;
    }

    public String getVerysatisfied1() {
        return verysatisfied1;
    }

    public void setVerysatisfied1(String verysatisfied1) {
        this.verysatisfied1 = verysatisfied1;
    }

    public String getVerysatisfied2() {
        return verysatisfied2;
    }

    public void setVerysatisfied2(String verysatisfied2) {
        this.verysatisfied2 = verysatisfied2;
    }

    public String getVerysatisfied3() {
        return verysatisfied3;
    }

    public void setVerysatisfied3(String verysatisfied3) {
        this.verysatisfied3 = verysatisfied3;
    }

    public String getVerysatisfied4() {
        return verysatisfied4;
    }

    public void setVerysatisfied4(String verysatisfied4) {
        this.verysatisfied4 = verysatisfied4;
    }

    public String getNotsatisfied1() {
        return notsatisfied1;
    }

    public void setNotsatisfied1(String notsatisfied1) {
        this.notsatisfied1 = notsatisfied1;
    }

    public String getNotsatisfied2() {
        return notsatisfied2;
    }

    public void setNotsatisfied2(String notsatisfied2) {
        this.notsatisfied2 = notsatisfied2;
    }

    public String getNotsatisfied3() {
        return notsatisfied3;
    }

    public void setNotsatisfied3(String notsatisfied3) {
        this.notsatisfied3 = notsatisfied3;
    }

    public String getNotsatisfied4() {
        return notsatisfied4;
    }

    public void setNotsatisfied4(String notsatisfied4) {
        this.notsatisfied4 = notsatisfied4;
    }

    @Override
    public String toString() {
        return date.toString(); //To change body of generated methods, choose Tools | Templates.
    }

          
}
