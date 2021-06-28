package com.chandan.ecommerce.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chandan.ecommerce.dto.Purchase;
import com.chandan.ecommerce.dto.PurchaseResponse;
import com.chandan.ecommerce.service.CheckoutService;

@RestController
@RequestMapping("/api/checkout")
public class CheckOutController {
	
		private CheckoutService checkoutService;
	    public CheckOutController(CheckoutService checkoutService) {
	        this.checkoutService = checkoutService;
	    }
	    
	    @PostMapping("/purchase")
	    public PurchaseResponse placeOrder(@RequestBody Purchase purchase) {
	        PurchaseResponse purchaseResponse = checkoutService.placeOrder(purchase);
	        return purchaseResponse;
	    }
}
