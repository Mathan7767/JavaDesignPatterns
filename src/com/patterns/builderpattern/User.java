package com.patterns.builderpattern;

public class User {

	private String firstName;
	private String lastName;
	private int userAge;
	private String userAddress;
	private String userNumber;
	
	//All getters, No setters to provide immutability
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public int getUserAge() {
		return userAge;
	}
	public String getUserAddress() {
		return userAddress;
	}
	public String getUserNumber() {
		return userNumber;
	}
	
	/*	User object does not have any setter method, 
	 * 	so its state can not be changed once it has been built.
	 *  This provides the desired immutability.
	 */
	
	public static class UserBuilder{
		private String firstName; //Required
		private String lastName; //Required
		private int userAge;
		private String userAddress;
		private String userNumber;
		
		//Reducing the complexity of the constructor
		public UserBuilder(String firstName, String lastName) {
			super();
			this.firstName = firstName;
			this.lastName = lastName;
		}

		public UserBuilder setUserAge(int userAge) {
			this.userAge = userAge;
			return this;
		}

		public UserBuilder setUserAddress(String userAddress) {
			this.userAddress = userAddress;
			return this;
		}

		public UserBuilder setUserNumber(String userNumber) {
			this.userNumber = userNumber;
			return this;
		}
		
		//Return the finally constructed user object
		public  User build() {
			User userDetails=new User();
			userDetails.firstName=this.firstName;
			userDetails.lastName=this.lastName;
			userDetails.userAge=this.userAge;
			userDetails.userAddress=this.userAddress;
			userDetails.userNumber=this.userNumber;
			
			return userDetails;
		}
		
	}

}
