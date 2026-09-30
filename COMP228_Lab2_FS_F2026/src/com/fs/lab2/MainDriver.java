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
				
				System.out.printf("Simple interest (BigDecimal): $%.2f%n", Investments[i].Sinterest(rate, principal, time));
				System.out.printf("Compound (BigDecimal): $%.2f%n", Investments[i].Cinterest(rate, principal, time));

				// Double overloads
				double r = rate.doubleValue();
				double p = principal.doubleValue();
				System.out.printf("Simple interest (Double): $%.2f%n", Investments[i].Sinterest(r, p, time));
				System.out.printf("Compound interest (Double): $%.2f%n", Investments[i].Cinterest(r, p, time));

			}

		}

	}

}
