package com.mixedcs.ecom.dto;

import com.mixedcs.ecom.entity.Address;
import com.mixedcs.ecom.entity.Customer;
import com.mixedcs.ecom.entity.Order;
import com.mixedcs.ecom.entity.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {

    private Customer customer;

    private Address shippingAddress;

    private Address billingAddress;

    private Order order;

    private Set<OrderItem> orderItems;
}
