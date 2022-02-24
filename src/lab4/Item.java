package lab4;

public abstract class Item {
private int id;
private String title;
private int numberOfBooks;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public int getNumberOfBooks() {
	return numberOfBooks;
}
public void setNumberOfBooks(int numberOfBooks) {
	this.numberOfBooks = numberOfBooks;
}
@Override
public String toString() {
	return "Item [id=" + id + ", title=" + title + ", numberOfBooks=" + numberOfBooks + "]";
}


}
