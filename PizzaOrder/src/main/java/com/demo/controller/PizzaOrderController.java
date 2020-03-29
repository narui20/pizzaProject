package com.demo.controller;

import com.demo.bean.PizzaOrderBean;
import com.demo.bean.PriceRangeBean;
import com.demo.service.PizzaOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PizzaOrderController {
    @Autowired
    private PizzaOrderService pizzaOrderService;

    @GetMapping("/")
    public String intro(){
        return "Welcome to Spring Boot PizzaOrder Api";
    }

    @GetMapping(value = "/pizzaOrder/controller/addDetails/",produces = MediaType.APPLICATION_JSON_VALUE,consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<PizzaOrderBean> addDetails(@RequestBody PizzaOrderBean pizzaOrderBean)throws Exception{
        return new ResponseEntity<PizzaOrderBean>(pizzaOrderService.addOrder(pizzaOrderBean), HttpStatus.OK);
    }

    @GetMapping(value = "/pizzaOrder/controller/getDetails",produces = MediaType.APPLICATION_JSON_VALUE,consumes=MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<PizzaOrderBean>> getDetails(@RequestBody PriceRangeBean priceRangeBean)throws Exception{
        return new ResponseEntity<List<PizzaOrderBean>>(pizzaOrderService.getOrderDetails(priceRangeBean.getFromPrice(),priceRangeBean.getToPrice()),HttpStatus.OK);
    }
}
