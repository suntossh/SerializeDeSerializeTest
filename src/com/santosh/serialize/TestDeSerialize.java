package com.santosh.serialize;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.santosh.pojo.Dog;

public class TestDeSerialize {

	public static void main(String[] args) {
		Dog dog;
		try {
			FileInputStream fileIn = new FileInputStream("DOG.ser");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			dog = (Dog) in.readObject();
			in.close();
			fileIn.close();
		} catch (IOException i) {
			i.printStackTrace();
			return;
		} catch (ClassNotFoundException c) {
			System.out.println("Demo class not found");
			c.printStackTrace();
			return;
		}
		System.out.println("Deserialized Details...");
		System.out.println("Name: " + dog.getName());
		System.out.println("ISALive: " + dog.isAlive());
		System.out.println("Colar " + dog.getColar());
	}

}
