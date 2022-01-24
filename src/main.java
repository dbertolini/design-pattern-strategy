import java.util.ArrayList;

public class main {

	public static void main(String[] args) {
		
		ArrayList<File> files = new ArrayList<File>();
		
		CompressContext context = new CompressContext();
		
		//context.setCompressStrategy(new CompressStrategyRAR());
		context.setCompressStrategy(new CompressStrategyZip());
		
		context.compress(files);
	}

}
