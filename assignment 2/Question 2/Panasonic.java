package Question2;

public class Panasonic implements TvRemote {
	String color;
	public Panasonic(String color) {
		this.color=color;
	}
 public void displayResolution() {
	 System.out.println("4k");
 } 
 public void tvSize() {
	 System.out.println("120 Inches");
 }
 public String remoteColor() {  
	 return this.color;
 }

}
