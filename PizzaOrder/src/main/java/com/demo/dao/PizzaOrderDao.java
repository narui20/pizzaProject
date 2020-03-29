package com.demo.dao;

import com.demo.entity.PizzaOrderEntity;
import org.springframework.data.repository.RepositoryDefinition;

import javax.transaction.Transactional;
import java.util.List;

@RepositoryDefinition(idClass = Integer.class,domainClass = PizzaOrderEntity.class)
@Transactional
public interface PizzaOrderDao {

    public PizzaOrderEntity save(PizzaOrderEntity entity)throws Exception;

    public List<PizzaOrderEntity> getOrderDetails(Double fromBill,Double toBill)throws Exception;
}
