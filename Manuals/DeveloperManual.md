Developer Manual
===============

The following programs are required for this project to run 

    Git

    Apache-Maven 3.1.1

    Java JDK version 7

Install information for platforms

    1. Windows
    2. OSX 
    3. Linux



1. Windows 
=====
Missing.



2. OSX
====

- Go to https://help.github.com/articles/set-up-git to setup Git.

- Download Maven at http://maven.apache.org/download.cgi , unpack at a safe location.


- Make sure you have Java 7. To check which java version you have type:
        
        java -version

- If you don't have version 1.7_xx get  download Java version 7 JDK from http://www.oracle.com/technetwork/java/javase/downloads/index.html

- If you get java version "1.7_xx" you should be set. However Maven could still be using java version 1.6. To check that type: 
    
        mvn -version

- If Maven is not using versin 1.7.* you need to add this line to your ~/.bash_profile file:

        export JAVA_HOME="$(/usr/libexec/java_home)"
        
- Clone this repo to your machine:
    
        git clone https://github.com/MuffinBandits/TicTacToe.git

- To run this application simply run 
    
        bin/fresh 

- Navigate to http://localhost:4567 to play the game.


3. Linux 
=====

- Go to https://help.github.com/articles/set-up-git#platform-linux to set up Git


- Clone this repo to your machine:

        git clone https://github.com/MuffinBandits/TicTacToe.git


- To install maven and Java JDK 7 run this script.

        bin/linux_setup

- To check if Java 7 is installed and in use:

        java -version

- If you don't get version 1.7_xx you can select the version with this command:
        
        sudo update-alternatives --config java

- To run this application simply run 

        bin/fresh 

- Navigate to http://localhost:4567 to play the game.
