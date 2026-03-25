package co.istad.java.webmvc.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Slf4j
@Controller
@RequestMapping("/templates")
public class TemplateController {
    @GetMapping("/{id}/user/{username}")
    public String index(
            @PathVariable Integer id,
            @PathVariable String username,
            @RequestParam(required = false, defaultValue = "1") Integer point
    ){
        log.info("ID: {}", id);
        log.info("Username: {}", username);
        log.info("Point: {}", point);
        return "home";
    }
}
