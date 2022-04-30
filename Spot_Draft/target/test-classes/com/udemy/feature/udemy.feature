Feature: Book Selection In Good Read Web Application

  Scenario: login Page
    Given user Launch The GoodRead Application
    When user Follows The Sign In Tab
    And  user Click The Sign In Using Email Tab
    And  user Enters The Email Address With "pradeep.cpk7015@gmail.com"
    And  user Enters The Password With "Books@read"
    Then Click The Sign In Tab
    
  Scenario: book Search
    When user Search the Book name
    And user Hit The Search button
    And  user Select The Want To Read Tab
    Then go To the My Books
    
   Scenario: LogOut
    When user Remove The Book Name From MyBooks
    And user Acknowledge The Remove Alert
    And user Click The Profile Tab
    Then user LogOut from The Application
