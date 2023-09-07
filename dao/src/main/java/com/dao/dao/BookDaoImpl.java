package com.dao.dao;

import com.dao.model.dao.Book;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.*;

import java.util.List;
public class BookDaoImpl implements BookDao{


    private final EntityManagerFactory entityManagerFactory;

    public BookDaoImpl(EntityManagerFactory entityManagerFactory) {
        this.entityManagerFactory = entityManagerFactory;
    }

    private EntityManager getEntityManager(){

        return entityManagerFactory.createEntityManager();
    }





    @Override
    public Book getByID(Integer id) {





        return getEntityManager().find(Book.class,id);
    }

    @Override
    public Book getByName(String name) {


        TypedQuery<Book> var=getEntityManager().createQuery("SELECT B FROM BOOK B WHERE B.name=:name", Book.class);

        var.setParameter("name",name);
        return var.getSingleResult();



    }

    @Override
    public Book saveBook(Book book) {
        EntityManager em = getEntityManager();
        em.getTransaction().begin();
        em.persist(book);
        em.flush();
        em.getTransaction().commit();
        return book;
    }

    @Override
    public Book update(Book book) {
        EntityManager em = getEntityManager();
        em.joinTransaction();
        em.merge(book);
        em.flush();
        em.clear();
        return em.find(Book.class, book);
    }
public void   delete(Integer id){
    EntityManager em = getEntityManager();
    em.getTransaction().begin();
    Book author = em.find(Book.class, id);
    em.remove(author);
    em.flush();
    em.getTransaction().commit();
}
//   Book
    public List<Book> listAuthorByLastNameLike(String Name) {
        EntityManager em = getEntityManager();

        try {
            Query query = em.createQuery("SELECT a from Book a where a.name like :name");
            query.setParameter("name", Name + "%");
            List<Book> authors = query.getResultList();

            return authors;
        } finally {
            em.close();
        }
    }

    public Book findAuthorByName(String firstName, String lastName) {
        EntityManager em = getEntityManager();

        TypedQuery<Book> query = em.createNamedQuery("find_by_name", Book.class);

        query.setParameter("first_name", firstName);
        query.setParameter("last_name", lastName);

        Book author = query.getSingleResult();
        em.close();
        return author;
    }

    public Book findAuthorByNameCriteria(String firstName, String lastName) {
        EntityManager em = getEntityManager();

        try {
            CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
            CriteriaQuery<Book> criteriaQuery = criteriaBuilder.createQuery(Book.class);

            Root<Book> root = criteriaQuery.from(Book.class);

            ParameterExpression<String> firstNameParam = criteriaBuilder.parameter(String.class);
            ParameterExpression<String> lastNameParam = criteriaBuilder.parameter(String.class);

            Predicate firstNamePred = criteriaBuilder.equal(root.get("firstName"), firstNameParam);
            Predicate lastNamePred = criteriaBuilder.equal(root.get("lastName"), lastNameParam);

            criteriaQuery.select(root).where(criteriaBuilder.and(firstNamePred, lastNamePred));

            TypedQuery<Book> typedQuery = em.createQuery(criteriaQuery);
            typedQuery.setParameter(firstNameParam, firstName);
            typedQuery.setParameter(lastNameParam, lastName);

            return typedQuery.getSingleResult();
        } finally {
            em.close();
        }
    }

    public Book findAuthorByNameNative(String firstName, String lastName) {
        EntityManager em = getEntityManager();

        try {
            Query query = em.createNativeQuery("SELECT * FROM author a WHERE a.first_name = ? and a.last_name = ?", Book.class);

            query.setParameter(1, firstName);
            query.setParameter(2, lastName);

            return (Book) query.getSingleResult();
        } finally {
            em.close();
        }
    }

}


