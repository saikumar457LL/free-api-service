package org.ocean.freeapiservice;

import org.ocean.freeapiservice.constants.SomeData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@CrossOrigin("*")
public class FreeApi {

    @Autowired
    SomeData someData;

    @GetMapping
    @CrossOrigin("*")
    public ResponseEntity<ArrayList<String>> getData() {
        return ResponseEntity.ok(someData.getData());
    }

    @PostMapping
    @CrossOrigin("*")
    public ResponseEntity<ArrayList<String>> postData(@RequestBody String data) {
        ArrayList<String> temp = someData.getData();
        temp.add(data);
        someData.setData(temp);
        return ResponseEntity.ok(someData.getData());
    }

    @GetMapping( "/{id}")
    @CrossOrigin("*")
    public ResponseEntity<String> getDataById(@PathVariable String id) {
        return ResponseEntity.ok(someData.getData().get(Integer.parseInt(id)));
    }
}
