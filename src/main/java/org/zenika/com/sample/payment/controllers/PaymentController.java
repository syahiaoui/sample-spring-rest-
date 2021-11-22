package org.zenika.com.sample.payment.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.zenika.com.sample.payment.model.PayementDetails;
import org.zenika.com.sample.payment.services.PaymentService;

import com.stripe.exception.StripeException;

@Controller
public class PaymentController {

	private PaymentService payementService;

	@Autowired
	public PaymentController(final PaymentService payementService) {
		this.payementService = payementService;
	}

	@PostMapping("/payment")
	public ModelAndView payement(@ModelAttribute("paymentDetails") PayementDetails paymentDetails, Model model)
			throws StripeException {
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>www: " + model.asMap().entrySet().toString());
		System.out.println(">>>>>>>>>>>>>PayementDetails:" + paymentDetails.toString());

		final String uri = this.payementService.initPayment(paymentDetails).getCharges().getUrl();
		return new ModelAndView("redirect:" + "https://stripe.com/".concat(uri));
	}

	@RequestMapping("/paymentView")
	public String page(Model model) {
		model.addAttribute("paymentDetails", new PayementDetails());
		return "html/paymentConfirmation";
	}
}
