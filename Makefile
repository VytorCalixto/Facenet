all:
	javac -J-Xmx2G Programa.java

run:
	java -Xmx2G Programa

compact:
	jar cvf trabalho062.jar ./*
