Feature: Verification of User Addresses

  Background:
    Given JSON Placeholder API is accessible

  Scenario Outline: Confirm information of the user's address
    Given User "<User>" is registered in the system
    When User fetches the details for the user "<User>"
      | Street   | Suite   | City   | Zipcode   | Latitude   | Longitude   |
      | <Street> | <Suite> | <City> | <Zipcode> | <Latitude> | <Longitude> |
    Then should return an existence of the user "<User>" information
    Examples:
      | User                     | Street           | Suite     | City      | Zipcode | Latitude | Longitude |
      | Nicholas Runolfsdottir V | Ellsworth Summit | Suite 729 | Aliyaview | 45169   | -14.3990 | -120.7677 |

