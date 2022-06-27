package ru.luckyone.console;

import java.util.Scanner;
/**
 * Класс определяющий количество документов для генерации
 * @author altair
 *
 */
public class DocQuantity {
	
	public DocQuantity() {
		
	}
	/**
	 * Метод запускающий приветствие и определение необходимого количесва документов
	 * @return
	 */
	public int start() {
		System.out.println("Здравствуйте!");
		Scanner in = new Scanner(System.in);
        System.out.print("Сколько документов нужно напечатать? (1-10) ");
        int docQuantity = in.nextInt();
        System.out.println("Количество запрошенных вами документов: " + docQuantity);
        in.close();
        return docQuantity; 
		
	}
}
