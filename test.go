package main
import (
	"fmt"
	"github.com/gorilla/mux"
	"log"
	"net/http"
	"os/exec"
)
func YourHandler(w http.ResponseWriter, r *http.Request) {
	vars := r.URL.Query()
	input := vars["name"][0]
	cmd1 := exec.Command("cmd", "/c", input)
	out, err := cmd1.CombinedOutput()
	fmt.Println(out, err)
	w.Write([]byte(a2))
}

func YourHandler2(w http.ResponseWriter, r *http.Request) {
	vars := r.URL.Query()
	input := vars["name"][0]
	cmd1 := exec.Command("cmd", "/c", input)
	out, err := cmd1.CombinedOutput()
	fmt.Println(out, err)
	w.Write([]byte(a2))
}
func main() {
	r := mux.NewRouter()
	// Routes consist of a path and a handler function.
	r.HandleFunc("/", YourHandler)
	// Bind to a port and pass our router in
	log.Fatal(http.ListenAndServe(":8000", r))
}
