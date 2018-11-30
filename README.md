# cminus

## Install ANTLR4
       cd /usr/local/lib
       wget https://www.antlr.org/download/antlr-4.7.1-complete.jar
       export CLASSPATH=".:/usr/local/lib/antlr-4.7.1-complete.jar:$CLASSPATH"
       alias antlr4='java -jar /usr/local/lib/antlr-4.7.1-complete.jar'
       alias grun='java org.antlr.v4.gui.TestRig'

## Run       
       antlr4 -o antlr_output/ Cminus.g4
