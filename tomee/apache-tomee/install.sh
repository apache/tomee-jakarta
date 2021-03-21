#!/bin/bash

for n in target/*jakarta*.zip; do
    classifier=${n/-jakartaee*/}
    classifier=${classifier/*apache-tomee-/}

    mvn install:install-file -Dfile=$n \
                         -DgroupId=org.apache.tomee \
                         -DartifactId=apache-tomee \
                         -Dversion=8.0.3-SNAPSHOT \
                         -Dpackaging=zip \
                         -Dclassifier=$classifier \
                         -DgeneratePom=true
done

