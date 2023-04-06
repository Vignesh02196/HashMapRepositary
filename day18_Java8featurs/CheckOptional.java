package com.onesoft.day18_Java8featurs;

import java.util.Optional;

public class CheckOptional {
	public static void main(String args[]) {
		String a="viji";
		Optional op=Optional.ofNullable(a);
		if(op.isPresent()) {
			System.out.println(a.toUpperCase());
		}
		else {
			System.out.println("DB is null");
		}
		System.out.println(op.orElse("Out of Stock"));
	}

}
