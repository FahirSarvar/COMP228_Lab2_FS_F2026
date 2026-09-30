package com.fs.lab2;

import java.math.BigDecimal;

public class Interest {

	private BigDecimal rate;
	private BigDecimal principal;
	private int time;

	public Interest(BigDecimal rate, BigDecimal principal, int time) {

		if (rate.compareTo(BigDecimal.ZERO) < 0) {
			throw new IllegalArgumentException("Rate cannot be less than zero");
		}
		if (principal.compareTo(BigDecimal.ZERO) <= 0) {
			throw new IllegalArgumentException("Principal cannot be less than or equal to zero");
		}
		if (time <= 0) {
			throw new IllegalArgumentException("Time cannot be less than or equal to zero");
		}

		this.rate = rate;
		this.principal = principal;
		this.time = time;

	}

	public BigDecimal Sinterest(BigDecimal rate, BigDecimal principal, int time) {

		BigDecimal si = rate.multiply(principal).multiply(BigDecimal.valueOf(time)).divide(BigDecimal.valueOf(100));

		return si;

	}

	public Double Sinterest(Double rate, Double principal, int time) {

		double si = (rate * principal * time)/100;

		return si;

	}

	public BigDecimal Cinterest(BigDecimal rate, BigDecimal principal, int time) {

		BigDecimal ci = principal.multiply(BigDecimal.ONE.add(rate.divide(BigDecimal.valueOf(100))).pow(time)).subtract(principal);

		return ci;
	}

	public Double Cinterest(Double rate, Double principal, int time) {

		Double ci = (principal * Math.pow(1 + rate/100, time) - principal);

		return ci;
	}

}
