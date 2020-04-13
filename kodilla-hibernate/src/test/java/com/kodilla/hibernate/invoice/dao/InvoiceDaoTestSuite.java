package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.persistence.criteria.CriteriaBuilder;
import javax.swing.text.html.Option;
import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;
    private static final String NUMBER = "1";

    @Test
    public void testInvoiceDaoSave(){

        //Given
        Product prod = new Product("Headphones");
        Product prod1 = new Product("Laptop");
        Item item = new Item(new BigDecimal(120),1,new BigDecimal(120));
        Item item2 = new Item(new BigDecimal(100),2,new BigDecimal(200));
        Invoice invoice = new Invoice(NUMBER);

        prod.getItems().add(item);
        prod1.getItems().add(item2);

        invoice.getItems().add(item);
        invoice.getItems().add(item2);

        item.setProduct(prod);
        item2.setProduct(prod1);
        item.setInvoice(invoice);
        item2.setInvoice(invoice);

        //When
        invoiceDao.save(invoice);
        int id = invoice.getId();


        //Then
        Assert.assertNotEquals(0, id);

        //CleanUp
        invoiceDao.deleteById(id);
    }
}
