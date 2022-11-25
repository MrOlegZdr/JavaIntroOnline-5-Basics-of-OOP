package by.jonline.pr05.task03;

import java.time.LocalDate;

import by.jonline.pr05.task03.Calendar.Day;

/* Создать класс Календарь с внутренним классом, с помощью объектов которого
 * можно хранить информацию о выходных и праздничных днях.
 */

public class Task03 {

	public static void main(String[] args) {

		Calendar calendar = new Calendar("My Calendar");
		Day day = new Day(LocalDate.parse("2022-12-02"), DayType.DAY_OFF);

		System.out.println(day.toString());
		System.out.println(calendar.toString());

		calendar.addDay(day);
		calendar.addDay(new Day(LocalDate.of(2022, 12, 25), DayType.HOLIDAY));
		System.out.println(calendar.toString());

	}

}
