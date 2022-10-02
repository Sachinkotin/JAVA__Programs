package ServletPrograms;

import java.io.Serializable;

public class JobApplicationDTO implements Serializable {

	
	
	private String name;
	private String email;
	private String phone;
	private String altPhone;
	private String gender;
	private String qualification;
	private String passOut;
	private String university;
	private String address;
	private String skill;
	private String salary;
	private String experience;
	private String idProof;
	private String idNumber;
	
	public JobApplicationDTO()
	{
		System.out.println("calling default const");
		
	}
	
	
	public JobApplicationDTO(String name,String email,String phone,String altPhone,String gender,
			String qualification,String passOut,String university,String address,String skill,
			String salary,String experience,String idProof,String idNumber)
	{
		this.name=name;
		this.email=email;
		this.phone=phone;
		this.altPhone=altPhone;
		this.gender=gender;
		this.qualification=qualification;
		this.passOut=passOut;
		this.university=university;
		this.address=address;
		this.skill=skill;
		this.salary=salary;
		this.experience=experience;
		this.idProof=idProof;
		this.idNumber=idNumber;
		
	}
	

	@Override
	public String toString() {
		return "JobApplicationDTO [name=" + name + ", email=" + email + ", phone=" + phone + ", altPhone=" + altPhone
				+ ", gender=" + gender + ", qualification=" + qualification + ", passOut=" + passOut + ", university="
				+ university + ", address=" + address + ", skill=" + skill + ", salary=" + salary + ", experience="
				+ experience + ", idProof=" + idProof + ", idNumber=" + idNumber + ", getName()=" + getName()
				+ ", getEmail()=" + getEmail() + ", getPhone()=" + getPhone() + ", getAltPhone()=" + getAltPhone()
				+ ", getGender()=" + getGender() + ", getQualification()=" + getQualification() + ", getPassOut()="
				+ getPassOut() + ", getUniversity()=" + getUniversity() + ", getAddress()=" + getAddress()
				+ ", getSkill()=" + getSkill() + ", getSalary()=" + getSalary() + ", getExperience()=" + getExperience()
				+ ", getIdProof()=" + getIdProof() + ", getIdNumber()=" + getIdNumber() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAltPhone() {
		return altPhone;
	}

	public void setAltPhone(String altPhone) {
		this.altPhone = altPhone;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getPassOut() {
		return passOut;
	}

	public void setPassOut(String passOut) {
		this.passOut = passOut;
	}

	public String getUniversity() {
		return university;
	}

	public void setUniversity(String university) {
		this.university = university;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}

	public String getIdProof() {
		return idProof;
	}

	public void setIdProof(String idProof) {
		this.idProof = idProof;
	}

	public String getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
