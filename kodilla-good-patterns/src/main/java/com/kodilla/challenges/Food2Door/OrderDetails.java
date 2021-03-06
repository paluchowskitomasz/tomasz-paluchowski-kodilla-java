package com.kodilla.challenges.Food2Door;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@EqualsAndHashCode
@ToString
public class OrderDetails {
    private String productName;
    private int productQuantity;
}
