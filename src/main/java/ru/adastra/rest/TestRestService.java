package ru.adastra.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.adastra.dto.TestDto;

@RestController
@RequestMapping("/test")
public class TestRestService {

    @RequestMapping(method = RequestMethod.GET, value = "/greeting")
    public TestDto findByName(@RequestParam(name = "text", required = false) String text) {
        TestDto dto = new TestDto();
        dto.setGreeting(text);
        return dto;
    }
}
