package kz.aitu.oop.controller;

import kz.aitu.oop.examples.FileReader;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileNotFoundException;

@RestController
@RequestMapping("/api/test")
public class TestController {


    @GetMapping("/test")
    public ResponseEntity<?> getUserByID() throws FileNotFoundException {

        FileReader fileReader = new FileReader();

        return ResponseEntity.ok(fileReader.getFile());
    }
}
