package com.example.workindia.dinningreservation.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
public class DinningDTO {


    private Integer id;

    private String name;

    private String address;

    private Long phoneNo;

    private Date openTime;

    private Date closedTime;
}
