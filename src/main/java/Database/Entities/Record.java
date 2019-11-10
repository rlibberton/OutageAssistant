/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database.Entities;

import java.io.Serializable;
import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author joey101937 <g.uydude@yahoo.com>
 */
@Entity(name="records")
@Table(name = "records")
public class Record implements Serializable {
    @Id
    private int id;
    
    @Column
    private int countyId;
    
    @Column
    private int customersServed;
    
    @Column
    private int customersWithoutPower;
    
    @Column(name = "time")
    private Timestamp time;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCountyID() {
        return countyId;
    }

    public void setCountyID(int countyID) {
        this.countyId = countyID;
    }

    public int getCustomersServed() {
        return customersServed;
    }

    public void setCustomersServed(int customersServed) {
        this.customersServed = customersServed;
    }

    public int getCusomtersWithoutPower() {
        return customersWithoutPower;
    }

    public void setCusomtersWithoutPower(int cusomtersWithoutPower) {
        this.customersWithoutPower = cusomtersWithoutPower;
    }

    public Timestamp getTime() {
        return time;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }
    
    
    
}
