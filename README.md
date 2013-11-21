TicTacToe
=========
Travis Test status: [![Build Status](https://travis-ci.org/MuffinBandits/TicTacToe.png?branch=master)](https://travis-ci.org/MuffinBandits/TicTacToe.png?branch=master)

Heroku link: http://muffinbandits.herokuapp.com/

Travis link: https://travis-ci.org/MuffinBandits/TicTacToe/

Late-term Assignment

Authors:

arni11

sindris12

bjarnthor12

sigruns12

sindri12

theodor11

thordurt12

The following programs are required for this project to run 

1.Git

2.Apache-Maven 3.1.1

3.Java JDK version 7 (Java JDK 1.7.025)

Install information for platforms

1. Windows:
2. MacOS: 

export JAVA_HOME=`/Library/Java/JavaVirtualMachines/jdk1.7.0_45.jdk/Contents/Ho$

When installing Maven on OS X
- First thing is to download Maven which is found at maven.apache.org/download.cgi , unpack at a safe location.

First you want to check the JAVA update

    javac -version
    "Java is up to date"

If your Java version is not up to date you need to download the Java version 7 JDK from http://www.oracle.com/technetwork/java/javase/downloads/index.html

Set maven environment variables, add M2_HOME, M2, MAVEN_OPTS to environment variables.

    -export M2_HOME=/usr/local/apache-maven/apache-maven-2.2.1
    -export M2=%M2_HOME%\bin
    -MAVEN_OPTS=-Xmx512m

Add Maven bin directory location to system path

    -export PATH=$M2:$PATH

Now append M2 variable to System Path
Verify Maven installation

    mvn --version

and the output should be:

    Apache Maven 3.1.1 (0728685237757ffbf44136acec0402957f723d9a; 2013-09-17 15:22:22+0000)
    Maven home: /Users/sindri4ursuccess/Documents/apache-maven-3.1.1
    Java version: 1.7.0_45, vendor: Oracle Corporation
    Java home: /Library/Java/JavaVirtualMachines/jdk1.7.0_45.jdk/Contents/Home/jre
    Default locale: en_US, platform encoding: UTF-8
    OS name: "mac os x", version: "10.9", arch: "x86_64", family: "mac"
		
3. Linux:

For installation you need to type the following commands:

    sudo apt-get install git
    sudo apt-get install maven

Now that you have maven and git installed you can clone your repository

    git clone https://github.com/MuffinBandits/TicTacToe/

Our implementation comes prepared with scripts for building the project. You are required to be in your \TicTacToe folder

    bin/fresh

If the build fails your JAVA_HOME path is incorrect and you need to add this line to your ~/.bash_profile file: (if it does not exist, create it)

    export JAVA_HOME="\$(/usr/libexec/java_home)"
    
Your app now runs on your computer where Spark ignites, now you can open a tab on your browser and connect to localhost:4567

    
    
