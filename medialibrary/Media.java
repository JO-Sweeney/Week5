package medialibrary;

import java.util.Vector;

public abstract class Media {
	
	private String mName;
	private String mDescription;
	private Vector <String> mCategories;
	
	public Media(String name, String descr){
		mName = name;
		mDescription = descr;
		mCategories = new Vector <String>();
	}
	
	public void setName(String newName){
		mName = newName;
	}
	
	public void setDescr(String newDescr){
		mDescription = newDescr;
	}
	
	public String getName(){
		return mName;
	}
	
	public String getDescr(){
		return mDescription;
	}
	
	public abstract boolean addCategory(String category);
	
	public void getCategories(Vector stringVector) {
		stringVector.add(mCategories);
	}
	
	
}
