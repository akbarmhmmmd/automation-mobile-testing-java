@akbar-testing @kompas-id @home
Feature: Kompas.id App - Home Page

	Background:
		Given User on Kompas.id App Startup Page
		When User tap Lewati on Startup Page
		And User tap Lewati on Home Page
		
	Scenario Outline: User can Navigate to navigation menu
		And User tap <nav> navigation button
		Then User success redirect to <navPage> page

			Examples:
			| nav    | navPage |
			| ePaper | ePaper  |
			| Buku   | Buku    |
			| Akun   | Akun    |
		
	Scenario: User can swipe on home page
		And User swipe right page
		And User swipe left page
		Then User success do swipe on all page

	Scenario Outline: User can navigate to page
		And User tap burger menu button
		And User tap <menu> burger button
		Then User redirect to <page> page
		
			Examples:
			| menu      | page      |
			| Fotografi | Fotografi |
			| Muda      | Muda      |
