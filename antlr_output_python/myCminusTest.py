#!/Users/lmanrique/anaconda3/bin/python
import sys
from antlr4 import *
from CminusLexer import CminusLexer
from CminusParser import CminusParser
from CminusListener import CminusListener
from CminusVisitor import CminusVisitor


class CminusListener(CminusListener):

    def exitVar(self, ctx):
        print(ctx.getText())
    def enterFun_declaration(self, ctx):
        print(ctx.getText(), end = "\n\n")

input_stream = FileStream('code_test.c-')
lexer = CminusLexer(input_stream)
stream = CommonTokenStream(lexer)
#stream.fill()
#listener = CminusListener()
parser = CminusParser(stream)
#parser.addParseListener(listener)
tree = parser.program()

printer = CminusListener()
walker = ParseTreeWalker()
walker.walk(printer, tree)