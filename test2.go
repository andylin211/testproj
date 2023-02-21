package main
import (
	"github.com/xxx/testlib"
	"net/http"
)

func entry(w http.ResponseWriter, r *http.Request) {
	b := testlib.source()
	bb, _ := testlib.spread(b)
	testlib.sink(bb)
}