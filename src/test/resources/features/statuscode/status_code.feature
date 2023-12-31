Feature: Status Codes Validation


  Rule: Status Code corresponds to the expected response

    @statusCodes
    Scenario Outline: Navigate to different pages and verify <Status Code> code
      Given User is on the Status Codes page
      When User selects the status code <Status Code>
      Then should return a expected response with a message <Response>
      Examples:
        | Status Code | Response                              |
        | 200         | This page returned a 200 status code. |
        | 301         | This page returned a 301 status code. |
        | 404         | This page returned a 404 status code. |
        | 500         | This page returned a 500 status code. |