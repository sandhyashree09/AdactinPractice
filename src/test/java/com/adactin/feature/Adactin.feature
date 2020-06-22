Feature: Testing hotel booking and cancellation functionalities in adactin application

@Login
Scenario: Checking the valid username and password for login functionality
Given User launch the adactin application
When User enter the valid username
And User enter the valid password
And User enter in the login button
Then It lands to the homepage successfully

@Searchhotel
Scenario: User search the hotel in application which matches their requirements
Given User launch the hotel booking search page
When User navigated to select location of the hotel
And User selects hotel name
And User selects the roomtype
And User selects number of rooms required
And User enters checkin date
And User enters checkout date
And User selects number of adults per room
And User selects number of child per room
And User enter search button
Then It navigates to confirmation page successfully

@Confirmbooking
Scenario: User have to confirm the booking
Given User launch hotel confirmation page
When User enter select button
And User enter in the continue button

@Billinginformation
Scenario: User have to enter required billing information
Given User gets launched to booking page
When User enter the first name
And User enter the last name
And User enter the billing address
And User enter the creditcard number
And User enter the creditcard type
And User enter the expiry month
And User enter the expiry year
And User enter the ccv number
And User enter the confirm booking
And User click on Itinerary
And User click on logout
Then User close the browser
