package az.iktlab.bookstore.service;

import az.iktlab.bookstore.model.entity.Role;
import az.iktlab.bookstore.model.enums.ERole;

import java.util.Optional;

public interface RoleService {

    Role findByName(ERole roleName);
}
