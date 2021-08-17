package knight.arkham.security.services;

import knight.arkham.security.repositories.AppUserRepository;
import knight.arkham.security.repositories.RoleRepository;
import org.springframework.stereotype.Service;

@Service
public class AppUserService {

    private final AppUserRepository appUserRepository;

    private final RoleRepository roleRepository;

    public AppUserService(AppUserRepository appUserRepository, RoleRepository roleRepository) {
        this.appUserRepository = appUserRepository;
        this.roleRepository = roleRepository;
    }
}
