
Feature: Title of your feature
  I want to use this template for my feature file

 

  Scenario Outline: Title of your scenario outline
    Given user enters home page using the credentials
    When he search for an item as "<item>" and find the details
    Then he tries to add to cart
    And he will be asked for login details

    Examples: 
      | item  |  
      | bag |      
     
