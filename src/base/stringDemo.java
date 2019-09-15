package base;

import java.util.Arrays;

public class stringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "nishant*happy*suman";
		name = name.replaceAll("[^a-zA-Z0-9]", "\n");
		System.out.println(name);

	}

}
