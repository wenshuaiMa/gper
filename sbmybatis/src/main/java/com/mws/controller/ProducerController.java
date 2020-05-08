package com.mws.controller;

import com.mws.pojo.Producer;
import com.mws.service.IProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProducerController {

    @Autowired
    private IProducerService producerService;

    @GetMapping("/get")
    public List<Producer> getProducers(){

        return producerService.getProducers();
    }

    @PostMapping("/save")
    public void saveProducer(@RequestBody Producer producer){

        producerService.saveProducer(producer);
    }
}
