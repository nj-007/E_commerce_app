package com.example.PaymentServiceMay24.services;

import com.example.PaymentServiceMay24.paymentgateways.PaymentGateway;
import com.razorpay.PaymentLink;
import org.springframework.stereotype.Service;
import org.json.JSONObject;
import com.razorpay.Payment;
import com.razorpay.RazorpayClient;
import com.razorpay.RazorpayException;

@Service
public class PaymentService {
    private PaymentGateway paymentGateway;

    PaymentService(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    public String createPaymentLink(Long orderId) throws RazorpayException {
        //call the Razorpay/Stripe PG to generate the payment link.
        return paymentGateway.createPaymentLink(orderId);
    }
}
