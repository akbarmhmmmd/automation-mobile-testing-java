@akbar-testing @api-demos @accessibility
Feature: Accessibility Menu - API Demos

	Background:
		Given User on API Demos app
		When User tap Accessibility menu

	Scenario: User can access Node Provider sub menu
		And User tap Accessibility Node Provider sub menu
		Then Node Provider sub menu successfully accessed by User
		
	Scenario: User can access Node Querying sub menu
		And User tap Accessibility Node Querying sub menu
		And User tap on unchecked checkboxes
		Then Node Querying sub menu successfully accessed by User
		
	Scenario: User can access Service sub menu
		And User tap Accessibility Service sub menu
		Then Service sub menu successfully accessed by User
		
	Scenario: User can access Custom View sub menu
		And User tap Custom View sub menu
		And User tap on first box
		And User tap on second box
		Then Custom View sub menu successfully accessed by User
