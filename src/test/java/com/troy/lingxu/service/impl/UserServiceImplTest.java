package com.troy.lingxu.service.impl;

import com.troy.lingxu.model.dto.UserDTO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceImplTest {

    @Autowired
    UserServiceImpl userServiceImpl;

    /*@Test
    public void getUserTest(){
        UserDTO user = userServiceImpl.getUser(12345L);
        System.out.println(user);
    }*/



}
