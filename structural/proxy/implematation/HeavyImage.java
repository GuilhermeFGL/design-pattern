package implematation;

import interfaces.Image;

public class HeavyImage implements Image {

   private final String FILE_NAME;

   public HeavyImage(String fileName){
      this.FILE_NAME = fileName;
      loadFromDisk(fileName);
   }

   @Override
   public void display() {
      System.out.println("Displaying " + FILE_NAME);
   }

   private void loadFromDisk(String fileName){
      System.out.println("Loading " + fileName);
   }
}
