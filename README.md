# homework
**Athenian Homework Template**

This template is meant to show a few simple techniques that may make it easier to test and debug your homework assignments. The layout of the project is a little more complicated than a single java file on a file system, hopefully the reason for the extra complexity will quickly become apparent.

**Build System**

All software projects of any size require a build system. For this example Gradle has been chosen. Gradle is rapidly being adopted by a number of open source projects, and it is the official build system for Android. You can read more about gradle at http://gradle.org. 

A particularly nice feature of Gradle for new users is the fact that the Gradle software can install and configure itself.  This is accomplished by the Gradle Wrapper script that is included in this project. Running the "gradlew" script (Mac/Linux) or gradle.bat (Windows) will install whatever additional software is required to run your build. 

Here is an example of how you would run this build: 

     ./gradlew clean test 
    :clean
    :compileJava
    :processResources UP-TO-DATE
    :classes
    :compileTestJava
    :processTestResources UP-TO-DATE
    :testClasses
    :test
    
    org.athenian.homework.AssgnmentTest > catchException STANDARD_OUT
        2015-09-29 01:47:37 [Test worker] org.athenian.homework.Assignment.instanceMain()
        INFO: Starting homework assignment
    
    org.athenian.homework.AssgnmentTest > catchException PASSED
    
    org.athenian.homework.AssgnmentTest > onePlusOne STANDARD_OUT
        2015-09-29 01:47:37 [Test worker] org.athenian.homework.Assignment.instanceMain()
        INFO: Starting homework assignment
    
    org.athenian.homework.AssgnmentTest > onePlusOne PASSED
    
    BUILD SUCCESSFUL
    
    Total time: 1.787 secs

**Testing and JUnit**

An additional concept that this project introduces is simple automated tests associated directly with the project you are creating. The AssignmentTest.java file demonstrates how tests can be developed along with your code. 



 
