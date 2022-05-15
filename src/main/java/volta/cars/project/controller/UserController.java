package volta.cars.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import volta.cars.project.model.UserModel;
import volta.cars.project.service.UserService;

@RestController
@RequestMapping("/api/v1")
public class UserController {
    @Autowired
    private UserService service;



    @GetMapping("/userMembers")
    public ResponseEntity<Iterable<UserModel>> retrieveAll() {
        return ResponseEntity.ok().body(service.retrieveAll());
    };

    @PostMapping("/userMembers")
    public ResponseEntity<String> createUserMember(
            @RequestBody UserModel model,
            BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return new ResponseEntity<String>("{\"result\" : \"KO\"}", HttpStatus.BAD_REQUEST);
        } else {
            service.createUserMember(model);
            return new ResponseEntity<String>("{\"result\" : \"OK\"}", HttpStatus.OK);
        }
    }
}