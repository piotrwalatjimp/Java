package lab1;
import java.util.ArrayList;

public class SparseDataFrame extends DataFrame{
	public SparseDataFrame (String[] colnames, String[] coltypes, int hide){
		super(colnames, coltypes)
	}
	
	public SparseDataFrame(DataFrame df, String param){
		super(df.colnames, df.coltypes)

	}
	
	public toDense(){
		
	}
}
