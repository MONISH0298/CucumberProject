Feature: Hotel Booking
Scenario: Login scenario
	Given user goes to the Login page
	When user enter the Username as "dinesh0017" 
	And  Enter the password as "9080132507" 
	When user clicks the loginbtn
	Then user navigated to the home page


Scenario: Hotel Search scenario
	When user Selects the location and hotels
	And user Selects the roomType and noOfRooms
	When user enter the checkIn and CheckOut dates
	And User selects adultsPerRoom and childernsPerRoom
	When user clicks the searchBtn
	Then User navigated to Hotel confirmation Page
	
Scenario: Select hotel scenario
	When user clicks radioBtn
	And user the continueBtn
	Then user navigated to Hotel Booking
	
Scenario: Booking scenario
	When user enter the firstName,lastName and billingAddress
	And User enter the creditCard number
	When user selects creditCard Type
	And user selects expirydate and expiryYear
	And user enter the CVV number
	When user clicks the BooknowBtn
	Then User Booked the hotel successfully
	Then user scroll down and takes the screenshot of booking status