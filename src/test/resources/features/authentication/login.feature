Feature: Login's all good

  Rule: Customer needs to provide valid credentials to login

    @login
    Example: Customer provides valid credentials to login
      Given User is on the login page
      When  User provides valid credentials
      Then  should be presented with the success message

    @login_invalid
    Scenario Outline: Login with invalid credentials for <username>
      Given User is on the login page
      When User attempts to login with then following credentials:
        | username   | password   |
        | <username> | <password> |
      Then should be presented with the error message <message>
      Examples:
        | username | password             | message                   |
        | tomsmith | pass1                | Your password is invalid! |
        | user2    | SuperSecretPassword! | Your username is invalid! |
        | user3    | pass3                | Your username is invalid! |
        |          |                      | Your username is invalid! |