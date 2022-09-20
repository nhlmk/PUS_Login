Feature: Login

  #Valid email = nihalimek@gmail.com
  #Valid password = heqBuf-perdoc-1syfdy


  @Case1
  Scenario Outline: User enters valid credentials
    Given user is on the home page of application
    When user clicks the signin link from the top right corner
    And user enters below "<username>" and "<password>"
    And user clicks Login button
    Then user should see the dashboard page

    Examples:
      | username            | password             |
      | nihalimek@gmail.com | heqBuf-perdoc-1syfdy |

  @Case2
  Scenario Outline: User does not enter any credentials
    Given user is on the home page of application
    When user clicks the signin link from the top right corner
    And user enters below "<username>" and "<password>"
    And user clicks Login button
    Then user should see the error message - This field is required

    Examples:
      | username            | password             |
      |                     | heqBuf-perdoc-1syfdy |
      | nihalimek@gmail.com |                      |
      |                     |                      |

  @Case3
  Scenario Outline: User enters invalid credentials
    Given user is on the home page of application
    When user clicks the signin link from the top right corner
    And user enters below "<username>" and "<password>"
    And user clicks Login button
    Then user should see the error message - Incorrect email or password

    Examples:
      | username            | password             |
      | popupsmart@mail.com | heqBuf-perdoc-1syfdy |
      | nihalimek@gmail.com | popupsmart           |
      | popupsmart@mail.com | popupsmart           |