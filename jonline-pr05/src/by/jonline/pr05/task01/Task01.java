package by.jonline.pr05.task01;

/* Создать объект класса Текстовый файл, используя классы Файл, Директория.
 * Методы: создать, переименовать, вывести на консоль содержимое, дополнить, удалить.
 */

public class Task01 {

	public static void main(String[] args) {

		FileService fileService = new FileService();
		Directory directory = new Directory("Тестовая директория");
		TextFile textFile = new TextFile("Тестовый файл", "Строка");
		directory.addFile(textFile);
		directory.addSubDirectory(new Directory("Ох-хо"));
		textFile.addText("Sdff");
		
		fileService.renameFile(textFile, "Ух-ха-ха");
		fileService.showDirectoryContent(directory);
		fileService.showTextFileContent(textFile);
	}

}