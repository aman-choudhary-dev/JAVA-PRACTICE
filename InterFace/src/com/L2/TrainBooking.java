package com.L2;

public class TrainBooking implements IBooking {

	@Override
	public void book() {
		// TODO Auto-generated method stub
		System.out.println("TrainBooking.book()");
	}

	@Override
	public void cancelBook() {
		// TODO Auto-generated method stub
		System.out.println("TrainBooking.cancelBook()");
	}
	@Override
	public void autoUpgrade() {
		System.out.println("TrainBooking.autoUpgrade()");
	}

}
