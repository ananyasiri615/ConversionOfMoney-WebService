package com.ars;

public class Money {
	private double money;

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}

	@Override
	public String toString() {
		return "Money [money=" + money + "]";
	}
}
