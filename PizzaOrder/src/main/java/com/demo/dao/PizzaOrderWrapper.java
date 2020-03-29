package com.demo.dao;

import com.demo.bean.PizzaOrderBean;
import com.demo.entity.PizzaOrderEntity;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Repository
@Transactional
public class PizzaOrderWrapper {
    @Autowired
    private PizzaOrderDao pizzaOrderDao;

    public PizzaOrderBean addOrder(PizzaOrderBean bean)throws  Exception{
       return convertEntityToBean( pizzaOrderDao.save(convertBeanToEntity(bean)));
    }

    public List<PizzaOrderBean> getOrderDetails(Double fromPrice,Double toPrice)throws Exception{
        List<PizzaOrderBean> pizzaOrderBeanList=new ArrayList<>();
        List<PizzaOrderEntity> pizzaOrderEntityList=pizzaOrderDao.getOrderDetails(fromPrice,toPrice);
        for(PizzaOrderEntity entity:pizzaOrderEntityList)
        {
            pizzaOrderBeanList.add(convertEntityToBean(entity));
        }
        return pizzaOrderBeanList;
    }

    public static PizzaOrderBean convertEntityToBean(PizzaOrderEntity pizzaEntity){
       PizzaOrderBean bean=new PizzaOrderBean();
        BeanUtils.copyProperties(pizzaEntity,bean);
        return bean;
    }

    public static PizzaOrderEntity convertBeanToEntity(PizzaOrderBean bean){
        PizzaOrderEntity pizzaOrderEntity=new PizzaOrderEntity();
        BeanUtils.copyProperties(bean,pizzaOrderEntity);
        return pizzaOrderEntity;
    }
}
