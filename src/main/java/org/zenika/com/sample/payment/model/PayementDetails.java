package org.zenika.com.sample.payment.model;

public class PayementDetails {
	private Long amount;
	private String currency;
	private String paymentMethodType;
	private String receiptEmail;

	public PayementDetails() {
		super();
	}

	public Long getAmount() {
		return amount;
	}

	public void setAmount(Long amount) {
		this.amount = amount;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getPaymentMethodType() {
		return paymentMethodType;
	}

	public void setPaymentMethodType(String paymentMethodType) {
		this.paymentMethodType = paymentMethodType;
	}

	public String getReceiptEmail() {
		return receiptEmail;
	}

	public void setReceiptEmail(String receiptEmail) {
		this.receiptEmail = receiptEmail;
	}

	@Override
	public String toString() {
		return "PayementDetails [amount=" + amount + ", currency=" + currency + ", paymentMethodType="
				+ paymentMethodType + ", receiptEmail=" + receiptEmail + "]";
	}

}
