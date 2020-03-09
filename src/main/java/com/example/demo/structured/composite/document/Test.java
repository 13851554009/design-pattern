package com.example.demo.structured.composite.document;

public class Test {
  public static void main(String[] args) {
    Document jtFile = new File("交通");
    Document cwFile = new File("财务");
    Document xxFile = new File("学校");
    Directory js = new Directory("江苏省", 2);
    Directory ah = new Directory("安徽省", 2);
    Directory zj = new Directory("浙江省", 2);
    js.add(jtFile);
    js.add(cwFile);
    js.add(xxFile);
    ah.add(cwFile);
    Directory zg = new Directory("中国", 1);
    zg.add(js);
    zg.add(ah);
    zg.add(zj);
    zg.print();
  }
}
