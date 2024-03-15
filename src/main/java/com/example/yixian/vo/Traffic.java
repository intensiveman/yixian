package com.example.yixian.vo;

import lombok.Data;

import java.util.List;

@Data
public class Traffic {

    List<Coverage> coverageList;

    VehicleTaxationMo vehicleTaxationMo;
}
