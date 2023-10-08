package az.iktlab.bookstore.service.impl;

import az.iktlab.bookstore.model.entity.Role;
import az.iktlab.bookstore.model.enums.ERole;
import az.iktlab.bookstore.repository.RoleRepository;
import az.iktlab.bookstore.service.RoleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
@RequiredArgsConstructor
public class RoleServiceImpl implements RoleService {

    private final RoleRepository roleRepository;


    @Override
    public Role findByName(ERole roleName) {
        return roleRepository.findByRoleName(roleName).orElseThrow();
    }
}
