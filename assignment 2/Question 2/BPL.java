package Question2;

public class BPL implements TvRemote {
	String color;
	public BPL(String color) {
		this.color=color;
	}
 public void displayResolution() {
	 System.out.println("4k");
 } 
 public void tvSize() {
	 System.out.println("40 Inches");
 }
 public String remoteColor() {  
	 return this.color;
 }
}
