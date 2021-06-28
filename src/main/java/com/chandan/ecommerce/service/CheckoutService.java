package com.chandan.ecommerce.service;

import com.chandan.ecommerce.dto.Purchase;
import com.chandan.ecommerce.dto.PurchaseResponse;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);
}
