@set PATH=D:\java\jdk1.6.0_20\bin;%PATH%
@mkdir bin
@del /Q bin\*.class
@javac -cp ".;antlr-runtime-3.3.jar;src" -d bin src\GenDotJava.java
@pause
