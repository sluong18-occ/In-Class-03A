package ic03b.question3;
import java.util.*;

public class AnimalRunner
{
  public class void main(String[] args)
  {
    ArrayList<Speakable> dogcatList = new ArrayList<Speakable>();
    dogcatList.add(new Dog("Fred"));
    dogcatList.add(new Cat("Wanda"));
    for (Speakable obj : dogcatList)
    {
      obj.speak();
    }
  }
}

    
