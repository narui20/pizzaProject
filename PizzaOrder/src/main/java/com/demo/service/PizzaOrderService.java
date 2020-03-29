package com.demo.service;

import com.demo.bean.PizzaOrderBean;

import java.util.List;

public interface PizzaOrderService {
    public PizzaOrderBean addOrder(PizzaOrderBean bean)throws Exception;
    public List<PizzaOrderBean> getOrderDetails(Double fromPrice,Double toPrice)throws  Exception;
}
