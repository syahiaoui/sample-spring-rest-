package org.zenika.com.sample.payment.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.zenika.com.sample.payment.model.PayementDetails;

import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.model.PaymentIntent;
import com.stripe.param.PaymentIntentCreateParams;

@Service
public class StripeService implements PaymentService {

	@Value("${stripe.key.secret}")
	private String stripeApikey;

	@Override
	public PaymentIntent initPayment(PayementDetails payementDetails) throws StripeException {
		Stripe.apiKey = stripeApikey;
		final PaymentIntentCreateParams params = PaymentIntentCreateParams.builder()
				.setAmount(payementDetails.getAmount())
				.setCurrency(payementDetails.getCurrency())
				.addPaymentMethodType(payementDetails.getPaymentMethodType())
				.setReceiptEmail(payementDetails.getReceiptEmail())
				.build();
		return PaymentIntent.create(params);
	}

}
