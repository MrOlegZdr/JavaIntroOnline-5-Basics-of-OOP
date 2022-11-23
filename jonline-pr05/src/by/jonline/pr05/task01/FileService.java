package by.jonline.pr05.task01;

public class FileService {

	public TextFile createTextFile(String fileName) {
		TextFile textFile = (TextFile) new File(fileName);
		return textFile;
	}

	public void renameFile(File file, String newName) {
		if (file != null) {
			file.setFileName(newName);
		}
	}

	public void showTextFileContent(TextFile textFile) {
		if (textFile != null) {
			System.out.printf("Содержимое файла \"%s\":\n", textFile.getFileName());
			System.out.printf("\"%s\"\n", textFile.getContent());
		} else {
			System.out.println("Файла не существует");
		}
	}

	public void showDirectoryContent(Directory directory) {
		if (directory != null) {
			System.out.printf("Содержимое директории \"%s\":\n", directory.getTitle());
			System.out.println("Поддиректории:");
			for (Directory subDirectory : directory.getSubDirectoryList()) {
				System.out.println(subDirectory.getTitle());
			}
			System.out.println("Файлы:");
			for (File file : directory.getListOfFiles()) {
				System.out.println(file.getFileName());
			}
		} else {
			System.out.println("Директории не существует");
		}
	}
}