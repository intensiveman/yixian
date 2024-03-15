package com.example.yixian.vo;

import lombok.Data;

import java.util.List;

@Data
public class VehicleTaxationMo {

    private String annualTaxDue;
    private String calcTaxFlag;
    private String declareStatusIA;
    private String taxConditionCode;
    private String taxDescription;
    private String taxPayerIdentificationCode;
    private String taxPayerName;
    private String taxRegistryNumber;
    private String taxTermTypeCode;
    private List<DelinquentTaxDue> delinquentTaxDueList;


}
