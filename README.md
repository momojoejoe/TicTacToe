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

3.Java JDK version 7

Install information for platforms

1. Windows
2. OSX 
3. Linux



1. Windows 
=====
Missing.



2. OSX
====

1. Install git.
- Go to https://help.github.com/articles/set-up-git to setup Git.

1.1 Clone repo.
    - Clone this repo to your machine:
    
    git clone https://github.com/MuffinBandits/TicTacToe.git

2. Install Maven.
-  Download Maven at http://maven.apache.org/download.cgi , unpack at a safe location.


3. Make sure you have Java 7.
    - To check which java version you have type:
                java -version

If you don't have version 1.7_xx get  download Java version 7 JDK from http://www.oracle.com/technetwork/java/javase/downloads/index.html

If you get java version "1.7_xx" you should be set. However Maven could still be using java version 1.6. To check that type: 
    
    mvn -version

If Maven is not using versin 1.7.* you need to add this line to your ~/.bash_profile file:

    export JAVA_HOME="$(/usr/libexec/java_home)"    

To run this application simply run bin/fresh and navigate to http://localhost:4567 to play the game.


3. Linux 
=====

1. Install git.
    - Go to https://help.github.com/articles/set-up-git#platform-linux

1.1 Clone repo.
    - Clone this repo to your machine:
        git clone https://github.com/MuffinBandits/TicTacToe.git

2 and 3. Install Maven and Java 7.

    - To install maven and Java JDK 7 run this script.
        bin/linux_setup

To check if Java 7 is installed and in use:

        java -version

If you don't get version 1.7_xx this command lets you choose it:
        sudo update-alternatives --config java
        Select java 1.7_xx.


To run this application simply run bin/fresh and navigate to http://localhost:4567 to play the game.


    
    
