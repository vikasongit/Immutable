package com.main;

import java.util.Date;

import com.immutable.ImmuteClass;

/**
 * @author vikas.singla
 *
 */
public class Main {

	public static void main(String[] args) {

		Date date = new Date("1/1/1970");

		ImmuteClass obj = new ImmuteClass(1, "test", date);

		System.out.println("Name is:" + obj.getName() + "," + "doj:"
				+ obj.getDoj());

		obj.getDoj().setMonth(11);

		date.setMonth(11);

		System.out.println("Name is:" + obj.getName() + "," + "doj:"
				+ obj.getDoj());
	}
}
