package com.example.PaymentServiceMay24.paymentgateways;

import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.model.PaymentLink;
import com.stripe.param.PaymentLinkCreateParams;
import org.springframework.stereotype.Component;

@Component
public class StripePaymentGateway implements PaymentGateway {
    @Override
    public String createPaymentLink(Long orderId) throws StripeException {
        Stripe.apiKey = "sk_test_tR3PYbcVNZZ796tH88S4VQ2u";

        PaymentLinkCreateParams params =
                PaymentLinkCreateParams.builder()
                        .addLineItem(
                                PaymentLinkCreateParams.LineItem.builder()
                                        .setPrice("price_1MoC3TLkdIwHu7ixcIbKelAC")
                                        .setQuantity(1L)
                                        .build()
                        )
                        .build();

        PaymentLink paymentLink = PaymentLink.create(params);

        return paymentLink.toString();
    }
}
