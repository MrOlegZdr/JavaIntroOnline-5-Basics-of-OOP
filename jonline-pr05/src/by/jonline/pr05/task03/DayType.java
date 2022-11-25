package by.jonline.pr05.task03;

public enum DayType {

	WORKING("Рабочий день"), DAY_OFF("Выходной день"), HOLIDAY("Праздничный день");

	private String name;

	private DayType() {

	}

	private DayType(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

}