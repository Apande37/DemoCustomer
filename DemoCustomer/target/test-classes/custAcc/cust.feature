#Author Amit Pandey
Feature:  create new account
create a new account with valid customer and sufficient balance
Scenario:  create account
Given Customer and opening balance
When for Valid customer
And  valid opening balance create account no
Then create account and store it into db