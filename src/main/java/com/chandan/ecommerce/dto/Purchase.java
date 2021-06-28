package com.chandan.ecommerce.dto;

import java.util.Set;

import com.chandan.ecommerce.entity.Address;
import com.chandan.ecommerce.entity.Customer;
import com.chandan.ecommerce.entity.Order;
import com.chandan.ecommerce.entity.OrderItem;

import lombok.Data;

@Data
public class Purchase {

    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;

}
