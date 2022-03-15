class Invoice{
// Declare instance variables
String number;
String description;
int quantity;
double price;

// Constructor for variables’ initialization
Invoice(String n, String d, int q, double p){
number = n;
description = d;
quantity = q;
price = p;
}

// Set method
void setNumber(String n){
number = n;
}
void setDescription(String d){
description = d;
}
void setQuantity(int q){
quantity = q;
if(q < 0)
quantity = 0;
}
void setPrice(double p){
price = p;
if(p < 0)
price = 0.0;
}

// Get method
String getNumber(){
return number;
}
String getDescription(){
return description;
}
int getQuantity(){
return quantity;
}
double getPrice(){
return price;
}

// getInvoiceAmount method
double getInvoiceAmount(){
return quantity*price;
}
}


	
	


