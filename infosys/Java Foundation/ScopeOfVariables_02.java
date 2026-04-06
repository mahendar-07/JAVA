class ScopeOfVariables_02 {
  int i = 34;
  static int z;

  static {
    z = 10;
    System.out.println("inside static block: " + z);
  }

  void test() {
    int k = 200;
    System.out.println("local variable: " + (k + i));
  }

  public static void main(String[] args) {
    ScopeOfVariables_02 obj = new ScopeOfVariables_02();
    obj.test();
    System.out.println(obj.i);
  }
}