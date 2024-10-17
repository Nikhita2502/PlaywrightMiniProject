Feature: Search for topic on Playwright site


  Scenario Outline: Search for a topic in the Playwright
    Given navigate to playwright page
    When select Java from the dropdown with name Node.js
    And confirm the java page is opened
    And  click on the search box
    And enter "<topic>" in the search box
    Then  should see the "<header>" topic in the page
    And close the browser window

    Examples:
      | topic         | header         |
      |Selectors      |class-selectors |
      |Screenshots    |screenshots     |
     

