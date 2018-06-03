Feature: Sign in and contact us

@test
  Scenario: Agility login
    When I open "http://pchagility-uat.hdwa.health.wa.gov.au/pch_agility_uat/mainmenu.aspx" website
    Then Click "Asset"
    Then I login using credentials "abc@xyz.com" and "Test@123"
  Scenario: Successful login
    When I open "http://automationpractice.com" website
    Then I login using credentials "abc@xyz.com" and "Test@123"
  Scenario: unsuccessful login
    When I open "http://automationpractice.com" website
    Then I login using credentials "abc@xyz1.com" and "Test@123"
  Scenario: Contact us
    When I open "http://automationpractice.com" website
    Then I contact customer service with order reference "abc" and message "hello there"
    
   