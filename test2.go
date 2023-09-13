package main

import (
	"context"
	"net/http"
)

func entry(w http.ResponseWriter, r *http.Request) {
	b := testlib.source()
	bb, _ := testlib.spread(b)
	testlib.sink(bb)
}

func (h *Handler) XXXXA(ctx context.Context, req pb.XXXXXB) (pb.XXXXXXC, error) {
	b := req.source()
	testlib.sink(bb)
}
