# TrishalinPillay2022
The framework created is a BDD framework.

#######################################
How to run the tests locally?
######################################

In the runner package, there is a Web Runner file. 
Each feature file has a tag. Currently all feature files have been tagged as regression. If you right click and choose "Run" Web Runner,
all tests will be run. You can also tag each scenario with a specific tag for example "@SmokeTests" and replace the "@Regression" tag
in the runner class file with "@SmokeTests" and only tests with the tag "@SmokeTests" will run.

################################################
How to run run the tests in when using CI/CD?
################################################

Tool used - Jenkins

Create a new freestyle project 
NB *** Ensure you have installed the Github and Cucumber report Plugins
Enter the Repository URL you have in Github
Specify the branch you want to use for running your tests during the continous intergratin cycle
Choose a build trigger for example Poll Source Code Manager (SCM)
Enter the Shedule you wish to use for example every hour would be "H * * * * "
Add a build step - Example if maven is used -mvn clean test
Add a post build action for example select "Publish Cucumber Reports"
Enter the folder there the report is created for example "target" and the type of file 
Click "Build Now" and job will run

##################################
Link to Calliope.Pro
##################################

https://app.calliope.pro/reports/142432/public/b038b037-66d2-4483-afcd-ad6911504e48

####################################

Improvement for Calliope Pro - I could not find a way to represent my results in graphical format. I have seen this on a you tube video but 
the user needs to know how to do this without clicking everywhere. 

Feature - Add a feature for the user to insert performance testing results so that the business can make appropriate business decisons and 
for the users to identify performance issues. 


###############################################
What was used for scenario selection and why?
###############################################

Only happy flows where covered. Negative tests should be added.

I used a mixure of exploratory testing and used the "Scenario" and write up of what the expected behaviour of a function is. For example
if the write up explained that click would do X i automated the sceanrio based on the "Scenario" or acceptance critera. 
I also check if the page has been loaded.
I did not use log4j to log as there us still a bug that was exposed a few months back which causes security vulnerbilties.

########################################
Importance of my selection?
######################################

All the documentation present defines the acceptance criteria hence why the information given on each sub section is extremely important when
when defining scenarios and ensuring that all loop holes are covered.

###########################################
Next Steps for the project
############################################
Refactor some of the code so that hard coded values are removed.
Look at automated negative scenarios so that not only happy flows are automated 
define a smoke test pack that runs after every development deployment. We cannot always run all tests. 
High impact areas should be identified and tests related to that area should be added to the smoke pack.
Performance testing and security testing could be added. These are extremely important as down time on a website equals loss of
income for the business and security breaches can lead to legal issues and exposure of sensitive data of clients.



