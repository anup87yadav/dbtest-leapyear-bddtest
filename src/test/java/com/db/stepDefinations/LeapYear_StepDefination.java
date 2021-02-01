package com.db.stepDefinations;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LeapYear_StepDefination {

	int year_value;
	int div_value;
	boolean bool;

	@Given("an year in {string} format")
	public void an_year_in_format(String year) {

		year_value = Integer.parseInt(year);

	}

	@When("year is not divided by {int}")
	public void year_is_not_divided_by(Integer intvalue) {

		if (year_value % intvalue != 0) {
			bool = false;
		} else {
			bool = true;
		}
	}

	@Then("give response {string}")
	public void give_response(String value) {

		Boolean bool_value = Boolean.valueOf(value);
		Assert.assertEquals(bool_value, bool);

	}

	@When("year is divisible by {int} and not a century")
	public void year_is_divisible_by_and_not_a_century(Integer intvalue) {

		if ((year_value % intvalue == 0) && (year_value % 100 != 0)) {

			bool = true;
		} else {
			bool = false;
		}
	}

	@When("year is divisible by {int} and a century and not divisible by {int}")
	public void year_is_divisible_by_and_a_century_and_not_divisible_by(Integer intvalue, Integer intvalue1) {

		if ((year_value % intvalue == 0) && (year_value % 100 == 0) && (year_value % intvalue1 != 0)) {

			bool = false;
		} else {
			bool = true;
		}

	}

	@When("year is divisible by {int} and a century and divisible by {int}")
	public void year_is_divisible_by_and_a_century_and_divisible_by(Integer intvalue, Integer intvalue1) {

		if ((year_value % intvalue == 0) && (year_value % 100 == 0) && (year_value % intvalue1 == 0)) {

			bool = true;
		} else {
			bool = false;
		}
	}

}
