class A {
  public String cmd;
  public String cmd2;
  public static void foo(A a) {
    Runtime.getRuntime().exec(a.cmd);
    Runtime.getRuntime().exec(a.cmd2);
  }
  public static void main(String[] args) {
    A a = new A();
    a.cmd = args[1];
    foo(a);
  }
}
