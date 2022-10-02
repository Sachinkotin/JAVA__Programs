class GymRunner
{
	public static void main(String [] args)
	{
		Trainer trainer=new Trainer("Agni ", 7975590237L,4,28,Gender.MALE);
		
		String[] equip={"Treadmill","Dumb bell","Chest Lift","Chain Pulley"};
		
		Gym gym=new Gym("Gold's Gym",2000,equip,trainer);
		
		gym.printData();
		
	}
	
	
}