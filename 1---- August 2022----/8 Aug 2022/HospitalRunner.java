class HospitalRunner
{

   public static void main(String [] args)
   {

	  Founder founder=new Founder ("Devendra","Ram Nagar",1958,true,50,Profession.BUSINESSMAN);
	  
	  String [] equip= {"Wheel Chairs","Ventillators","X ray scanner","MRI scanner","CT scan","BP monitor"};
	   
	  Hospital hospital=new Hospital("JAYADEV",2000,equip,Specialisation.CARDIOLOGIST,founder);
	  
	  hospital.printData();
	  
   }


}