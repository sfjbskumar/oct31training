package com.rama.db.controller;

import com.rama.db.model.Users;
import com.rama.db.repository.UsersRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class UserControllerTest {
    @InjectMocks
    private UsersController usersController;

    @Mock
    private UsersRepository usersRepository;

    @Test
    public void getAllTest(){
        Users user1=new Users();
        user1.setId(1);
        user1.setName("test");
        user1.setSalary(20000);
        user1.setTeamName("test1");
        List<Users> usersList=new ArrayList<>();
        usersList.add(user1);
        when(usersRepository.findAll()).thenReturn(usersList);
        List<Users> results= (List<Users>) usersController.getAll();
        Users result =results.get(0);
        assertEquals(1,result.getId());
        assertEquals("test",result.getName());
        assertEquals(20000,result.getSalary());
        assertEquals("test1",result.getTeamName());

    }

    @Test
    public void storeTest(){

    }

}
