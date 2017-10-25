# spring-boot-demo

URL :  localhost:8080/create

Request : 
{
  "id": 12,
  "status": "ABC",
  "description": "ABC",
  "applicationName": "ABC",
  "accessType": "ABC",
  "fileName": "ABC",
  "transferMethod": "ABC",
  "rules": [
    {
      "rule": "Rule1"
    },
    {
      "rule": "Rule2"
    }
  ]
}


Delete the auto created info_rule table and create it again using 

CREATE TABLE `info_rule` (
  `id` int NOT NULL,
  `rule_id` int NOT NULL
) 

