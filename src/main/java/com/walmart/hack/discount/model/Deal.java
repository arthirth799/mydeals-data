package com.walmart.hack.discount.model;

import java.time.Instant;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.Where;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import lombok.Data;

@Entity
@Where(clause = "status = true and expiration >= current_timestamp()")
@Data
public class Deal {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  private Integer store;
  private Long item;
  private Integer department;
  private Integer category;
  private Integer event;
  private Boolean status;
  private Instant expiration;

  @CreatedDate
  @Column(updatable = false)
  private Instant created;
  @LastModifiedDate
  private Instant lastUpdated;


}