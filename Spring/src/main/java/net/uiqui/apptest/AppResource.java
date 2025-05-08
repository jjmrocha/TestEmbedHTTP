package net.uiqui.apptest;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class AppResource {
    @RequestMapping(
            method = RequestMethod.GET,
            value = "/resource/{id}",
            produces = MediaType.TEXT_PLAIN_VALUE
    )
    public ResponseEntity<String> fetch(
            @PathVariable("id") String id,
            @RequestParam("name") String name) {
        var payload = "Resource ID: " + id + ", Name: " + name;
        return ResponseEntity.ok(payload);
    }
}
