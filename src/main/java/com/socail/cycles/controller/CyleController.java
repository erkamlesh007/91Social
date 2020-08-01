package com.socail.cycles.controller;

import java.util.concurrent.CompletableFuture;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.socail.cycles.model.PricingRequest;
import com.socail.cycles.model.PricingResponse;
import com.socail.cycles.service.PriceService;

@RestController
@RequestMapping("/api/v1")
public class CyleController {
	 private static final Logger LOGGER= LoggerFactory.getLogger(CyleController.class);
	@Autowired
	private PriceService service;

	@PostMapping(path = "/prices", consumes = "application/json", produces = "application/json")
	public ResponseEntity<PricingResponse> geCyclesPrices(@RequestBody PricingRequest request) {

		CompletableFuture<PricingResponse> resp = service.getPrices(request);

		PricingResponse response = null;
		try {
			response = resp.get();
		} catch (Exception e) {
			LOGGER.error(e.getMessage());
		}

		return ResponseEntity.ok().body(response);
	}
}
