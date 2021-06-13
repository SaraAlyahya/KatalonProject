Feature: Login

  Scenario: Login to The System with the User of Mohammad Alsukhun
    Given User Navigates to the MMS
    When User Maximizes the Screen
    And User Enters m.sukhun in UserName Field
    And User Enters Valid Password
    And User Clicks on Login Button
    Then From My Meetings Screen the User Clicks on View Button
    And User Clicks on Topic Button
    And User Clicks on QA Plan Review
    And From QA Plan Review the User Clicks on Attachment Button
    Then User Fills Title Field
    Then User Clicks on Submit Button for Attachment
    And User Clicks on Topic Button
    And User Clicks on QA Plan Review
    And From QA Plan Review the User Clicks on Link Button
    And User Fills the Title
    And User Fills URL
    Then User Clicks on Submit Button for Link
    And User Closes the Link Box
    And From QA Plan Review the User Clicks on Comment Button
    And User Fills Comment
    Then User Clicks on Submit Button for Comment
    And User Closes the Box
    Then User Clicks on Meeting Details
    And User Scrols down the Screen
    Then User Clicks on Approve Button
    Then Close the Browser
