#!/bin/tcsh

# Create A branch 'blahblah` and do the changes in that branch.
#
# Generate the extended classes

# Generate the Supporting Visitor classes


set GenerateExtendedClasses='java -cp $classpath com.p4.ANTLR.generator.Generator setExtendedContext.properties'
set response=`git checkout -b blahblah`
set response=$?

if ($response == 128 || $response == 0) then
    echo "Successfully moved to branch 'blahblah'"
    set response=`git pull origin master`
    if ($response != 0) then
        echo "Failed to sync the branch with the master"
    endif
    set response=`$GenerateExtendedClasses`
    if ($response != 0) then
        echo "Failed to generate extended & visitor classes"
    endif





endif




echo $response
echo $x
