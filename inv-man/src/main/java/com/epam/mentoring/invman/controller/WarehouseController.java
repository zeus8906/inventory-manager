package com.epam.mentoring.invman.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.epam.mentoring.invman.entity.Address;
import com.epam.mentoring.invman.entity.Warehouse;
import com.epam.mentoring.invman.service.WarehouseService;

@Controller
@RequestMapping("/warehouse")
public class WarehouseController {

    @Resource
    private WarehouseService service;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public void addWarehouse(@RequestParam final Address address,
            @RequestParam final int blockNum) {
        final Warehouse newWarehouse = new Warehouse();
        newWarehouse.setAddress(address);
        service.addWareHouse(newWarehouse, blockNum);
    }

    @RequestMapping(value = "listAll", method = RequestMethod.GET)
    public List<Warehouse> listWarehouses() {
        return service.getWarehouseList();
    }
}
