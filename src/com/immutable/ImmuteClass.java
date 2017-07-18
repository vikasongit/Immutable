package com.immutable;

import java.util.Date;

/**
 * @author vikas.singla
 *
 */
final public class ImmuteClass {

	final private long id;
	final private String name;
	final private Date doj;

	public ImmuteClass(int id, String name, Date doj) {
		this.id = id;
		this.name = name;
		this.doj = new Date(doj.getYear(), doj.getMonth(), doj.getDate());
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Date getDoj() {
		return (Date) doj.clone();
	}
}
