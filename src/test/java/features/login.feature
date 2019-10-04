Feature: Free CRM Login Feature


#without Examples Keyword
Scenario Outline: Free CRM Login Test Scenario

Given Initialize resources in the beginning of each scenario for Login
Then user enters "<username>" and "<password>"



Examples:
       |username                |password|
       |neeraj4agarwal@gmail.com|Neeraj4@|
