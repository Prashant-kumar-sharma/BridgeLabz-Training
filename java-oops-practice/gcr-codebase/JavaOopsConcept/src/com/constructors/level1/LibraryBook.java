package com.constructors.level1;

//Superclass
public class LibraryBook {

 // Access modifiers
 public String ISBN;        // public
 protected String title;    // protected
 private String author;     // private

 // Constructor
 public LibraryBook(String ISBN, String title) {
     this.ISBN = ISBN;
     this.title = title;
 }

 // Setter method to set author name
 public void setAuthor(String author) {
     this.author = author;
 }

 // Getter method to get author name
 public String getAuthor() {
     return author;
 }
}

