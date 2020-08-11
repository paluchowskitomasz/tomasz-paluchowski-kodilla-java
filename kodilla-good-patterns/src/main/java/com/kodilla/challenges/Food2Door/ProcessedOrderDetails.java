package com.kodilla.challenges.Food2Door;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.util.Date;
import java.util.Objects;

@AllArgsConstructor
@Getter
@EqualsAndHashCode
@ToString
public class ProcessedOrderDetails {
    private Status status;
    private OrderDetails orderDetails;
    private Date processedDate;
}
