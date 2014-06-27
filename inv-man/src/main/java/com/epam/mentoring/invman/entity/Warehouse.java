package com.epam.mentoring.invman.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "warehouse")
public class Warehouse {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private long warehouseId;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "addressId")
    private Address address;
    @OneToMany(mappedBy = "warehouseId", cascade = CascadeType.ALL)
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
