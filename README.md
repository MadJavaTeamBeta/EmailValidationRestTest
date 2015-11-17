# EmailValidationRestTest
Alternate Project built with Rest Web Service tests for both Boolean and String methods
===========
Using EmailValidationRestTest
===========
SETUP
  1.  clone project from https://github.com/MadJavaTeamBeta/EmailValidationRestTest
  2.  run the EmailValidationBetaClient.  This will host the web service on a Jersey server at http://localhost:9998/test

CONSUMPTION
  {emailtest} will be replaced with the String value of the request ie.    beta@gmail.com
  1. for boolean @Path("isEmailValid/{emailtest}")
  2. for String @Path("isEmailValidstring/{emailtest}")
  3. for JSON
  4. for XML

	
	
