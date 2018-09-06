package com.springboot.quartz.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by zhh on 2018/9/6.
 */
@Entity
@Data
public class Config {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String cron;

}
