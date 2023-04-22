Feature: To validate the login functionality for facebook application
Background:
Given To launch the chrome browser and maximize window




Scenario: To VALIDATE login with valid username and invalid password
When To launch the url of facebook application
And To pass valid username to the email field
And To pass valid password too the password field
And To click the login button
And To check wether  navigate to homepage or not
Then TO close the browser


Scenario Outline: To validate the plus and minus combination of fb login functionality
When user has to hit the facebook url
And USER HAS TO PAss the data"<emaildatas>" to the email field
And user has to pass the data"<passworddatas>" to the password field
And user has to click the login button
Then user has to close the browser



Examples:
| emaildatas            | passworddatas       |
| amaleshmsc@gmail.com  | 9600683826          |
| abc@gmail.com         | 12345678            |
| amaleshbsc@yahoo.in   | 9715123690          |
| amaleshgang@gmail.com |  7904652525         |
| gupt@reddifmail.com   | asd123              |
