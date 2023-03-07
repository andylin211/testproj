package main
import "github.com/xxx/testlib"


type Person struct {}
func (p *Person) foo(x string) {
    e := testlib.NewEngine()
    e.Where(x)
}

func main() {
    inp := __input()
    e := testlib.NewEngine()
    e.Where(inp)

    inp := __input()
    e := testlib.Person()
    e.foo(inp)
}
