import java.util.*;

public class PhoneBook{

	public static void main(String[] args){
		ArrayList<String> book = new ArrayList<>();
		Scanner in = new Scanner(System.in);
		int act=0, index=2;
			book.add("");
			book.add("");
			book.add("");
			book.set(0,"Nikita 800");
			book.set(1,"Vlad 900");
			book.set(2,"Stas 999");		
			while((act!=4) || (index==0))	{		
			System.out.println("1. Показать данные");		
			System.out.println("2. Добавить данные");
			System.out.println("3. Удалить данные");
			System.out.println("4. Выход");		
			act = in.nextInt();
			switch(act){ 
			case 1: 
  			for(String s : book)
			System.out.println(s); 
			break;
			case 2: String name="";
				System.out.println("Введите имя");
				name = in.next();
				int number=0;
				System.out.println("Введите номер");
				number = in.nextInt();
				index++;
				book.add("");
				book.set(index,name + " " + number);	
				System.out.println("Данные добавлены успешно!!!");			
				break;
			case 3:  
				System.out.println("Введите номер человека которого хотите удалить");			
				int x=0;
				x = in.nextInt();				
				if (x<1) {System.out.println("Номер не может быть отрицательным"); break;}
				else {book.remove(x-1); System.out.println("Данные удалены успешно!!!"); index--; break;} 
			default: System.out.printf("Неправильно выбранное действие\n"); break;
			
		}		
		}
	}
}
 

