@akbar-testing @kompas-id @login

Feature: Kompas.id App - Login

	Scenario: User can login with Email and Password
		Given User on Kompas.id App Startup Page
		When User tap Lewati on Startup Page
		And User tap Masuk Button
		And User tap Masuk dengan Email Button
		And User input Email Field
		And User input Kata Sandi Field
		And User tap Lewati on Home Page
		Then User redirect to Home Page
		
	Scenario: User can login with Google
		Given User on Kompas.id App Startup Page
		When User tap Lewati on Startup Page
		And User tap Masuk Button
		And User tap Lanjutkan dengan Google
		And User select the registered email
		And User tap Lewati on Home Page
		Then User redirect to Home Page
