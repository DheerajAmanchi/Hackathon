Feature: Regression suite of UrbanLadder Automation

	Scenario: navigating to bookshelves page through Explore Our Furniture Range menu
		Given user should naviagate to urbanladder website
		When user clicks bookshelves menu item
		Then user should navigate to bookshelves page
		
	Scenario: navigating to bookshelves page through study room furniture
		Given user should naviagate to urbanladder website
		When user clicks on study
		Then user should navigate to Study room furniture page
		When user clicks on storage 
		Then user should navigate to storage page
		When user clicks on bookshelves 
		Then user should navigate to bookshelves page
		
	Scenario: navigating to study chairs page through study room furniture
		Given user should naviagate to urbanladder website
		When user clicks on study
		Then user should navigate to Study room furniture page
		When user clicks on study chairs 
		Then user should be navigated to the Studychairs page
		
	Scenario: Checking search functionality
		Given user should naviagate to urbanladder website
		When user enters the search value as "<value>"
		And user click on the search icon
		Then user should navigate to search results page

		Examples:
		| value        |
		|Office Chairs |
		
	Scenario: Check track order functionality
		Given user should naviagate to urbanladder website
		When user clicks on track order button
		Then user should navigate to orders tracking page
		
	Scenario: Check Wishlist functionality
		Given user should naviagate to urbanladder website
		When user clicks on Wishlist button
		Then user should navigate to create an account page
		
	Scenario: Check cart functionality
		Given user should naviagate to urbanladder website
		When user clicks on cart button
		Then user should navigate to cart page
	
	Scenario: Check the material filter functionality
		Given user should naviagate to urbanladder website
		When user clicks on the Study menu item
		And user clicks on bookshelves submenu item
		And user selects material type "<type>"
		Then bookshelves made out of selected material should be displayed "<type>"
		
		Examples:
		| type            |
		| Engineered Wood |
		| Solid Wood      |
		| Bamboo          |
		
	Scenario: Check the brand filter functionality
		Given user should naviagate to urbanladder website
		When user clicks on the Study menu item
		And user clicks on bookshelves submenu item
		And user selects the brand "<brand>"
		Then selected brand bookshelves should be displayed "<brand>"
		
		Examples:
		| brand                   |
		| By Urban Ladder         |
		| By Woodbuzz             |
		| By Saffron Art & Crafts |
		
	Scenario: Check the sort by functionality
		Given user should naviagate to urbanladder website
		When user enters the search value as "<value>"
		And user click on the search icon
		And user selects the sort type "<type>"
		Then verify if the sort is applied or not "<type>"
		
		Examples:
		| value              | type               |
		| Bookshelves        | Recommended        |
		| Bookshelves        | Price: Low to High |
		| Bookshelves        | New Arrivals       |
		