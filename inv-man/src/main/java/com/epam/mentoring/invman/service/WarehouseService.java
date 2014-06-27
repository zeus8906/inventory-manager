package com.epam.mentoring.invman.service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.annotation.Resource;

import com.epam.mentoring.invman.dao.DataAccessObject;
import com.epam.mentoring.invman.entity.Block;
import com.epam.mentoring.invman.entity.Warehouse;

public class WarehouseService {

    @Resource
    private DataAccessObject<Warehouse> warehouseDao;

    /**
     * add a warehouse to database
     * 
     * @param warehouse
     *            warehouse to be added
     * @param blockNumber
     *            defines how many blocks the warehouse has.
     */
    public void addWareHouse(final Warehouse warehouse, int blockNumber) {
        final Set<Block> blocks = new HashSet<Block>();
        for (int i = 0; i < blockNumber; ++i) {
            blocks.add(new Block());
        }
        warehouse.setBlocks(blocks);
    }

    /**
     * List all warehouses stored in database.
     * 
     * @return warehouse list.
     */
    public List<Warehouse> getWarehouseList() {
        return new ArrayList<Warehouse>(warehouseDao.listAll());
    }
}
