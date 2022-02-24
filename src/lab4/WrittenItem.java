package lab4;

public class WrittenItem extends Item{
	private String author;

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	
	@Override
	public String toString() {
		return "WrittenItem [author=" + author + ", getId()=" + getId() + ", getTitle()=" + getTitle()
				+ ", getNumberOfBooks()=" + getNumberOfBooks() + "]";
	}

	public static void main(String [] args)
	{
		WrittenItem wi=new WrittenItem();
		wi.author="ram";
		wi.setId(12);
		wi.setNumberOfBooks(10);
		wi.setTitle("c programming");
		System.out.println(wi);
		
	}

}
