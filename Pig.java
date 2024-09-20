// make an interface
interface Animal {
  public void animalSound(); // interface method (does not have a body)
  public void run(); // interface method (does not have a body)
}

// Pig "implements" the Animal interface
class Pig implements Animal {
  @Override
  public void animalSound() {
    // The body of animalSound() is provided here
    System.out.println("The pig says: wee wee");
  }
  @Override
  public void run() {
    // The body of run() is provided here
    System.out.println("Pig is running");
  }
  public static void main(String[] args) {
    Pig myPig = new Pig();  // Create a Pig object
    myPig.animalSound();
    myPig.run();
  }
}