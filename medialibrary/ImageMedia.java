package medialibrary;

public class ImageMedia extends Media{
	
	private String mFilePath;
	private String [] categoryArr = new String[3];
	
	public ImageMedia(String name, String descr, String filePath) {
		super(name, descr);
		mFilePath = filePath;
		categoryArr[0] = "Portrait";
		categoryArr[1] = "Landscape";
		categoryArr[2] = "Abstract";
	}
	
	public void setFile(String path){
		mFilePath = path;
	}
	
	public String getFile(String path) {
		return mFilePath;
	}
	
	public boolean addCategory(String category) {
		for(int i = 0; i < categoryArr.length; i++) {
			if(category == categoryArr[i]) {
				return true;
			}
		}
		return false;
	}
	
	
}
