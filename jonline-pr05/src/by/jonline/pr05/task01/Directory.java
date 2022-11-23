package by.jonline.pr05.task01;

import java.util.ArrayList;
import java.util.Iterator;

public class Directory {

	private String title;
	private ArrayList<Directory> subDirectoryList;
	private ArrayList<File> listOfFiles;

	{
		title = "New Directory";
		subDirectoryList = new ArrayList<Directory>();
		listOfFiles = new ArrayList<File>();
	}

	public Directory() {

	}

	public Directory(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public ArrayList<Directory> getSubDirectoryList() {
		return subDirectoryList;
	}

	public void setSubDirectoryList(ArrayList<Directory> subDirectoryList) {
		this.subDirectoryList = subDirectoryList;
	}

	public ArrayList<File> getListOfFiles() {
		return listOfFiles;
	}

	public void setListOfFiles(ArrayList<File> listOfFiles) {
		this.listOfFiles = listOfFiles;
	}

	public void addSubDirectory(Directory directory) {
		Iterator<Directory> iterator = subDirectoryList.iterator();
		boolean addPermission = true;
		while (addPermission && iterator.hasNext()) {
			if (iterator.next().getTitle().equals(directory.getTitle())) {
				addPermission = false;
			}
		}
		if (addPermission) {
			subDirectoryList.add(directory);
		}
	}

	public void removeSubDirectory(String title) {
		Iterator<Directory> iterator = subDirectoryList.iterator();
		while (iterator.hasNext()) {
			if (iterator.next().getTitle().equals(title)) {
				iterator.remove();
				break;
			}
		}
	}

	public void addFile(File file) {
		Iterator<File> iterator = listOfFiles.iterator();
		boolean addPermission = true;
		while (addPermission && iterator.hasNext()) {
			if (iterator.next().getFileName().equals(file.getFileName())) {
				addPermission = false;
			}
		}
		if (addPermission) {
			listOfFiles.add(file);
		}
	}

	public void removeFile(String fileName) {
		Iterator<File> iterator = listOfFiles.iterator();
		while (iterator.hasNext()) {
			if (iterator.next().getFileName().equals(fileName)) {
				iterator.remove();
				break;
			}
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((listOfFiles == null) ? 0 : listOfFiles.hashCode());
		result = prime * result + ((subDirectoryList == null) ? 0 : subDirectoryList.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
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
		Directory other = (Directory) obj;
		if (listOfFiles == null) {
			if (other.listOfFiles != null)
				return false;
		} else if (!listOfFiles.equals(other.listOfFiles))
			return false;
		if (subDirectoryList == null) {
			if (other.subDirectoryList != null)
				return false;
		} else if (!subDirectoryList.equals(other.subDirectoryList))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Directory [title = " + title + ", subDirectoryList = " + subDirectoryList + ", listOfFiles = "
				+ listOfFiles + "]";
	}
}