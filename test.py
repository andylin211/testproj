class A:
  cmd = ""
  cmd2 = ""

def foo(x):
  eval(x)
  
a = A()
a.cmd = input()
foo(a.cmd)
foo(a.cmd2)
