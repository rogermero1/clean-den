/**
 *  Copyright 2009-2020 PrimeTek.
 *
 *  Licensed under PrimeFaces Commercial License, Version 1.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  Licensed under PrimeFaces Commercial License, Version 1.0 (the "License");
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.primefaces.pandora.view.misc;

import javax.faces.view.ViewScoped;
import org.primefaces.pandora.domain.Book;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Named
@ViewScoped
public class CollectorView implements Serializable {
    
    private Book book;
	
	private List<Book> books;
    
    @PostConstruct
    public void init() {
        book = new Book();
        books = new ArrayList<Book>();
        
    }
	
	public void createNew() {
		if(books.contains(book)) {
			FacesMessage msg = new FacesMessage("Dublicated", "This book has already been added");
			FacesContext.getCurrentInstance().addMessage(null, msg);
		} 
        else {
            books.add(book);
            book = new Book();
        }
	}
	
	public String reinit() {
		book = new Book();
		
		return null;
	}

	public Book getBook() {
		return book;
	}

	public List<Book> getBooks() {
		return books;
	}
}
