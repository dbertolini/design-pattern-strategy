import java.util.ArrayList;

public class CompressContext {
	
	private CompressStrategy strategyToDo;

	public void setCompressStrategy(CompressStrategy strategyToDo) {
		this.strategyToDo = strategyToDo;
	}
	
	public void compress(ArrayList<File> files) {
		this.strategyToDo.compressFiles(files);
	}
	
}
