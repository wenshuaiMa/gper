package com.mws.dao;

import com.mws.pojo.Producer;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProducerMapper {

    List<Producer> getProducers();

    void saveProducer(Producer producer);
}
