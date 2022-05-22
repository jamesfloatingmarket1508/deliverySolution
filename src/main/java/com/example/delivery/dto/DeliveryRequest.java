package com.example.delivery.dto;

import com.example.delivery.jobs.Jobs;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class DeliveryRequest {

    private Jobs job;

}
