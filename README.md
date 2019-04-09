# p4common

p4common is an utility project for P4 related tools developed within 
Memoir Engineering group in Cisco. This sandbox project is developed in Java

  - Some commonly used utility classes
  - ANTLR grammar for parsing ANTLR .g4 files
  - p4 pre-processor
  
  
Components of the Infra

1. Properties File
	Class Generator uses this file 'cfg/SetExtendedContext.properties' to read
	the input params.
	

2. Template Files
	Class Generator uses these templates to generate the  extended classes.

3. Class Generator
	Core engine.
	
	
Steps to Integrate changes to the extended classes.

1) Create a branch 'blah'.
	git checkout -b blah
	
2) Do all the changes in the blah branch.
	Generating the java class files is straight fwd. All the parameters are read
from .properties file. and the structure of the java file is read from the 
template files.
	Generator.launch can be used to generate java classes.

3) Merge the 'master' branch changes to the 'blah' branch.

4) If every thing is fine, merge back the changes to the master. Else, let the 
team to work on the branch and resolve the conflicts and merge back the changes
to the main.










	