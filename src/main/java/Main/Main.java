
package Main;

import Controller.Controller;
import Models.UserInfoModel;
import Views.UserInfoView;


public class Main {
    
    public static void main(String[] args) {
        
        UserInfoModel pdm = new UserInfoModel("osa",24);
        UserInfoView pdv = new UserInfoView();
        
        Controller controller = new Controller(pdm,pdv);
        
        controller.updateView();
        
        
        
        
    }
    
}
