package com.luvcode.jobportal.services;

import com.luvcode.jobportal.entity.UsersType;
import com.luvcode.jobportal.reposity.UsersTypeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersTypeService {

    private final UsersTypeRepository usersTypeRepository;

    public UsersTypeService(UsersTypeRepository usersTypeRepository){
        this.usersTypeRepository = usersTypeRepository;


    }

    public List<UsersType> getAll(){
        return usersTypeRepository.findAll();

    }
}
