package request;

import org.testlib.TestClass;

public class HelloWorld {
    static String source() { return ""; }
    static void sink(String x) {}
    static String spread(String x) { return ""; }
    static void sink2(String x, Map<String, String> m) {}

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public static String show(String name) {
        String a = source();
        String aa = spread(a);
        sink(aa);

        sink2(name, null);

        String bb = sanitize(aa);
        sink(bb);
        
        auto c = new TestClass();
        String d = c.foo(a);
        sink(d);
    }
}
