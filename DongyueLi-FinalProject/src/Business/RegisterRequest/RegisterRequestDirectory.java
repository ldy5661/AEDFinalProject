/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.RegisterRequest;

import java.util.ArrayList;



/**
 *
 * @author dongyueli
 */
public class RegisterRequestDirectory {
    
    private ArrayList<RegisterRequest> registerRequestList;

    public RegisterRequestDirectory() {
        registerRequestList = new ArrayList<>();
    }

    public ArrayList<RegisterRequest> getRegisterRequestList() {
        return registerRequestList;
    }

    public void setRegisterRequestList(ArrayList<RegisterRequest> registerRequestList) {
        this.registerRequestList = registerRequestList;
    }
    
    public RegisterRequest createRegisterRequest() {
        RegisterRequest registerRequest = new RegisterRequest();
        registerRequestList.add(registerRequest);
        return registerRequest;
    }
    
}
