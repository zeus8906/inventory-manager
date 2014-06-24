package com.epam.mentoring.invman.entity;

import java.util.Set;

import javax.persistence.Entity;

import org.hibernate.annotations.Table;

/**
 * Class for representing blocks of warehouses.
 * @author zeusz
 *
 */
@Entity
@Table(appliesTo = "block")
public class Block {
    
    private long blockId;
    private boolean isFridge;
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
