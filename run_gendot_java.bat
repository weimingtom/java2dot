@set scandir="output.txt"
@set CLASSPATH=".;antlrworks-1.4.2.jar;bin"
@set PATH=D:\java\jdk1.6.0_20\bin;%PATH%
@set PATH="D:\java\ctags";%PATH%

@ctags.exe --recurse -o output.txt --fields=aSi java_src
@java -cp %CLASSPATH% GenDotJava %scandir% > log.txt 2>&1
@type log.txt

@echo ========================
@echo Converting dot to gif...
@echo ========================
@dot -Tgif -oout.gif out.dot

@set scandir=
@set CLASSPATH=
@pause
