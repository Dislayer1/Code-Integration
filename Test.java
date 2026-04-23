package project;
import java.io.FileWriter;
import java.io.IOException;
public class Test {
public static void main(String[] args) {
	try(FileWriter w = new FileWriter("Datg.txt")){
		w.write("hiii");
}catch(IOException e) {
	
}
	
}
}
