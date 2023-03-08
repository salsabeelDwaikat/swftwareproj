Feature: Admin login

  Scenario Outline: Admin log in with valid informations 
    Given Admin selected to log in
    When Admin entered the valid <username> and the valid <password>
    Then log in must be successful
    
    Examples: 
      | username | password |
      | "sals"   | "0123"  |
      | "doaa"   | "1234"  |
      | "haya"   | "2345"  |
      
      Scenario Outline: Admin has the wrong password 
    Given Admin selected to log in
    When Admin entered the valid <username> and the unvalid <password>
    Then log in must be field

    Examples: 
      | username | password |
      | "sals"  | "00000"  |
      | "doaa"   | "11111"  |
      | "اaya"   | "22222"  |