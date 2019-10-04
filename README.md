# Katalon Studio Samples: BDD Cucumber Tests
Katalon Studio is a free and easy-to-use automated functional and regression testing platform. It provides users the ability to implement full automated testing solutions for their application projects with minimal engineering and programming skill requirements.

## Getting Started
These instructions will get you a copy of the project up and running on your local machine.

### Setting Up
- [Check out](https://git-scm.com/book/en/v2/Git-Basics-Getting-a-Git-Repository) the code from this repository
- [Open the project](https://docs.katalon.com//display/KD/Manage+Test+Project) from Katalon Studio
- If you don't see the project in Katalon Studio after it has loaded; use Windows > Reset perspective... to fix this issue.

### Executing a Feature
![Execute a simple feature](https://github.com/katalon-studio-samples/katalon-bdd-cucumber-tests/blob/master/Tutorials/Figures/Execute%20a%20feature.png?raw=true)
1. Expand the **Include** structure, where all the features and step definition scripts located
2. Select the **Feature** you want to execute
3. Execute the **Feature**

## Test Exercise #1 (Automation)
1. Create two BDD Cucumber scenarios (positive and negative scenarios)  
    a. From google.cm search for hostmaker.com  
    b. After search successful, open hostmaker.com link  
    c. Put "Barkleys Hill, Bristol, UK" into address field and click Compare Packages  
    d. Verify that Essential, Handsfree and Plus options are displayed  

 For negative scenario pick any variations of previous 4 steps.   

2. Improve your test case with API checks of hostmaker.com. After executing the test, check that any hostmaker API endpoint returns 200.


## Test Exercise #2 (SQL)
1. In hosts table: find all hosts from london, who were last modified by users.
2. Using properties table, find how many properties have these hosts.
3. Check how many properties have added their maintenance preference, use property_maintenance_terms table for that.
4. Present the search results in a more human readable form.
