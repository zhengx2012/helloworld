package com.charter.hello.world.web;

import com.charter.hello.world.model.HelloWorldResponse;
import org.springframework.web.bind.annotation.*;

@RestController
public class WebController {
    @GetMapping(value = "/hello",
            consumes = {"application/json"},
            produces = {"application/json"})
    @ResponseBody HelloWorldResponse hello(){
        return new HelloWorldResponse("Hello World!");
    }

    @PostMapping(value = "/hello",
            consumes = {"application/json"},
            produces = {"application/json"})
    @ResponseBody HelloWorldResponse goodMorning(@RequestBody HelloWorldResponse request){
        return new HelloWorldResponse(request.getMessage());
    }
}
