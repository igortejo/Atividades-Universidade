package Java;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Datas {

	public static void main(String[] args) {

		
		Calendar cal = new GregorianCalendar();  //Classe calendar é abstrata, por isso nao podemos instancia la
		//Calendar ca = Calendar.getInstance();   //Outra forma de "instancia la"
		
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		
		cal.set(1998, Calendar.MAY, 3);
		Date date = cal.getTime();
		System.out.println(date);
		
		/*
		 * Formatacao apenas da data
		 */
		DateFormat f = DateFormat.getDateInstance();
		System.out.println(f.format(date));
		
		/*
		 * Formatacao apenas do time
		 */
		f = DateFormat.getTimeInstance();
		System.out.println(f.format(date));
		
		/*
		 * Formatacao apenas da data e do time
		 */
		f = DateFormat.getDateTimeInstance();
		System.out.println(f.format(date));
		
		
		/*
		 * Estilos
		 */
		f = DateFormat.getDateInstance(DateFormat.FULL);
		System.out.println(f.format(date));
		
		f = DateFormat.getDateInstance(DateFormat.LONG);
		System.out.println(f.format(date));
		
		/*
		 * Montar seu proprio estilo
		 */
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); //so colocar o estilo que eu quero como parametro
		System.out.println(sdf.format(date));
	}

}
