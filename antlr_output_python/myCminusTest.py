#!/Users/lmanrique/anaconda3/bin/python
import sys
from antlr4 import *
from CminusLexer import CminusLexer
from CminusParser import CminusParser
from CminusListener import CminusListener
from CminusVisitor import CminusVisitor


class CminusListener(CminusListener):

    def exitVar(self, ctx):
        pass
        #print(ctx.getText())
    def enterFun_declaration(self, ctx):
        pass
        #print(ctx.getText(), end = "\n\n")
    def enterSimple_expression(self, ctx):
        print(ctx.getText(), end = "\n\n")

input_stream = FileStream('code_test.c-')
lexer = CminusLexer(input_stream)
stream = CommonTokenStream(lexer)
parser = CminusParser(stream)
tree = parser.program()

printer = CminusListener()
walker = ParseTreeWalker()
walker.walk(printer, tree)


def explore(elem, indentation):
    ruleName = CminusParser.ruleNames[elem.getRuleIndex()]
    print(" " * indentation, end = '')
    print(ruleName)
    for i in range(0, elem.getChildCount()):
        element = elem.getChild(i)
        try: 
            element.getRuleIndex()
            explore(element, indentation + 1)
        except:


explore(tree, 0)