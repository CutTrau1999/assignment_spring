package com.example.assignment.controller;

import com.example.assignment.entity.Street;
import com.example.assignment.service.StreetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/api/v1/streets")
public class StreetController {
    //get list
    @Autowired
    StreetService streetService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<Object> getList(
            @RequestParam(defaultValue = "1") int page,
            @RequestParam(defaultValue = "10") int limit) {
        HashMap<String, Object> response = new HashMap<>();
        response.put("page", page);
        response.put("limit", limit);
        response.put("data", streetService.findAll());
        return new ResponseEntity<>(response, HttpStatus.OK);
    }


    // create
    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Object> create(@RequestBody Street street) {

        streetService.save(street);
        return new ResponseEntity<>(street, HttpStatus.CREATED);
    }

    //get detail
    @RequestMapping(method = RequestMethod.GET, path = "{id}")
    public ResponseEntity<Object> getDetail(@PathVariable int id) {
        Optional<Street> optionalStreet = streetService.findById(id);
        if (optionalStreet.isPresent()) {
            return new ResponseEntity<>(optionalStreet.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }

    }

    //update
    @RequestMapping(method = RequestMethod.PUT, path = "{id}")
    public ResponseEntity<Object> update(@PathVariable int id, @RequestBody Street updatedStreet) {
        Optional<Street> optionalStreet = streetService.findById(id);
        if (optionalStreet.isPresent()) {
            Street street = optionalStreet.get();
            street.setName(updatedStreet.getName());
            street.setDescription(updatedStreet.getDescription());
            street.setStatus(updatedStreet.getStatus());
            streetService.save(street);
            return new ResponseEntity<>(street, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
    }

    //delete
    @RequestMapping(method = RequestMethod.DELETE, path = "{id}")
    public ResponseEntity<Object> delete(@PathVariable int id) {
        Optional<Street> optionalStreet = streetService.findById(id);
        if (optionalStreet.isPresent()) {

            streetService.delete(optionalStreet.get());
            return new ResponseEntity<>(true, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(false, HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(method = RequestMethod.POST, path = "search")
    public HashMap<String, Object> search(@RequestBody Street street, @RequestParam(defaultValue = "1") int page, @RequestParam(defaultValue = "10") int limit) {
        List<Street> listSearch = new ArrayList<>();
        listSearch = streetService.search(street);
        HashMap<String, Object> response = new HashMap<>();
        response.put("page", page);
        response.put("limit", limit);
        response.put("data", listSearch);
        return response;
    }
}
