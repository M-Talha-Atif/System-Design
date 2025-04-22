package org.example.e1.factory;

import org.example.e1.entities.*;

public class OsFactory {


    // adding extra class so we will do changes here, not in the client end
   public  static Os makeObject(String osName){
       if(osName.equals("windows")) return new Windows();
       else if(osName.equals("android")) return new Android();
       else if(osName.equals("apple")) return new Apple();
       else return new Linux();

   }
}
