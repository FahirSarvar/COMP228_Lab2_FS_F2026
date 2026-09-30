package com.fs.lab2;

import java.math.BigDecimal;

import java.util.Scanner;

public class MainDriver {

	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(System.in)) {

			Interest[] Investments = new Interest[5];

			for (int i = 0; i < Investments.length; i++) {

				System.out.println("Enter rate");
				BigDecimal rate = scanner.nextBigDecimal();
				System.out.println("Enter principal");
				BigDecimal principal = scanner.nextBigDecimal();
				System.out.println("Enter time");
				int time = scanner.nextInt();

				Investments[i] = new Interest(rate, principal, time);
				
				System.out.println("Simple interest (BigDecimal): " + Investments[i].Sinterest(rate, principal, time));
				System.out.println("Compound (BigDecimal): " + Investments[i].Cinterest(rate, principal, time));

				// Double overloads
				double r = rate.doubleValue();
				double p = principal.doubleValue();
				System.out.println("Simple interest (Double): " + Investments[i].Sinterest(r, p, time));
				System.out.println("Compound interest (Double): " + Investments[i].Cinterest(r, p, time));

			}

		}

	}

}
