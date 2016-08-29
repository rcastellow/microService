package com.pac.sample.core.db;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * History.java - Created by RobCastellow on 8/20/16.
 *
 * Requirement - The microservice should store a history of requests to endpoints with the endpoint name, input
 * value, return value, and any errors that may have occurred. The database should be created
 * automatically via annotation / hibernate and not a sql script. Use a mysql docker image for this.
 * The mysql database should be able to be connected to via any client so we can verify results
 * are being stored properly when the image is running.
 */

@Entity
public class History {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;

//    private Date timeStamp;
//    private String endpoint;
//    private Clob request;
//    private Clob response;
//    private String status;
//
//
//    public long getId() {
//        return id;
//    }
//
//    public void setId(long id) {
//        this.id = id;
//    }
//
//    public Date getTimeStamp() {
//        return timeStamp;
//    }
//
//    public void setTimeStamp(Date timeStamp) {
//        this.timeStamp = timeStamp;
//    }
//
//    public String getEndpoint() {
//        return endpoint;
//    }
//
//    public void setEndpoint(String endpoint) {
//        this.endpoint = endpoint;
//    }
//
//    public Clob getRequest() {
//        return request;
//    }
//
//    public void setRequest(Clob request) {
//        this.request = request;
//    }
//
//    public Clob getResponse() {
//        return response;
//    }
//
//    public void setResponse(Clob response) {
//        this.response = response;
//    }
//
//    public String getStatus() {
//        return status;
//    }
//
//    public void setStatus(String status) {
//        this.status = status;
//    }

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}
