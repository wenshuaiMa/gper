package com.mws.service;

import com.mws.pojo.Producer;

import java.util.List;

public interface IProducerService {


    List<Producer> getProducers();

    void saveProducer(Producer producer);
}
