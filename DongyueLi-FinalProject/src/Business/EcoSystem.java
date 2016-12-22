/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;


import Business.Network.Network;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import java.util.ArrayList;

/**
 *
 * @author Aki
 */
public class EcoSystem  extends Organization{
    private static EcoSystem ecoSystem;
    private ArrayList<Network> networkList;
    
    public static EcoSystem getInstance(){
        if(ecoSystem == null){
            ecoSystem = new EcoSystem();
        }
          return ecoSystem;
    }
    private EcoSystem(){
        super(null);
        networkList  = new ArrayList<>();
    }

    public static EcoSystem getBusiness() {     //////////////
        return ecoSystem;
    }


    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

  
    public Network createAndAddNetwork(){
        Network network = new Network();
        networkList.add(network);
        return network;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {        //现在去了s
        ArrayList <Role> roleList = new ArrayList<>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }
    
    
}


