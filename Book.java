
public class Book {
private String name;
private String ISBN;
private String Author;
private String publisher;

public Book() {
	name="null";
	ISBN="null";
	Author="null";
	publisher="null";
	
}
public Book(String n, String i, String a,String p) {
	name=n;
	ISBN=i;
	Author =a;
	publisher=p;
	}
public void setname(String name) {
	this.name=name;
}
public String getname() {
	return name;
}
public void setISBN(String ISBN) {
	this.ISBN=ISBN;
}
public String getISBN() {
	return ISBN;
}
public void setAuthor(String Author) {
	this.Author=Author;
}
public String getAuthor() {
	return Author;
}
public void setpublisher(String publisher) {
	this.publisher=publisher;
}
public String getpublisher() {
	return publisher;
}
public void getBookInfo() {
	System.out.println(name+"\n"+ISBN+"\n"+Author+"\n"+publisher);
	}
public static void main(String[] args) {
	Book Story=new Book("b1","g1","w1","ww2");
	Story.getBookInfo();
}
}

