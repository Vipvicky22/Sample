package org.adac;

import java.io.IOException;
import org.base.Basee;
import org.openqa.selenium.WebElement;
import org.page.Page;
import org.validate.PageValidate;

public class Ececute extends Basee {
	public static Page p;
	public static void main(String[] args) throws IOException, InterruptedException {
		Ececute v = new Ececute();
		v.getdriver(v.readexcel(2, 3));
		driver.get("https://adactinhotelapp.com/");
		v.maxwin();
		p = new Page();
		WebElement username = p.getUsername();
		username.sendKeys(v.readexcel(1, 0));
		WebElement password = p.getPassword();
		password.sendKeys(v.readexcel(1, 1));
		WebElement login = p.getLogin();
		login.click();
		PageValidate va=new PageValidate();
		va.SearchHotelValidate();
		WebElement location = p.getLocation();
		v.selectByValue(location, v.readexcel(1, 2));
		WebElement hotels = p.getHotels();
		v.selectByValue(hotels, v.readexcel(2, 2));
		WebElement room_type = p.getRoom_type();
		v.selectByValue(room_type, v.readexcel(3, 2));
		WebElement room_nos = p.getRoom_nos();
		v.selectByIndex(room_nos, 2);
		WebElement datepick_in = p.getDatepick_in();
		datepick_in.clear();
		datepick_in.sendKeys("07/04/2024");
		WebElement datepick_out = p.getDatepick_out();
		datepick_out.clear();
		datepick_out.sendKeys("09/04/2024");
		WebElement adult_room = p.getAdult_room();
		v.selectByIndex(adult_room, 2);
		WebElement child_room = p.getChild_room();
		v.selectByIndex(child_room, 3);
		WebElement submit = p.getSubmit();
		submit.click();
		va.SelectHotelValidate();
		p.getRadiobutton_0().click();
		p.getContinuebutton().click();
		va.BookHotelValidate();
		WebElement first_name = p.getFirst_name();
		first_name.sendKeys(v.readexcel(1, 5));
		WebElement last_name = p.getLast_name();
		last_name.sendKeys(p.readexcel(1, 6));
		WebElement address = p.getAddress();
		address.sendKeys(p.readexcel(1, 7));
		WebElement cc_num = p.getCc_num();
		cc_num.sendKeys("8575857598764567");
		WebElement cc_type = p.getCc_type();
		v.selectByIndex(cc_type, 2);
		WebElement cc_exp_month = p.getCc_exp_month();
		p.selectByIndex(cc_exp_month, 5);
		WebElement cc_exp_year = p.getCc_exp_year();
		p.selectByIndex(cc_exp_year, 16);
		WebElement cc_cvv = p.getCc_cvv();
		cc_cvv.sendKeys(p.readexcel(1, 8));
		WebElement book_now = p.getBook_now();
		book_now.click();
		v.Sleep(5000);
		va.BookingConfirmation();
		p.getLogout().click();
		va.LogoutConfirmation();
	}
}
