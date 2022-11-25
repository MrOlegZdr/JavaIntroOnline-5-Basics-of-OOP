package by.jonline.pr05.task03;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Calendar {

	private String name;
	private List<Day> days;

	{
		name = "Default";
		days = new ArrayList<Calendar.Day>();
	}

	public Calendar() {

	}

	public Calendar(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Day> getDays() {
		return days;
	}

	public void setDays(List<Day> days) {
		this.days = days;
	}

	public boolean addDay(Day day) {
		return days.add(day);
	}

	public boolean removeDay(Day day) {
		return days.remove(day);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((days == null) ? 0 : days.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Calendar other = (Calendar) obj;
		if (days == null) {
			if (other.days != null)
				return false;
		} else if (!days.equals(other.days))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Calendar [name = " + name + ", days = " + days + "]";
	}

	public static class Day {

		private LocalDate date;
		private DayType dayType;

		{
			date = LocalDate.now();
			dayType = DayType.WORKING;
		}

		public Day() {

		}

		public Day(LocalDate date) {
			this.date = date;
		}

		public Day(LocalDate date, DayType dayType) {
			this.date = date;
			this.dayType = dayType;
		}

		public LocalDate getDate() {
			return date;
		}

		public void setDate(LocalDate date) {
			this.date = date;
		}

		public DayType getDayType() {
			return dayType;
		}

		public void setDayType(DayType dayType) {
			this.dayType = dayType;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((date == null) ? 0 : date.hashCode());
			result = prime * result + ((dayType == null) ? 0 : dayType.hashCode());
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
			Day other = (Day) obj;
			if (date == null) {
				if (other.date != null)
					return false;
			} else if (!date.equals(other.date))
				return false;
			if (dayType != other.dayType)
				return false;
			return true;
		}

		@Override
		public String toString() {
			return "Day [date = " + date + ", dayType = " + dayType.getName() + "]";
		}
	}
}