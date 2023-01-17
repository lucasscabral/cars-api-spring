package com.cars_api.api.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cars_api.api.dto.carsDTO;

@RestController
@RequestMapping("/cars")
public class carsController {

  @PostMapping
  public void cars(@RequestBody carsDTO req) {
    System.out.println(req.fabricante());
  }

}
