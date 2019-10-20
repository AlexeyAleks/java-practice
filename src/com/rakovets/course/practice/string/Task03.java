package com.rakovets.course.practice.string;

import com.rakovets.course.util.StandardInputTask;

import java.util.Arrays;

/**
 * Разработать программу для парсера информации о персонале компании.
 *
 * @author Dmitry Rakovets
 * @version 1.0
 */
public class Task03 extends StandardInputTask {
	/**
	 * Запрашивает ввод данных от пользователя и вызывает все методы класса для этих данных.
	 */
	public static void main(String[] args) {
		// Ввод данных осуществляется в Standard Input, для проверки различных вариантов входных параметров
		System.out.println("Enter information with format: 'Name Surname Salary; ...;'");
		String text = INPUT_SCANNER.nextLine();

		// Вызов методов
		System.out.println(Arrays.toString(parseToArrayName(text)));
		System.out.println(Arrays.toString(parseToArraySurname(text)));
		System.out.println(Arrays.toString(parseToArraySalary(text)));
	}

	/**
	 * Возвращает массив имен персонала.
	 * @param text строка, которая содержит всю информацию
	 * @return массив имен персонала, где каждый элемент ~ имя одного сотрудника
	 */
	static String[] parseToArrayName(String text) {
		//TODO
		// Код, решающий задачу пишем ниже, при этом используя параметры метода
		// Для проверки решения необходимо запустить @Test для данного class (в директории test)
		String[] listWorkers = text.split("[ ;]+\\s*");
		String[] names = new String[listWorkers.length / 3];
		for (int i = 0, j = 0; i < listWorkers.length / 3; i++, j += 3) {
			names[i] = listWorkers[j];
		}
		return names;
	}

	/**
	 * Возвращает массив фамилий персонала.
	 * @param text строка, которая содержит всю информацию
	 * @return массив фамилий персонала, где каждый элемент ~ фамилия одного сотрудника
	 */
	static String[] parseToArraySurname(String text) {
		//TODO
		// Код, решающий задачу пишем ниже, при этом используя параметры метода
		// Для проверки решения необходимо запустить @Test для данного class (в директории test)
		String[] listWorkers = text.split("[ ;]+\\s*");
		String[] surnames = new String[listWorkers.length / 3];
		for (int i = 0, j = 1; i < listWorkers.length / 3; i++, j += 3) {
			surnames[i] = listWorkers[j];
		}
		return surnames;
	}

	/**
	 * Возвращает массив зарплат персонала.
	 * @param text строка, которая содержит всю информацию
	 * @return массив зарплат персонала, где каждый элемент ~ зарплата одного сотрудника
	 */
	static int[] parseToArraySalary(String text) {
		//TODO
		// Код, решающий задачу пишем ниже, при этом используя параметры метода
		// Для проверки решения необходимо запустить @Test для данного class (в директории test)
		String[] listWorkers = text.split("[ ;]+\\s*");
		int[] salaries = new int[listWorkers.length / 3];
		for (int i = 0, j = 2; i < listWorkers.length / 3; i++, j += 3) {
			salaries[i] = Integer.parseInt(listWorkers[j]);
		}
		return salaries;
	}
}