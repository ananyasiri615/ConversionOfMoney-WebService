package com.ars;

public class MoneyConversionImpl implements MoneyConversion{
	
	@Override
	public double RToD(Money m) {
		
		return m.getMoney() * 0.012;
	}

	@Override
	public double DToR(Money m) {
		return m.getMoney() / 0.012;
	}

}
