package org.validate;

import org.openqa.selenium.WebElement;
import org.page.Page;

public class PageValidate {
	public static Page p;
	public void SearchHotelValidate() {
		try {
			p = new Page();
			WebElement getvalidateString = p.getSearchhotel();
			if (getvalidateString.isDisplayed()) {
				System.out.println("Search Hotel Page Displayed:");
			}
		} catch (Exception e) {
			System.out.println("Search Hotel Page Not Displayed");
		}
	}

	public void SelectHotelValidate() {
		try {
			p = new Page();
			WebElement selecthotel = p.getSelecthotel();
			if (selecthotel.isDisplayed()) {
				System.out.println("Select Hotel Page Displayed:");
			}
		} catch (Exception e) {
			System.out.println("Select Hotel Page Not Displayed:");
		}
	}

	public void BookHotelValidate() {
		try {
			p = new Page();
			WebElement bookahotel = p.getBookahotel();
			if (bookahotel.isDisplayed()) {
				System.out.println("Book Hotel Page Displayed:");
			}
		} catch (Exception e) {
			System.out.println("Book Hotel Page Not Displayed:");
		}
	}

	public void BookingConfirmation() {
		try {
			p = new Page();
			WebElement bookingconformation = p.getBookingconformation();
			if (bookingconformation.isDisplayed()) {
				System.out.println("Booking Confirmation Page Is Displayed:");
			}
		} catch (Exception e) {
			System.out.println("Booking Confirmation Page Is Not Displayed:");
		}
	}

	public void LogoutConfirmation() {
		try {
			p = new Page();
			WebElement LogoutConfirmation = p.getLogoutsucess();
			if (LogoutConfirmation.isDisplayed()) {
				System.out.println("LogoutConfirmation  Page Is Displayed:");
			}
			System.out.println("You Have Completed SuccessFully Tested Adactin Website");
		} catch (Exception e) {
			System.out.println("LogoutConfirmation Page Is Not Displayed:");
		}
	}

}
