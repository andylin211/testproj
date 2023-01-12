class A {
  public String cmd;
  public void foo() {
    Runtime.getRuntime().exec(cmd);
  }
  public static void main(String[] args) {
    A a = new A();
    a.cmd = args[1];
    a.foo();
    a.cmd = "123";
    a.foo();
  }
}
