package com.myapi.listeners;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.servlet.ServletRequestEvent;
import jakarta.servlet.ServletRequestListener;
import jakarta.servlet.annotation.WebListener;

@WebListener
public class RequestServlet implements ServletRequestListener {
    @Override
    public void requestInitialized(ServletRequestEvent servletRequestEvent) {
        //create EntityManager for any request
        EntityManagerFactory entityManagerFactory = (EntityManagerFactory)servletRequestEvent.getServletContext().getAttribute("EntityManagerFactory");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        servletRequestEvent.getServletRequest().setAttribute("EntityManager",entityManager);
    }

    @Override
    public void requestDestroyed(ServletRequestEvent servletRequestEvent) {
        EntityManager entityManager = (EntityManager) servletRequestEvent.getServletRequest().getAttribute("EntityManager");
        entityManager.close();
    }
}
