package org.zenika.com.sample.payment.services;

import org.zenika.com.sample.payment.model.PayementDetails;

import com.stripe.exception.StripeException;
import com.stripe.model.PaymentIntent;

public interface PaymentService {
	PaymentIntent initPayment(final PayementDetails payementDetails) throws StripeException;

}
