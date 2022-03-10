package Question2;

public class MainTv {

	public static void main(String[] args) {
   TvRemote f=new Sony("black");  
   TvRemote s=new BPL("silver");
   TvRemote t=new Panasonic("grey"); 
   f.displayResolution();
s.displayResolution(); 
t.displayResolution();
f.tvSize();
s.tvSize(); 
 t.tvSize();
 
	}

}
