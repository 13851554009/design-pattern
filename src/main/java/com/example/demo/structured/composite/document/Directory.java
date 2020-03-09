package com.example.demo.structured.composite.document;

import java.util.ArrayList;
import java.util.List;

public class Directory extends Document {
  private List<Document> list;
  private int level;

  public Directory(String name, int level) {
    super(name);
    this.level = level;
    list = new ArrayList<>();
  }

  @Override
  protected void print() {
    System.out.println(name);
    for (int i = 0; i < list.size(); i++) {
      Document document = list.get(i);
      for (int j = 0; j < level; j++) {
        System.out.print("--");
      }
      document.print();
    }
  }

  public Boolean add(Document document) {
    return list.add(document);
  }
}
