package java.com.person.service;

import java.com.person.dto.PersonDetailsDTO;
import java.com.person.repository.PersonDetailsRepositoryImpl;

public class PersonDetailsServiceImpl implements PersonDetailsService {

	@Override
	public boolean ValidateAndSave(PersonDetailsDTO dto) {
		int id=dto.getId();
		String name=dto.getName();
		String email=dto.getEmail();
		int mobileNo=dto.getMobileNo();
		String gender=dto.getGender();
		String qualification=dto.getQualification();
		String marriedStatus=dto.getMarried();
		String working=dto.getWorking();
		String companyName=dto.getCompanyName();
		int salray=dto.getSalary();
		int age=dto.getAge();
		int experiance=dto.getExperience();
		String location=dto.getLocation();
		String city=dto.getCity();
		String state=dto.getState();
		String country=dto.getCountry();
		int aadharNo=dto.getAadharNo();
		int panNo=dto.getPanNo();
		String alive=dto.getAlive();
		int bankNo=dto.getBankAccountNo();
	
		if(id>0 && id<50000) {
			System.out.println("id looks valid");
			if(name.length()>50 && name.length()<50) {
			System.out.println("names looks valid");
			if(email.length()>5  && email.length()<50) {
				System.out.println("email looks valid");
				if(mobileNo>=10) {
					System.out.println("mobile no looks valid ");
					if(gender.contains("male") && gender.contains("female")) {
						System.out.println("gender looks valid");
						if(qualification.length()>0 && qualification.length()<50) {
							System.out.println("qualification looks valid");
							if(marriedStatus.contains("married") && marriedStatus.contains("unmarrird")) {
							System.out.println("married Status  looks valid ");
							if (working.length()>0 && working.length()<50) {
								System.out.println("working looks valid");
								if(companyName.length()>5 && companyName.length()<100) {
								System.out.println("company name looks valid");	
								if(salray>10000 && salray<25000) {
									System.out.println("salary looks valid");
									if(age>0 && age<100) {
										System.out.println("age looks valid ");
										if(experiance>0 && experiance<65) {
											System.out.println("experiance looks valid ");
											if(location.length()>5 && location.length()<50) {
												System.out.println("location  looks valid ");
												if(city.length()>5 && city.length()<100) {
													System.out.println("city looks valid");
													if (state.length()>5 && state.length()<100) {
														System.out.println("state looks valid ");
														if(country.length()>5 && country.length()<100) {
															System.out.println("country looks valid");
															if(aadharNo>=14) {
																System.out.println("aadharNo looks valid");
																if(panNo>=10) {
																	System.out.println("panNo looks valid");
																	if(alive.contains(alive) && alive.contains("not alive")) {
																		System.out.println("status looks valid ");
																		if(bankNo>=12) {
																			System.out.println("bank number is valid");
																			System.out.println("all data looks good proced to save all the data of person! )-");
																		    System.out.println(dto);
																			PersonDetailsRepositoryImpl repository=new PersonDetailsRepositoryImpl();
																		      repository.save(dto);
																		}else {
																			System.out.println("bank number is invalid");
																		}
																	}else {
																		System.out.println("status looks invalid ");
																	}
																}else {
																	System.out.println("panNo looks invalid");
																}
															}else {
															System.out.println("aadhar looks invalid");
															}
														}else {
															System.out.println("country loks invalid");
														}
													}else {
														System.out.println("state looks invalid");
													}
												}else {
													System.out.println("city looks invalid");
												}
											}else {
												System.out.println("location  looks invalid ");
											}
											
										}else {
											System.out.println("experiance looks invalid ");
										}
									}else {
										System.out.println("ag looks invalid ");
									}
								}else {
									System.out.println("salary looks invalid");
								}
								}else {
									System.out.println("company name looks invalid");
								}
							}else {
								System.out.println("working looks valid");
							}
							}else {
								System.out.println("married status looks invalid");
							}
						}else {
							System.out.println("qualification looka invalid ");
						}
					}else {
						System.out.println("gender looks invalid");
					}
				}else {
				System.out.println("mobile no looks invalid ");
				}
			}else {
				System.out.println("emails looka invalid ");
			}
			}else {
				System.out.println("name looks inavalid");
			}
		}else {
			System.out.println("id looks inavlid");
		}
		return false;
	}

	
}