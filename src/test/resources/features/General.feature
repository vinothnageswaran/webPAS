Feature: Webpas booking



   Scenario Outline: Webpas appointment
    Given I open "https://webpas-uat.hdwa.health.wa.gov.au/uat/Login.html" website
  	When I login using credentials "<Username>" and "<Password>"
    And Click "Loginwebpas"
    And Switchtowindow
    And Clickid "Outpatientclerk"
    And Switchtoframe
    And Click "Star"
    And Switchtoframe1
    And Enter "Surname" as "<Surname>" 
    And Enter "Givenname" as "<Givenname>"
    And Click "Search"
    And Click "Newregistration"
    And Enter "Title" as "<Title>"
    And Enter "Gender" as "<Gender>"
    And Enter "DOB" as "<DOB>"
    And Enter "Marital" as "<Marital>"
    And Enter "Country" as "<Country>"
    And Enter "Indegenious" as "<Indegenious>"
    And Enter "Resident" as "<Resident>"
    And Enter "Interpreter" as "<Interpreter>"
    And Enter "Address" as "<Address>"
    And Enter "Suburb" as "<Suburb>"
    And Enter "Postcode" as "<Postcode>"
    And Enter "Medicare" as "2924200471"
    And Enter "Sno" as "1"
    And Enter "Validto" as "122021"
    And Enter "Mobile" as "0400000000"
    
    And Click "Register"
    And Acceptalert
    
    Then Get "UMRN" and "<Sno>"
    
    
    
    
    Examples:
    |Username|Password|Surname|Givenname|Title|Gender|DOB|Marital|Country|Indegenious|Resident|Interpreter|Address|Suburb|Postcode|Sno|
    |he119941|xxx|Patient9|Patient9|   Mr|Male   |20101982|Married|1 Western Australia|Other |Resident|No|67 Walters drive|Osborne Park|6017|1|
    |he119941|xx|Patient10|Patient10|   Mr|Male   |20101982|Married|1 Western Australia|Other |Resident|No|67 Walters drive|Osborne Park|6017|1|
    
    
    
    
    