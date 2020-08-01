package com.socail.cycles.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.CompletableFuture;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import com.socail.cycles.model.Cycle;
import com.socail.cycles.model.PricingRequest;
import com.socail.cycles.model.PricingResponse;

@Service
public class PriceServiceImpl implements PriceService {

	@Async
	@Override
	public CompletableFuture<PricingResponse> getPrices(PricingRequest request) {

		return CompletableFuture.completedFuture(calculatePrice(request));
	}

	private PricingResponse calculatePrice(PricingRequest request) {
		Cycle cycle = new Cycle(1000, 100, 100, 100, 100, 100, request.getDate());
		double price = cycle.getBasePrice() + cycle.getFramePrice() + cycle.getHandleBarWithBrakesPrice()
				+ cycle.getSeatingPrice() + cycle.getWheelsPrice() + cycle.getChaianAsemblyPrice();

		try {
			Date date1 = new SimpleDateFormat("yyyy-MM-dd").parse(request.getDate());
			Date date2 = new SimpleDateFormat("yyyy-MM-dd").parse("2016-01-12");
			if (date1.after(date2)) {
				price = price + 230;
			} else {
				price = price + 200;
			}
		} catch (ParseException e) {

			e.printStackTrace();
		}
		double totalPrice = price * request.getCycleCount();
		PricingResponse response = new PricingResponse();
		response.setCycleCount(request.getCycleCount());
		response.setPrice(totalPrice);

		return response;
	}

}
