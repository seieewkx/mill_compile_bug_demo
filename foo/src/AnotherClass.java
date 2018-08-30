// This class must be here to get the wrong `mill foo.compile` return code.
class AnotherClass2 {

}

class AnotherClass {
  public int length(String world) {
    // Miss () after length. Make the compile error.
    return world.length;
  }
}
