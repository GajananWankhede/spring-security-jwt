package com.med.jwt.service.services;

import com.med.jwt.service.dao.RoleRepository;
import com.med.jwt.service.entity.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class RoleService {

    @Autowired
    private RoleRepository roleRepository;

    public Role createNewRole(Role role){
        return roleRepository.save(role);
    }
}
