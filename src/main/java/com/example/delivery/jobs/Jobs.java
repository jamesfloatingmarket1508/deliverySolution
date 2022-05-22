package com.example.delivery.jobs;

import com.example.delivery.item.Item;

import javax.persistence.*;
import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Jobs implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // Rely on h2b database
    private Long id;
    private String jobname;
    private String location;
    private String notice;
    private String clientid;
    private String des_job;
    private String delivery_date;
    private String delivery_time ;
    private String status;
    private String driver_id;

    @OneToMany(targetEntity = Item.class,cascade = CascadeType.MERGE)
    @JoinColumn(name ="jobid",referencedColumnName = "id")
    private List<Item> item;

}
