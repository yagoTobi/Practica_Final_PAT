package volta.cars.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import volta.cars.project.model.NewsletterModel;
import volta.cars.project.service.NewsletterService;

@RestController
@RequestMapping("/api/v1")
public class NewsletterController {
    @Autowired
    private NewsletterService service;

    @GetMapping("/newsletterMembers")
    public ResponseEntity<Iterable<NewsletterModel>> retrieveAll()
    {
        return ResponseEntity.ok().body(service.retrieveAll());
    };
}
