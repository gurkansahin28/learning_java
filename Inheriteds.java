class Animal {
  public void animalSound() {
    System.out.println("The animal makes a sound");
  }
}
//------------------------------------------------------------
class Pig extends Animal {
  @Override
  public void animalSound() {
    System.out.println("The pig says: wee wee");
  }
}
//-------------------------------------------------------------
class Dog extends Animal {
  @Override
  public void animalSound() {
    System.out.println("The dog says: bow wow");
  }
}
//-----------------------------------------------------------
class Inheriteds {
  public static void main(String[] args) {
    Animal myAnimal = new Animal();
    Animal myPig = new Pig();
    Animal myDog = new Dog();

    System.out.println("Followings are method outputs.");    
    myAnimal.animalSound();
    myPig.animalSound();
    myDog.animalSound();
  }
}
//--------------------------------------------
