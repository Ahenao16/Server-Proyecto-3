package com.example.demo.Controller;

import com.example.demo.Model.Driver;
import com.example.demo.XML;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/server")
public class RegisterController {

    private final XML xml;

    @Autowired
    public RegisterController(XML xml){
        this.xml = xml;

    }

    @PostMapping("/driver/register")
    public ResponseEntity registerNewDriver(@RequestBody Driver driver) {
        xml.registerUser("driver", driver);

        return new ResponseEntity<>("Driver registered successfully", HttpStatus.OK);
    }
}
