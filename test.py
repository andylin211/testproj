def foo(x):
  eval(x)
  
a = {"a": input(), "b": "123"}
foo(a["a"])
del a["a"]
foo(a["a"])
