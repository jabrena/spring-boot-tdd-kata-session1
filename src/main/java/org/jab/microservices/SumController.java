package org.jab.microservices;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
public class SumController {

    @PostMapping(value = "/sum", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody SumResponse sum(@RequestBody SumRequest sumRequest) {
        return new SumResponse(sumRequest.getNumber1() + sumRequest.getNumber2());
    }

}
