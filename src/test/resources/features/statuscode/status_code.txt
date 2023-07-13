Feature: Status Codes Validation


  Rule: Status Code corresponds to the expected response

    Scenario Outline: Navigate to different pages and verify status codes
      Given User is on the Status Codes page
      When User selects the <Status Code> status code page
      Then  should return a response <Expected Response> with a status code <Status Code>

      Examples:
        | Status Code | Expected Response                     |
        | 200         | This page returned a 200 status code. |
        | 301         | This page returned a 301 status code. |
        | 404         | This page returned a 404 status code. |
        | 500         | This page returned a 500 status code. |