package org.codegym.crud_user.repository;

import org.codegym.crud_user.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {
    List<User> userList = new ArrayList<>();
    public UserRepository(){
        User user = new User(1,"Nguyen Tay",19,"Th","Hoc Sinh");
        User user1 = new User(2,"Lu Thi Tuyen",44,"TH","Phu Huynh");
        User user2 = new User(3,"Le Ngoc Binh",44,"TH","Phu Huynh");
        User user3 = new User(4,"Le Thanh Thao",20,"TH","Hoc Sinh");

        userList.add(user);
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
    }
    public List getAllUserList(){
        return userList;
    }
    public void addUserToList(User user){
        userList.add(user);
    }
    public void removeUserFromList(int id){
        User userdelete = finByID(id);
        if (userdelete != null) {
            userList.remove(userdelete);
        }
    }
    public User finByID(int id){
        for (User user : userList){
            if (user.getId() == id){
                return user;
            }
        }
        return null;
    }
    public void EditUser(User user){
        User editUser = finByID(user.getId());
        editUser.getName();
        editUser.getAge();
        editUser.getAddress();
        editUser.getRole();
    }
}
