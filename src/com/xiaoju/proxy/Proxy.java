package com.xiaoju.proxy;

public class Proxy implements Subject {

  private Subject subject;

  public Proxy(Subject subject) {
    this.subject = subject;
  }

  @Override
  public void operate() {
    subject.operate();
  }
}
