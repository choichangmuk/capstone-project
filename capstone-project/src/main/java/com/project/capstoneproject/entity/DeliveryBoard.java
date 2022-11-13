package com.project.capstoneproject.entity;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;
import java.util.Date;

@Entity(name = "deliveryboard")
@Data
public class DeliveryBoard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer delivery_post_seq;

    private String title;

    private Integer store_num;

    private String store_category;

    private Integer delivery_fee;

    private String content;

    private Integer present_num;

    private Integer done_num;

    @CreatedDate
    private LocalDateTime start_time;

    private Date end_time;

    private String host_id;

    private String host_account;

    private String destination;
}
