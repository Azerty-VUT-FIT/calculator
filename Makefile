# define a makefile variable for the java compiler
#
JCC = javac

# define a makefile variable for compilation flags
# the -g flag compiles with debugging information
#
JFLAGS = -g
TESTS = testMathLib.class
curr_dir = $(shell pwd)

# typing 'make' will invoke the first target entry in the makefile 
# (the default one in this case)
#
default: testMathLib.class mathLib.class gui.class

testMathLib.class: testMathLib.java
        $(JCC) $(JFLAGS) testMathLib.java

mathLib.class: mathLib.java
        $(JCC) $(JFLAGS) mathLib.java

gui.class: gui.java
        $(JCC) $(JFLAGS) gui.java

# Removes all .class files, so that the next make rebuilds them
#
pack:
	zip -r $(authors).zip $(curr_dir)
doc:
test:
	@$(MAKE) && ./$(TESTS)
clean: 
        $(RM) *.class