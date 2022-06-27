/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Models.UserInfoModel;
import Views.UserInfoView;

public class Controller {

    UserInfoModel m;
    UserInfoView v;

    public Controller(UserInfoModel m, UserInfoView v) {
        this.m = m;
        this.v = v;
    }
   public void setName(String name){
       this.m.setName(name);
   }
   public void setAge(int age){
       this.m.setAge(age);
   }
   public void updateView(){
       v.viewUserInfo(m.getuserName(),m.getuserAge());
   }
}
