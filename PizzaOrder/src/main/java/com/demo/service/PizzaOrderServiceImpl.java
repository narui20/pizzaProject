package com.demo.service;

import com.demo.bean.PizzaOrderBean;
import com.demo.dao.PizzaOrderWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PizzaOrderServiceImpl implements PizzaOrderService{
    @Autowired
    private PizzaOrderWrapper pizzaOrderWrapper;

    @Override
    public PizzaOrderBean addOrder(PizzaOrderBean bean) throws Exception {
        return pizzaOrderWrapper.addOrder(bean);
    }

    @Override
    public List<PizzaOrderBean> getOrderDetails(Double fromPrice, Double toPrice) throws Exception {
        return pizzaOrderWrapper.getOrderDetails(fromPrice,toPrice);
    }
}
