# cminus

## Install ANTLR4
       cd /usr/local/lib
       wget https://www.antlr.org/download/antlr-4.7.1-complete.jar
       export CLASSPATH=".:/usr/local/lib/antlr-4.7.1-complete.jar:$CLASSPATH"
       alias antlr4='java -jar /usr/local/lib/antlr-4.7.1-complete.jar'
       alias grun='java org.antlr.v4.gui.TestRig'

## Run       
       antlr4 -o antlr_output/ Cminus.g4
       
       
       
## Testes com o python
  Para conseguir fazer funcionar as classes geradas fiz o teste usando o python.
        
 Instalei o antlr4 para python com o comando:
    conda install -c carta antlr4-python3-runtime

 Baixei o pygrun do github: 
    https://github.com/jszheng/py3antlr4book/tree/master/bin

 Gerei as classes com o comando:
    antlr4 -Dlanguage=Python3 -o antlr_output_python/ -visitor Cminus.g4

 Fiz os testes dos arquivos gerados com o grun:
  ```
  ./pygrun Cminus program --tree code_test.c-
        (program 
           (declaration_list 
              (declaration_list 
                 (declaration 
                    (fun_declaration 
                       (type_specifier int) gcd ( 
                       (params 
                          (param_list 
                             (param_list 
                                (param 
                                   (type_specifier int) u)) , 

   ./pygrun Cminus program --tokens code_test.c- 
      [@0,0:2='int',<4>,1:0]
      [@1,4:6='gcd',<27>,1:4]
      [@2,8:8='(',<6>,1:8]
      [@3,9:11='int',<4>,1:9]
      [@4,13:13='u',<27>,1:13]
      [@5,14:14=',',<8>,1:14]
      [@6,16:18='int',<4>,1:16]
      [@7,20:20='v',<27>,1:20]
      [@8,21:21=')',<7>,1:21]
      [@9,22:22='{',<9>,1:22]
      [@10,32:33='if',<11>,2:1]
      [@11,35:35='(',<6>,2:4]
      [@12,36:36='v',<27>,2:5]
      [@13,38:39='==',<20>,2:7]
```
No pygrun está tudo funcionando corretamente, porém quando uso o código a seguir a árvore não é gerada corretamente:
```
import sys
from antlr4 import *
from CminusLexer import CminusLexer
from CminusParser import CminusParser
from CminusListener import CminusListener
from CminusVisitor import CminusVisitor


input = FileStream('code_test.c-')
#input = InputStream('code_test.c-')
lexer = CminusLexer(input)
stream = CommonTokenStream(lexer)
parser = CminusParser(stream)
tree = parser.program()
 ```
 ```
In [4]: tree.getChild(0).getText()
Out[4]: 'intgcd(intu,intv){if(v==0){returnu;}else{returngcd(v,u-u/v*v);}}voidmain(void){intx;inty;intres;x=input();y=input();res=gcd(x,y);output(res);return;}'
```

É gerada uma árvore de altura = 1 .... 

