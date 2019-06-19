package com.itheima.ssm.service.impl;

import com.itheima.ssm.dao.IProductDao;
import com.itheima.ssm.domain.Product;
import com.itheima.ssm.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class IProductServiceImpl implements IProductService{

  @Autowired
  private IProductDao productDao;

    @Override
    public List<Product> findAll() throws Exception {
        for (Product product : productDao.findAll()) {
            System.out.println(product);
        }
        ;
        return productDao.findAll();
    }
}
