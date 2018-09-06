package com.springboot.quartz.jpa;


import com.springboot.quartz.entity.Config;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by zhh on 2018/9/6.
 */
public interface ConfigRepository extends JpaRepository<Config,Long> {
}
