package com.mws.service.impl;

import com.mws.dao.ProducerMapper;
import com.mws.pojo.Producer;
import com.mws.service.IProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProducerServiceImpl implements IProducerService {

    @Autowired
    private ProducerMapper producerDao;

    @Override
    public List<Producer> getProducers() {
        return producerDao.getProducers();
    }

    @Override
    public void saveProducer(Producer producer) {
        producerDao.saveProducer(producer);
    }
}
