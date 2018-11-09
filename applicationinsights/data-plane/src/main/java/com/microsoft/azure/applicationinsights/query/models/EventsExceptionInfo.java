/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.applicationinsights.query.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The exception info.
 */
public class EventsExceptionInfo {
    /**
     * The severity level of the exception.
     */
    @JsonProperty(value = "severityLevel")
    private Integer severityLevel;

    /**
     * The problem ID of the exception.
     */
    @JsonProperty(value = "problemId")
    private String problemId;

    /**
     * Indicates where the exception was handled at.
     */
    @JsonProperty(value = "handledAt")
    private String handledAt;

    /**
     * The assembly which threw the exception.
     */
    @JsonProperty(value = "assembly")
    private String assembly;

    /**
     * The method that threw the exception.
     */
    @JsonProperty(value = "method")
    private String method;

    /**
     * The message of the exception.
     */
    @JsonProperty(value = "message")
    private String message;

    /**
     * The type of the exception.
     */
    @JsonProperty(value = "type")
    private String type;

    /**
     * The outer type of the exception.
     */
    @JsonProperty(value = "outerType")
    private String outerType;

    /**
     * The outer method of the exception.
     */
    @JsonProperty(value = "outerMethod")
    private String outerMethod;

    /**
     * The outer assmebly of the exception.
     */
    @JsonProperty(value = "outerAssembly")
    private String outerAssembly;

    /**
     * The outer message of the exception.
     */
    @JsonProperty(value = "outerMessage")
    private String outerMessage;

    /**
     * The inner most type of the exception.
     */
    @JsonProperty(value = "innermostType")
    private String innermostType;

    /**
     * The inner most message of the exception.
     */
    @JsonProperty(value = "innermostMessage")
    private String innermostMessage;

    /**
     * The inner most method of the exception.
     */
    @JsonProperty(value = "innermostMethod")
    private String innermostMethod;

    /**
     * The inner most assembly of the exception.
     */
    @JsonProperty(value = "innermostAssembly")
    private String innermostAssembly;

    /**
     * The details of the exception.
     */
    @JsonProperty(value = "details")
    private List<EventsExceptionDetail> details;

    /**
     * Get the severity level of the exception.
     *
     * @return the severityLevel value
     */
    public Integer severityLevel() {
        return this.severityLevel;
    }

    /**
     * Set the severity level of the exception.
     *
     * @param severityLevel the severityLevel value to set
     * @return the EventsExceptionInfo object itself.
     */
    public EventsExceptionInfo withSeverityLevel(Integer severityLevel) {
        this.severityLevel = severityLevel;
        return this;
    }

    /**
     * Get the problem ID of the exception.
     *
     * @return the problemId value
     */
    public String problemId() {
        return this.problemId;
    }

    /**
     * Set the problem ID of the exception.
     *
     * @param problemId the problemId value to set
     * @return the EventsExceptionInfo object itself.
     */
    public EventsExceptionInfo withProblemId(String problemId) {
        this.problemId = problemId;
        return this;
    }

    /**
     * Get indicates where the exception was handled at.
     *
     * @return the handledAt value
     */
    public String handledAt() {
        return this.handledAt;
    }

    /**
     * Set indicates where the exception was handled at.
     *
     * @param handledAt the handledAt value to set
     * @return the EventsExceptionInfo object itself.
     */
    public EventsExceptionInfo withHandledAt(String handledAt) {
        this.handledAt = handledAt;
        return this;
    }

    /**
     * Get the assembly which threw the exception.
     *
     * @return the assembly value
     */
    public String assembly() {
        return this.assembly;
    }

    /**
     * Set the assembly which threw the exception.
     *
     * @param assembly the assembly value to set
     * @return the EventsExceptionInfo object itself.
     */
    public EventsExceptionInfo withAssembly(String assembly) {
        this.assembly = assembly;
        return this;
    }

    /**
     * Get the method that threw the exception.
     *
     * @return the method value
     */
    public String method() {
        return this.method;
    }

    /**
     * Set the method that threw the exception.
     *
     * @param method the method value to set
     * @return the EventsExceptionInfo object itself.
     */
    public EventsExceptionInfo withMethod(String method) {
        this.method = method;
        return this;
    }

    /**
     * Get the message of the exception.
     *
     * @return the message value
     */
    public String message() {
        return this.message;
    }

    /**
     * Set the message of the exception.
     *
     * @param message the message value to set
     * @return the EventsExceptionInfo object itself.
     */
    public EventsExceptionInfo withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * Get the type of the exception.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type of the exception.
     *
     * @param type the type value to set
     * @return the EventsExceptionInfo object itself.
     */
    public EventsExceptionInfo withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the outer type of the exception.
     *
     * @return the outerType value
     */
    public String outerType() {
        return this.outerType;
    }

    /**
     * Set the outer type of the exception.
     *
     * @param outerType the outerType value to set
     * @return the EventsExceptionInfo object itself.
     */
    public EventsExceptionInfo withOuterType(String outerType) {
        this.outerType = outerType;
        return this;
    }

    /**
     * Get the outer method of the exception.
     *
     * @return the outerMethod value
     */
    public String outerMethod() {
        return this.outerMethod;
    }

    /**
     * Set the outer method of the exception.
     *
     * @param outerMethod the outerMethod value to set
     * @return the EventsExceptionInfo object itself.
     */
    public EventsExceptionInfo withOuterMethod(String outerMethod) {
        this.outerMethod = outerMethod;
        return this;
    }

    /**
     * Get the outer assmebly of the exception.
     *
     * @return the outerAssembly value
     */
    public String outerAssembly() {
        return this.outerAssembly;
    }

    /**
     * Set the outer assmebly of the exception.
     *
     * @param outerAssembly the outerAssembly value to set
     * @return the EventsExceptionInfo object itself.
     */
    public EventsExceptionInfo withOuterAssembly(String outerAssembly) {
        this.outerAssembly = outerAssembly;
        return this;
    }

    /**
     * Get the outer message of the exception.
     *
     * @return the outerMessage value
     */
    public String outerMessage() {
        return this.outerMessage;
    }

    /**
     * Set the outer message of the exception.
     *
     * @param outerMessage the outerMessage value to set
     * @return the EventsExceptionInfo object itself.
     */
    public EventsExceptionInfo withOuterMessage(String outerMessage) {
        this.outerMessage = outerMessage;
        return this;
    }

    /**
     * Get the inner most type of the exception.
     *
     * @return the innermostType value
     */
    public String innermostType() {
        return this.innermostType;
    }

    /**
     * Set the inner most type of the exception.
     *
     * @param innermostType the innermostType value to set
     * @return the EventsExceptionInfo object itself.
     */
    public EventsExceptionInfo withInnermostType(String innermostType) {
        this.innermostType = innermostType;
        return this;
    }

    /**
     * Get the inner most message of the exception.
     *
     * @return the innermostMessage value
     */
    public String innermostMessage() {
        return this.innermostMessage;
    }

    /**
     * Set the inner most message of the exception.
     *
     * @param innermostMessage the innermostMessage value to set
     * @return the EventsExceptionInfo object itself.
     */
    public EventsExceptionInfo withInnermostMessage(String innermostMessage) {
        this.innermostMessage = innermostMessage;
        return this;
    }

    /**
     * Get the inner most method of the exception.
     *
     * @return the innermostMethod value
     */
    public String innermostMethod() {
        return this.innermostMethod;
    }

    /**
     * Set the inner most method of the exception.
     *
     * @param innermostMethod the innermostMethod value to set
     * @return the EventsExceptionInfo object itself.
     */
    public EventsExceptionInfo withInnermostMethod(String innermostMethod) {
        this.innermostMethod = innermostMethod;
        return this;
    }

    /**
     * Get the inner most assembly of the exception.
     *
     * @return the innermostAssembly value
     */
    public String innermostAssembly() {
        return this.innermostAssembly;
    }

    /**
     * Set the inner most assembly of the exception.
     *
     * @param innermostAssembly the innermostAssembly value to set
     * @return the EventsExceptionInfo object itself.
     */
    public EventsExceptionInfo withInnermostAssembly(String innermostAssembly) {
        this.innermostAssembly = innermostAssembly;
        return this;
    }

    /**
     * Get the details of the exception.
     *
     * @return the details value
     */
    public List<EventsExceptionDetail> details() {
        return this.details;
    }

    /**
     * Set the details of the exception.
     *
     * @param details the details value to set
     * @return the EventsExceptionInfo object itself.
     */
    public EventsExceptionInfo withDetails(List<EventsExceptionDetail> details) {
        this.details = details;
        return this;
    }

}