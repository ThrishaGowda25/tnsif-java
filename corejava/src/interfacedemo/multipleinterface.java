package interfacedemo;
interface Camera{
	void takephoto();
}
interface Musicplayer{
	void playmusic();
}
class Smartphone implements Camera,Musicplayer{
	

@Override
public void playmusic() {
	System.out.println("taking a photo");
}
@Override
public void takephoto() {
	System.out.println("taking a photo");
	
}
}
public class multipleinterface {
   public static void main(String[] args) {
	Smartphone s=new Smartphone();
	s.playmusic();
	s.takephoto();
}
}