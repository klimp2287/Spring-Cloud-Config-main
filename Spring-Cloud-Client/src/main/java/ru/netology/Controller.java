package ru.netology;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Value("${user.role}")
    private String userRole;

    @GetMapping("/role")
    public String getRole() {
        return "Текущая роль: " + userRole;
    }
}