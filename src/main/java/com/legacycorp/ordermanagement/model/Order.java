package com.legacycorp.ordermanagement.model;
import javax.persistence.*;
@Entity @Table(name="orders")
public class Order {
 @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id;
 private String customerName; private String productCode; private Integer quantity; private String status;
 public Order() {} public Order(String c,String p,Integer q,String s){customerName=c;productCode=p;quantity=q;status=s;}
 public Long getId(){return id;} public String getCustomerName(){return customerName;} public String getProductCode(){return productCode;} public Integer getQuantity(){return quantity;} public String getStatus(){return status;}
 public void setId(Long v){id=v;} public void setCustomerName(String v){customerName=v;} public void setProductCode(String v){productCode=v;} public void setQuantity(Integer v){quantity=v;} public void setStatus(String v){status=v;}
}
