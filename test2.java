package request;

public class HelloWorld {
    static String source() { return ""; }
    static void sink(String x) {}
    static String spread(String x) { return ""; }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public static String show(String name) {
        String a = source();
        String aa = spread(a);
        sink(aa);

        String bb = sanitize(aa);
        sink(bb);
    }
}
