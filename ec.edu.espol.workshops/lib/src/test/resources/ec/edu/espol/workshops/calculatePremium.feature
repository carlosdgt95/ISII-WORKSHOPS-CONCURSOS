Feature: Insurance premium calculation for customers 

Scenario: The costumer is an 86-year-old man, married and licensed. 
Given: 86, H, true, true
When: calculate the insurance premium
Then: I should be show -1

Scenario: The costumer is an 45-year-old man, single and without a license. 
Given: 45 ,H , false, false
When: calculate the insurance premium
Then: I should be show 400

Scenario:The costumer is an 26-year-old woman, single and licensed. 
Given: 26 , M ,  false , true
When: calculate the insurance premium
Then: I should be show 300

Scenario: The costumer is an 21-year-old male, single and licensed. 
Given: 21,  H,  false, true
When: calculate the insurance premium
Then: I should be show 2000

Scenario: The costumer is an Male, 60 years old, married and licensed. 
Given: 60, H ,  true, true
When: calculate the insurance premium
Then: I should be show 200

Scenario: The costumer is an 20 year old married woman without a license. 
Given: 20, M,  true, false
When: calculate the insurance premium
Then: I should be show -1

Scenario: The costumer is an 45 year old single man without a license. 
Given: 45, F ,false,false
When: calculate the insurance premium
Then: I should be show -1

Scenario:The costumer is an 50 year old married woman on leave. 
Given: 50, M ,true,true
When: calculate the insurance premium
Then: I should be show 200

Scenario: The costumer is an 20-year-old woman, married and without a license. 
Given: 20, M ,true,false
When: calculate the insurance premium
Then: I should be show -1

Scenario Outline: The total value of insurance for the costumer.
Given: "<age>", "<gender>", "<married_status>" , "<hasLicense>"
When: Call the getPremium function
Then: I should be show "<value>"

Examples:
|age	|gender	|married_status	|hasLicense	|value|
|86	|H	|true	|true	|-1|
|45	|H	|false	|false	|400|
|26	|H	|false	|false	|300|
|21	|M	|false	|true	|2000|
|60	|H	|true	|true	|200|
|20	|M	|true	|false	|-1|
|45	|F	|false	|false	|-1|
|50	|M	|true	|true	|200|
|20	|F	|true	|false	|-1|





