package com.santosh.serialize;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Calendar;
import java.util.Date;

import com.santosh.pojo.Colar;
import com.santosh.pojo.Dog;

public final class TestSerialize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d = new Date();
		System.out.println(d);
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.YEAR, -1);
		calendar.add(Calendar.MONTH, 0);
		calendar.add(Calendar.DATE, 10);
		Date date;
		date = calendar.getTime();
		System.out.println(date);
		// Mon Oct 12 10:18:29 EDT 2015

		Colar colar = new Colar(18, date);
		Dog dog = new Dog("Ricky", true, colar);
		System.out.println(dog);

		try {
			FileOutputStream fileOut = new FileOutputStream("DOG.ser");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(dog);
			out.close();
			fileOut.close();
		} catch (IOException i) {
			i.printStackTrace();
		}

	}

}
