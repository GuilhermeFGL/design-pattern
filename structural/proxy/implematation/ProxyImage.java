package implematation;

import interfaces.Image;

public class ProxyImage implements Image {

   private HeavyImage realImage;
   private final String fileName;

   public ProxyImage(String fileName){
      this.fileName = fileName;
   }

   @Override
   public void display() {
      if(realImage == null){
         realImage = new HeavyImage(fileName);
      }
      realImage.display();
   }
}
