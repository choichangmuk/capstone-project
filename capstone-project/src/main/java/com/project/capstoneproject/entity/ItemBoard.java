package com.project.capstoneproject.entity;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;
import java.util.Date;

@Entity(name = "itemboard")
@Data
public class ItemBoard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer item_post_seq;

    private String title;

    private String item_name;

    private Integer price;

    private Integer delivery_fee;

    private String item_category;

    private String content;

    private String image;

    private Integer present_num;

    private Integer done_num;

    @CreatedDate
    private LocalDateTime start_time;

    private Date end_time;

    private String host_id;

    private String host_account;

    private String location;
}
