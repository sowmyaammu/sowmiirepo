
Feature: Title of your feature
  I want to use this template for my feature file



  
  Scenario Outline: Title of your scenario outline
  Given login page is displayed
    Given user gives "<username>"    
    When user enters "<password>" 
    And login page displayed  
   

    Examples: 
      | username    | password       | 
      | Lalitha     |     Password123| 
      
