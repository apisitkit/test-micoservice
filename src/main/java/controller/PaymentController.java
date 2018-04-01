package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import model.PaymentChanel;

@RestController()
public class PaymentController {
	
	@GetMapping("payment-chanel")
	public PaymentChanel getPaymentChanel() {
		return null;
	}
	
	@GetMapping("test-payment-controller")
	public String testPaymentController() {
		return "PaymentController works!";
	}
}
