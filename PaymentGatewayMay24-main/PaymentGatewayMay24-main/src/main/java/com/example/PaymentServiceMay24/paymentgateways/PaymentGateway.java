package com.example.PaymentServiceMay24.paymentgateways;

import com.razorpay.RazorpayException;
import com.stripe.exception.StripeException;

public interface PaymentGateway {
    String createPaymentLink(Long orderId) throws RazorpayException, StripeException;
}
