package com.barber.web.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class PeVisitLogs implements Serializable{

    private static final long serialVersionUID = 1L;

    private Integer id;

    private Integer companyId;

    private Integer keypersonId;

    private Integer userId;

    private String arrivedTime;

    private String leavedTime;

    private Float latitude;

    private Float longitude;

    private Integer addressid;

    private String frontdeskImages;

    private String companylogoImages;

    private String otherImages;

    private String createdTime;

    private String updatedTime;

    private String visitLog;
}