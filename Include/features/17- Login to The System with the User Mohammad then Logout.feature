Feature: Login

  Scenario: Login to The System with the User of Mohammad
    Given User Navigates to the MMS
    When User Maximizes the Screen
    And User Enters mohammad in UserName Field
    And User Enters Valid Password
    And User Clicks on Login Button
    Then From My Meetings Screen the User Clicks on View Button  
    Then User Clicks on Logout Button
    Then Close the Browser
