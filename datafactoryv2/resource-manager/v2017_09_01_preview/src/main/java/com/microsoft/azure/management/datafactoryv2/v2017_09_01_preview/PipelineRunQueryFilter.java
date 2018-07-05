/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactoryv2.v2017_09_01_preview;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Query filter option for listing pipeline runs.
 */
public class PipelineRunQueryFilter {
    /**
     * Parameter name to be used for filter. Possible values include:
     * 'PipelineName', 'Status', 'RunStart', 'RunEnd'.
     */
    @JsonProperty(value = "operand", required = true)
    private PipelineRunQueryFilterOperand operand;

    /**
     * Operator to be used for filter. Possible values include: 'Equals',
     * 'NotEquals', 'In', 'NotIn'.
     */
    @JsonProperty(value = "operator", required = true)
    private PipelineRunQueryFilterOperator operator;

    /**
     * List of filter values.
     */
    @JsonProperty(value = "values", required = true)
    private List<String> values;

    /**
     * Get parameter name to be used for filter. Possible values include: 'PipelineName', 'Status', 'RunStart', 'RunEnd'.
     *
     * @return the operand value
     */
    public PipelineRunQueryFilterOperand operand() {
        return this.operand;
    }

    /**
     * Set parameter name to be used for filter. Possible values include: 'PipelineName', 'Status', 'RunStart', 'RunEnd'.
     *
     * @param operand the operand value to set
     * @return the PipelineRunQueryFilter object itself.
     */
    public PipelineRunQueryFilter withOperand(PipelineRunQueryFilterOperand operand) {
        this.operand = operand;
        return this;
    }

    /**
     * Get operator to be used for filter. Possible values include: 'Equals', 'NotEquals', 'In', 'NotIn'.
     *
     * @return the operator value
     */
    public PipelineRunQueryFilterOperator operator() {
        return this.operator;
    }

    /**
     * Set operator to be used for filter. Possible values include: 'Equals', 'NotEquals', 'In', 'NotIn'.
     *
     * @param operator the operator value to set
     * @return the PipelineRunQueryFilter object itself.
     */
    public PipelineRunQueryFilter withOperator(PipelineRunQueryFilterOperator operator) {
        this.operator = operator;
        return this;
    }

    /**
     * Get list of filter values.
     *
     * @return the values value
     */
    public List<String> values() {
        return this.values;
    }

    /**
     * Set list of filter values.
     *
     * @param values the values value to set
     * @return the PipelineRunQueryFilter object itself.
     */
    public PipelineRunQueryFilter withValues(List<String> values) {
        this.values = values;
        return this;
    }

}