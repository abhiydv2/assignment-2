package Question2;

public class Sony implements TvRemote {  
	String color;
	public Sony(String color) {
		this.color=color;
	}
 public void displayResolution() {
	 System.out.println("4k");
 } 
 public void tvSize() {
	 System.out.println("32 Inches");
 }
 public String remoteColor() {  
	 return this.color;
 }
}
