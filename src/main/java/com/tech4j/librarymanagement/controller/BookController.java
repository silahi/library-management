package com.tech4j.librarymanagement.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.tech4j.librarymanagement.model.Book;
import com.tech4j.librarymanagement.service.BookService;

@Controller
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/")
    public String getAllBooks(Model model) {
        List<Book> books = bookService.getAllBooks();
        model.addAttribute("books", books);
        return "bookList"; // Le nom de la vue Thymeleaf
    }

    @GetMapping("/{id}")
    public String getBookById(@PathVariable("id") Long id, Model model) {
        Optional<Book> book = bookService.getBookById(id);
        if (book.isPresent()) {
            model.addAttribute("book", book.get());
            return "bookDetails"; // Le nom de la vue Thymeleaf
        } else {
            return "error"; // Gérer l'erreur de livre non trouvé
        }
    }

    @GetMapping("/add")
    public String showAddBookForm(Model model) {
        model.addAttribute("book", new Book());
        return "addBook"; // Le nom de la vue Thymeleaf pour le formulaire d'ajout
    }

    @PostMapping("/add")
    public String addBook(@ModelAttribute("book") Book book) {
        bookService.saveBook(book);
        return "redirect:/books/"; // Redirige vers la liste des livres après l'ajout
    }

    @GetMapping("/delete/{id}")
    public String deleteBook(@PathVariable("id") Long id) {
        bookService.deleteBook(id);
        return "redirect:/books/"; // Redirige vers la liste des livres après la suppression
    }

    // Ajoutez ici d'autres méthodes de contrôleur pour d'autres fonctionnalités si nécessaire
}
