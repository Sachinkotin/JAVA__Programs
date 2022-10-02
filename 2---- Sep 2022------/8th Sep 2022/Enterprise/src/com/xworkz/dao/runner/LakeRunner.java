package com.xworkz.dao.runner;

import com.xworkz.dao.*;
public class LakeRunner {

	public static void main(String[] args) {

		LakeDAOImplementor dao1= new LakeDAOImplementor();
		dao1.save("Kolleru lake");
		dao1.save("Manas Sarovar Lake");
		dao1.save("BTM Lake");
		dao1.save("Bilandoor lake");
		dao1.save("Unchalli lake");
		dao1.printAllLakes();
		
	}

}
