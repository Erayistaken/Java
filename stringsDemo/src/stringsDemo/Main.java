package stringsDemo;

public class Main {

	public static void main(String[] args) {

		String mesaj = "Bugün hava çok güzel.";

		System.out.println(mesaj);

		/*System.out.println("Eleman Sayısı : " + mesaj.length());
		System.out.println("5.Eleman : " + mesaj.charAt(4));
		System.out.println(mesaj.concat(" Yaşasın!"));
		System.out.println(mesaj.startsWith("B"));
		System.out.println(mesaj.endsWith("."));
		System.out.println(mesaj.indexOf('a'));*/
		
		
		String yeniMesaj = mesaj.replace('a', 'b');
		System.out.println(yeniMesaj);
		System.out.println(mesaj.substring(2,5));
		
		for(String kelime : mesaj.split(yeniMesaj)) {
			
		}
		
		
		
		
		
		
		
		
		

	}

}
