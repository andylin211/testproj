class A {
  public static void foo(String cmd) {
    Runtime.getRuntime().exec(cmd);
  }
  public static void main(String[] args) {
    String[] myList = {"123", args[1], "123123"};
    foo(myList[1]);
    foo(myList[0]);
  }
}
