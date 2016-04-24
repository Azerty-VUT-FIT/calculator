# define a makefile variable for the java compiler
#
JCC = javac

# define a makefile variable for compilation flags
# the -g flag compiles with debugging information
#
JFLAGS = -d
TESTS = testMathLib.class
curr_dir = $(shell pwd)
authors = xbilto00xcisar07xhruba09xcervi22
# typing 'make' will invoke the first target entry in the makefile 
# (the default one in this case)
#
default: all ToJAR

all: *.java
	$(JCC) $(JFLAGS) . *.java
Main.class: Main.java
	$(JCC) $(JFLAGS) . Main.java

TestMathLib.class: TestMathLib.java
	$(JCC) $(JFLAGS) . TestMathLib.java

MathLib.class: MathLib.java
	$(JCC) $(JFLAGS) . MathLib.java

Gui.class: Gui.java
	$(JCC) $(JFLAGS) . Gui.java
ToJAR:
	jar -cmf manifest.mf calc.jar toTest
# Removes all .class files, so that the next make rebuilds them
#
pack:
	zip $(authors).zip *.java manifest.mf Makefile
doc:
	javadoc *.java
test:
	@$(MAKE) && java -jar calc.jar -t
clean: 
	$(RM) *.class
