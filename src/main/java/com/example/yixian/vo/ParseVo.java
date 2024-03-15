package com.example.yixian.vo;

import lombok.Data;

@Data
public class ParseVo {

    private Long id;
    private String isFromPlatform;

    private PlatformBo platformBo;

    private QuotationBo quotationBo;
}
