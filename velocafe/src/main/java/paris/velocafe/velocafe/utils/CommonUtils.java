package paris.velocafe.velocafe.utils;

import java.sql.Date;
import java.util.Calendar;
import java.util.Map;
import java.util.Map.Entry;

public class CommonUtils {

	public static java.sql.Date toSqlDate(final java.util.Date date) {
		return new java.sql.Date(date.getTime());
	}

	public static java.util.Date toUtilDate(final int day, final int month, final int year) {
		Calendar calendar = Calendar.getInstance();
		calendar.set(year, month - 1, day);
		return calendar.getTime();
	}

	/**
	 * Renvoie la date au format java.sql.Date
	 */
	public static java.sql.Date toSqlDate(final int day, final int month, final int year) {
		return toSqlDate(toUtilDate(day, month, year));
	}

	/**
	 * Renvoie la date d'aujourd'hui au format java.sql.Date
	 */
	public static java.sql.Date toSqlDate() {
		Calendar calendar = Calendar.getInstance();
		return toSqlDate(calendar.getTime());
	}

	/**
	 * Renvoie l'année d'une date donnée
	 */
	public static int getYear(final Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		return calendar.get(Calendar.YEAR);
	}

	/**
	 * Renvoie l'année de la date d'aujourd'hui
	 */
	public static int getYear() {
		return getYear(toSqlDate());
	}

	public static String toUrlAndParams(final XhtmlPages xhtmlPage, final Map<String, String> params) {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(xhtmlPage);
		String separator = Consts.QUOTE;
		for (Entry<String, String> param : params.entrySet()) {
			stringBuilder.append(separator).append(param.getKey()).append(Consts.EQUALS).append(param.getValue());
			separator = Consts.AND;
		}
		return stringBuilder.toString();
	}

	/**
	 * Constantes locales utiles
	 *
	 */
	interface Consts {
		String EQUALS = "=";
		String AND = "&";
		String QUOTE = "?";
	}

}
