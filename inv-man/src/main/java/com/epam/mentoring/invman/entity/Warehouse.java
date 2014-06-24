package com.epam.mentoring.invman.entity;

import java.util.Set;

import javax.persistence.Entity;

import org.hibernate.annotations.Table;


@Entity
@Table(appliesTo = "warehouse")
public class Warehouse {
    private long warehouseId;
    private Address address;
    private Set<Block> blocks;
    
    public long getWarehouseId() {
        return warehouseId;
    }
    public void setWarehouseId(final long warehouseId) {
        this.warehouseId = warehouseId;
    }
    public Address getAddress() {
        return address;
    }
    public void setAddress(final Address address) {
        this.address = address;
    }
    public Set<Block> getBlocks() {
        return blocks;
    }
    public void setBlocks(final Set<Block> blocks) {
        this.blocks = blocks;
    }
    
    
}
