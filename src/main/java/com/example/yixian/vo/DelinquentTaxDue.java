package com.example.yixian.vo;

import lombok.Data;

@Data
public class DelinquentTaxDue {

    private String annualTaxAmount;
    private String exceedDate;
    private String exceedDaysCount;
    private String overDue;

    private Paid paid;
}
