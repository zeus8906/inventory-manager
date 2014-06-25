package com.epam.mentoring.invman.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Class for representing blocks of warehouses.
 * 
 * @author zeusz
 * 
 */
@Entity
@Table(name = "block")
public class Block {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private long blockId;
    @Column(name = "fridge")
    private boolean isFridge;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "warehouse")
    private Set<Slot> slots;

    public long getBlockId() {
        return blockId;
    }

    public void setBlockId(final long blockId) {
        this.blockId = blockId;
    }

    public boolean isFridge() {
        return isFridge;
    }

    public void setFridge(final boolean isFridge) {
        this.isFridge = isFridge;
    }

    public Set<Slot> getSlots() {
        return slots;
    }

    public void setSlots(final Set<Slot> slots) {
        this.slots = slots;
    }

}
