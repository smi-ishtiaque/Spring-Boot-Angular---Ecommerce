package com.mixedcs.ecom.service;

import com.mixedcs.ecom.dto.PaymentInfo;
import com.mixedcs.ecom.dto.Purchase;
import com.mixedcs.ecom.dto.PurchaseResponse;
import com.stripe.exception.StripeException;
import com.stripe.model.PaymentIntent;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);

    PaymentIntent createPaymentIntent(PaymentInfo paymentInfo) throws StripeException;
}
