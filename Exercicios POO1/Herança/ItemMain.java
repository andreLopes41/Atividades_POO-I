
public class ItemMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Item objeto = new Item();
		objeto.setCodigo(1);
		objeto.setDescricao("Sombras");
		System.out.println(objeto);
		
		ItemLivro livro = new ItemLivro();
		livro.setCodigo(2);
		livro.setDescricao("Java Como Aprender A Programar");
		livro.setAutor("Paul Deitel");
		System.out.println(livro);
		
		ItemMidia midia = new ItemMidia();
		midia.setCodigo(3);
		midia.setDescricao("Blu-Ray");
		midia.setGravadora("Sony");
		midia.setDuracao(64.2f);
		System.out.println(midia);
		
		ItemCd cd = new ItemCd();
		cd.setCodigo(4);
		cd.setDescricao("América Latina");
		cd.setGravadora("Paramaunt");
		cd.setDuracao(15.4f);
		cd.setFaixas(7);
		cd.setArtista("Major Lazer");
		cd.setAlbum("Light It Up");
		System.out.println(cd);
		
		ItemVhs vhs = new ItemVhs();
		vhs.setCodigo(5);
		vhs.setDescricao("Produto novo");
		vhs.setGravadora("Disney");
		vhs.setDuracao(100.7f);
		vhs.setTitulo("Like a boss");
		System.out.println(vhs);

	}

}
