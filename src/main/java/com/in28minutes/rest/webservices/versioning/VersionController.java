package com.in28minutes.rest.webservices.versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersionController {
    @GetMapping("/personv1")
    public Person versionPersonV1() {
        return new Person("Ghirmay Shinash");
    }
    @GetMapping("/personv2")
    public PersonTwo versionP2() {
        return new PersonTwo(new Name("Ghirmay", "Shinash"));
    }
    @GetMapping(path = "/person", params = "version=1")
    public Person VersionControllerRequestParam() {
        return new Person("Param Mehari Shinash");
    }
    @GetMapping(value = "/person", params = "version=2")
    public PersonTwo versionP2RequestParameter() {
        return new PersonTwo(new Name("Param Michael", "Shinash"));
    }
    @GetMapping(value = "/person/header", headers = "X-API-VERSION=2")
    public PersonTwo versionP2RequestHeader() {
        return new PersonTwo(new Name("Header Michael", "Shinash"));
    }
}
