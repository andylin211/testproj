class A {
  public String cmd;
  public static void foo(A a) {
    Runtime.getRuntime().exec(a.cmd);
  }
  public static void main(String[] args) {
    A a = new A();
    a.cmd = args[1];
    foo(a);
  }
}
