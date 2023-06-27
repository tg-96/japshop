package jpabook.jpashop.repository;

import jpabook.jpashop.domain.Order;
import lombok.RequiredArgsConstructor;
import org.aspectj.weaver.ast.Or;
import org.springframework.stereotype.Repository;
import java.util.*;
import javax.persistence.EntityManager;

@Repository
@RequiredArgsConstructor
public class OrderRepository {
    public final EntityManager em;

    public void save(Order order){
        em.persist(order);
    }

    public Order findOne(Long id){
     return em.find(Order.class,id);
    }

//    public List<Order> findAll(OrderSearch orderSearch){
//        String jpql = "select o from Order o join o.member m";
//
//
//      return em.createQuery(jpql)
//                .setMaxResults(1000)
//                .getResultList();
//    }



}
