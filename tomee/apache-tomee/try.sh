#!/bin/bash

(cd $HOME/work/apache/tomee-patch-plugin &&
     mvn clean install $skip
)

(cd $HOME/work/apache/tomee/tomee/apache-tomee &&
     mvn clean install $skip
     
 for n in target/*jakarta*.zip; do echo $n; x=$(basename $n) ;  cp $n /tmp/asmify/dir/${x/jakartaee9-/}; done
)

(cd $HOME/work/tomitribe/kartara &&
     mvn clean install $skip
     
 cp kartara-cli/target/kartara ~/bin/
)

kartara asmify dir /tmp/asmify/dir/ /tmp/asmify/output/

