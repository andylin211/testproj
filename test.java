class A {
  public static String cmd;
  public static void foo() {
    Runtime.getRuntime().exec(cmd);
  }
  public static void main(String[] args) {
    cmd = "23";
    foo();
    cmd = args[1];
    foo();
  }
}
