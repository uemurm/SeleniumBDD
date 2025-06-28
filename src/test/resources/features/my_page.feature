Feature: My Page

  Scenario Outline: Login as
    When I login as "<email>" with "<password>" as password
    Then I should see "<email>" "<name>" "<membership>" "<address>" "<tel>" "<gender>" "<dob>" "<notification>"

    Examples:
      | email             | password | name            | membership | address                   | tel          | gender       | dob               | notification |
      | clark@example.com | password | Clark Evans     | Premium    | Mountain View, California | 01234567891  | male         | not answered      | received     |
      | diana@example.com | pass1234 | Diana Johansson | Normal     | Redmond, Washington       | not answered | female       | April 1, 2000     | not received |
      | ororo@example.com | pa55w0rd!| Ororo Saldana   | Premium    | Cupertino, California     | 01212341234  | other        | December 17, 1988 | not received |
      | miles@example.com | pass-pass| Miles Boseman   | Normal     | not answered              | 01298765432  | not answered | August 31, 1992   | received     |
