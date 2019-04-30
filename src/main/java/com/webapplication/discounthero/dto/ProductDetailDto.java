package com.webapplication.discounthero.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ProductDetailDto {
    private String price;
    private String title;
    private String imgUrl;
    private String id;
    private String brand;
    private String description;
}
