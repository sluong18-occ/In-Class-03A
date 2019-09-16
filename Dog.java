package ic03b.question3;

import java.util.*;

public class AnimalRunner
{
  public static void main(String[] args)
  {
    Arraylist dogcatList = new ArrayList();
    dogcatList.add(new Dog("Fred"));
    dogcatList.add(new Cat("Wanda"));
    for (Object obj : dogcatList)
    {
      obj.speak();
    }
  }
}
