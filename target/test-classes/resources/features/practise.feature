Feature: Automation practise

  Background:: Sign in to automation practise home page
    Given I am on automation prictise login page
    Then click on Sign in
    Then navigated to Authenticationpage
    Then provided userName "userName"
    And Provided password "password"
    Then clicked on Sign in button
    Then navidagated to home page


  Scenario: Order TShirt and verify order history
   Given: I am automation prictise home page
   Then: Choosen T-SHIRTS tab
   Then: Selected T-Shirt from search results
   And: Added to cart shoosen T-SHIRTS
   Then: Navigated to proceed to check out
   And: Clicked on proceed to checkout
