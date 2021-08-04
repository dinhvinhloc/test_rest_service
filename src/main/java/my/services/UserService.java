/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.services;

import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import my.models.User;

/**
 *
 * @author Owner
 */
@Path("usersService")
@Produces("application/json")
public class UserService {
    
    @GET
    @Path("users")
    @Produces("application/json")
    public List<User> getComment(){
        List<User> users = new ArrayList<>();
        
        for(int i=1;i<=10;i++){
            User user = new User();
            user.setId(i);
            user.setName("User_" + i);
            user.setAddress("Street " + i + ", Toronto, ON");
            
            users.add(user);
        }
        
        return users;
    }

    
}
