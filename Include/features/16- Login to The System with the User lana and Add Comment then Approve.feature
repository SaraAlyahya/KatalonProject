Feature: Login

  Scenario: Login to The System using the User of Fadi ALi
    Given User Navigates to the MMS
    When User Maximizes the Screen
    And User Enters fadi in UserName Field
    And User Enters Valid Password
    And User Clicks on Login Button
    Then From My Meetings Screen the User Clicks on View Button
    And User Clicks on Topic Button
    And User Clicks on QA Plan Review
    And From QA Plan Review the User Clicks on Comment Button
    And User Fills Comment
    Then User Clicks on Submit Button for Comment
    And User Closes the Comment Box
    Then User Clicks on Meeting Details
    And User Scrols down the Screen
    Then User Clicks on Approve Button
    Then Close the Browser
