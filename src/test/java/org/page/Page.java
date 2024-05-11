package org.page;

import org.base.Basee;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Page extends Basee {
	public Page() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(how=How.ID,using="username")
	private WebElement username;
	public WebElement getUsername() {
		return username;
	}
	
	@FindBy(how=How.ID,using="password")
	private WebElement password;
	public WebElement getPassword() {
		return password;
	}
	@FindBy(how=How.ID,using="login")
	private WebElement login;
	public WebElement getLogin() {
		return login;
	}
	@FindBy(how=How.NAME,using="location")
	private WebElement location;
	public WebElement getLocation() {
		return location;
	}
	@FindBy(how=How.ID,using="hotels")
	private WebElement hotels;
	public WebElement getHotels() {
		return hotels;
	}
	@FindBy(how=How.ID,using="room_type")
	private WebElement room_type;
	public WebElement getRoom_type() {
		return room_type;
	}
	@FindBy(how=How.NAME,using="room_nos")
	private WebElement room_nos;
	public WebElement getRoom_nos() {
		return room_nos;
	}
	@FindBy(how=How.NAME,using="datepick_in")
	private WebElement datepick_in;
	public WebElement getDatepick_in() {
		return datepick_in;
	}
	@FindBy(how=How.NAME,using="datepick_out")
	private WebElement datepick_out;
	public WebElement getDatepick_out() {
		return datepick_out;
	}
	@FindBy(how=How.ID,using="adult_room")
	private WebElement adult_room;
	public WebElement getAdult_room() {
		return adult_room;
	}
	@FindBy(how=How.ID,using="child_room")
	private WebElement child_room;
	public WebElement getChild_room() {
		return child_room;
	}
	@FindBy(how=How.ID,using="Submit")
	private WebElement Submit;
	public WebElement getSubmit() {
		return Submit;
	}
	@FindBy(how=How.XPATH,using="//td[text()='Search Hotel ']")
	private WebElement Text;
	public WebElement getSearchhotel() {
		return Text;
	}
	@FindBy(how=How.XPATH,using="//td[text()='Select Hotel ']")
	private WebElement selecthotel;
	public WebElement getSelecthotel() {
		return selecthotel;
	}
	@FindBy(how=How.ID,using="radiobutton_0")
	private WebElement radiobutton_0;
	public WebElement getRadiobutton_0() {
		return radiobutton_0;
	}
	@FindBy(how=How.NAME,using="continue")
	private WebElement continuebutton;
	public WebElement getContinuebutton() {
		return continuebutton;
	}
	@FindBy(how=How.XPATH,using="//td[text()='Book A Hotel ']")
	private WebElement Bookahotel;
	public WebElement getBookahotel() {
		return Bookahotel;
	}
	@FindBy(how=How.NAME,using="first_name")
	private WebElement first_name;
	public WebElement getFirst_name() {
		return first_name;
	}
	@FindBy(how=How.NAME,using="last_name")
	private WebElement last_name;
	public WebElement getLast_name() {
		return last_name;
	}
	@FindBy(how=How.NAME,using="address")
	private WebElement address;
	public WebElement getAddress() {
		return address;
	}
	@FindBy(how=How.NAME,using="cc_num")
	private WebElement cc_num;
	public WebElement getCc_num() {
		return cc_num;
	}
	@FindBy(how=How.NAME,using="cc_type")
	private WebElement cc_type;
	public WebElement getCc_type() {
		return cc_type;
	}
	@FindBy(how=How.NAME,using="cc_exp_month")
	private WebElement cc_exp_month;
	public WebElement getCc_exp_month() {
		return cc_exp_month;
	}
	@FindBy(how=How.NAME,using="cc_exp_year")
	private WebElement cc_exp_year;
	public WebElement getCc_exp_year() {
		return cc_exp_year;
	}
	@FindBy(how=How.NAME,using="cc_cvv")
	private WebElement cc_cvv;
	public WebElement getCc_cvv() {
		return cc_cvv;
	}
	@FindBy(how=How.NAME,using="book_now")
	private WebElement book_now;
	public WebElement getBook_now() {
		return book_now;
	}
	@FindBy(how=How.XPATH,using="//td[text()='Booking Confirmation ']")
	private WebElement bookingconformation;
	public WebElement getBookingconformation() {
		return bookingconformation;
	}
	@FindBy(how=How.ID,using="logout")
	private WebElement logout;
	public WebElement getLogout() {
		return logout;
	}
	@FindBy(how=How.XPATH,using="//td[text()='You have successfully logged out. ']")
	private WebElement logoutsucess;
	public WebElement getLogoutsucess() {
		return logoutsucess;
	}
}
