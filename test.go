package main
import "github.com/xxx/testlib"
func main() {
    inp := __input()
	e := testlib.NewEngine()
    e.Where(inp)
}