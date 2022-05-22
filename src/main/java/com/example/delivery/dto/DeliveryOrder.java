package com.example.delivery.dto;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class DeliveryOrder {

    private String jobname;
    private String location;
    private String description;
    private int clientid;

    public DeliveryOrder(String jobname, String location, String description) {
        this.jobname = jobname;
        this.location = location;
        this.description = description;
    }

}
