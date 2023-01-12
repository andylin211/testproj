from functools import wraps

def decorator_name(f):
    @wraps(f)
    def decorated(*args, **kwargs):
        eval(args[0])
        return f(*args, **kwargs)
    return decorated
 
@decorator_name
def foo(a):
    pass

a = input()
foo(a)
