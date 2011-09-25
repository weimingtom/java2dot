::ctags.exe -o a.txt --fields=aSi Bitmap.java
::ctags.exe -o Bitmap.txt --fields=aSi java_src\android\graphics\Bitmap.java

set PATH="D:\java\ctags;%PATH%"
ctags.exe --recurse -o output.txt --fields=aSi java_src
pause
