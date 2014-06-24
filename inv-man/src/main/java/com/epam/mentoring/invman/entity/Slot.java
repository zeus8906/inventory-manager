package com.epam.mentoring.invman.entity;

import javax.persistence.Entity;

import org.hibernate.annotations.Table;

/**
 * Class representing slots of blocks.
 * @author zeusz
 *
 */
@Entity
@Table(appliesTo = "slot")
public class Slot {
    private int rowNum;
    private int columnNum;
    private int capacity;
    
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
    
}
