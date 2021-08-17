package knight.arkham.security.controllers;

import knight.arkham.security.services.AppUserService;
import org.springframework.stereotype.Controller;

@Controller
public class AppUserController {

    private final AppUserService appUserService;

    public AppUserController(AppUserService appUserService) {
        this.appUserService = appUserService;
    }
}
