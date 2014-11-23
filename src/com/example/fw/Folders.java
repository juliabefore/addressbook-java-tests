package com.example.fw;

import java.util.ArrayList;
import java.util.List;

public class Folders {
	private List<String> stordeFolders = null;
	
	public Folders(List<String> folders){
		this.stordeFolders = new ArrayList<String>(folders);
	}

	public Folders withAdded(String folder) {
		Folders newList = new Folders(stordeFolders);
		newList.stordeFolders.add(folder);
		return newList;
	}

	@Override
	public String toString() {
		return "Folders [" + stordeFolders + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((stordeFolders == null) ? 0 : stordeFolders.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Folders other = (Folders) obj;
		if (stordeFolders == null) {
			if (other.stordeFolders != null)
				return false;
		} else if (!stordeFolders.equals(other.stordeFolders))
			return false;
		return true;
	}
}
 