package com.Exception;

class InvalidAgeException extends Exception {
	InvalidAgeException(String msg) {
		System.out.println(msg);
	}
}

public class User_Defind_Exception {
	public static void main(String[] args) {
		try {
			vote(20);
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	public static void vote(int age) throws InvalidAgeException {
		if (age < 18) {
			throw new InvalidAgeException("not eligiable......");
		} else {
			System.out.println("you are eligiable voting..........");
		}
	}

}
