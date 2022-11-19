package com.jhrv.market.persistence;

import com.jhrv.market.persistence.crud.ProductoCrudRepository;
import com.jhrv.market.persistence.entity.Producto;

import java.util.List;

public class ProductoRepository {

    private ProductoCrudRepository productoCrudRepository;

    public List<Producto> getAll(){
        return (List<Producto>) productoCrudRepository.findAll();
    }
}
