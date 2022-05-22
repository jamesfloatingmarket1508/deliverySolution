package com.example.delivery.jobs;

import com.example.delivery.dto.DeliveryOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface JobRepository extends JpaRepository<Jobs, Long> {
    List<Jobs> findByJobname(String jobname);

    @Query("SELECT new com.example.delivery.dto.DeliveryOrder(j.jobname, j.location , i.description) FROM Jobs j JOIN j.item i")
    public List<DeliveryOrder> getJoinInformation();
}
