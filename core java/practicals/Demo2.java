
interface Event {
   public void start();
}
interface Sports {
   public void play();
}
interface Hockey extends Sports, Event{
   public void show();
}
class Demo implements Event,Sports{
		 public void start() {
            System.out.println("Start Event");
         }
         public void play() {
            System.out.println("Play Sports.");
         }
         public void show() {
            System.out.println("Show Hockey.");
         }
}
public class Demo2{
   public static void main(String[] args){
      Demo hockey = new Demo();
      hockey.start();
      hockey.play();
      hockey.show();
   }
}