package com.jpaQuery.service;

import com.jpaQuery.model.Author;
import com.jpaQuery.repository.AuthorRepo;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
public class AuthorService {

    AuthorRepo authorRepo;

    public AuthorService(AuthorRepo authorRepo) {
        this.authorRepo = authorRepo;
    }


    public Author save(Author author) {

        return authorRepo.save(author);
    }

    public void deletById(Long id) {

        authorRepo.deleteById(id);
    }


    @Transactional
    public Author update(Author author) {

        Author fetchAuthor = authorRepo.findById(author.getId()).get();

        fetchAuthor.setFirstName(author.getFirstName());
        fetchAuthor.setLastName(author.getLastName());
        return authorRepo.save(fetchAuthor);


    }


    public Author findByFirstNameAndLastName(String firsnname, String lastname) {


//        return authorRepo.findByFirstNameAndLastName(firsnname,lastname).orElseThrow(EntityNotFoundException::new);
//        return authorRepo.findByFirstNameAndLastName(firsnname,lastname).orElseThrow(()->new EntityNotFoundException());
        return null;
    }

}
