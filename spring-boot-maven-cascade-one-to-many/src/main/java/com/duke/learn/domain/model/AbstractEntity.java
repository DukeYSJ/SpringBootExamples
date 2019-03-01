package com.duke.learn.domain.model;

import org.joda.time.DateTime;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by Duke on 2019/3/1.
 */

public abstract class AbstractEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @CreatedDate
    private DateTime createDate;

    private DateTime lastModifyDate;


}
