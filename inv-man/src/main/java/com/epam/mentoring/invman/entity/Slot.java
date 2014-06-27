package com.epam.mentoring.invman.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Class representing slots of blocks.
 * 
 * @author zeusz
 * 
 */
@Entity
@Table(name = "slot")
public class Slot {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private long id;
    @Column(name = "row")
    private int rowNum;
    @Column(name = "column")
    private int columnNum;
    @Column(name = "capacity")
    private int capacity;
    @Column(name = "blockId")
    private long blockId;

    public int getRowNum() {
        return rowNum;
    }

    public void setRowNum(final int rowNum) {
        this.rowNum = rowNum;
    }

    public int getColumnNum() {
        return columnNum;
    }

    public void setColumnNum(final int columnNum) {
        this.columnNum = columnNum;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(final int capacity) {
        this.capacity = capacity;
    }

    public long getBlockId() {
        return blockId;
    }

    public void setBlockId(final long blockId) {
        this.blockId = blockId;
    }

}
