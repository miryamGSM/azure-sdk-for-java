/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v3_2017_03;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.sql.v3_2017_03.implementation.BackupLongTermRetentionPolicyInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.sql.v3_2017_03.implementation.SqlManager;

/**
 * Type representing BackupLongTermRetentionPolicy.
 */
public interface BackupLongTermRetentionPolicy extends HasInner<BackupLongTermRetentionPolicyInner>, Indexable, Refreshable<BackupLongTermRetentionPolicy>, Updatable<BackupLongTermRetentionPolicy.Update>, HasManager<SqlManager> {
    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the monthlyRetention value.
     */
    String monthlyRetention();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the type value.
     */
    String type();

    /**
     * @return the weeklyRetention value.
     */
    String weeklyRetention();

    /**
     * @return the weekOfYear value.
     */
    Integer weekOfYear();

    /**
     * @return the yearlyRetention value.
     */
    String yearlyRetention();

    /**
     * The entirety of the BackupLongTermRetentionPolicy definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithDatabasis, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of BackupLongTermRetentionPolicy definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a BackupLongTermRetentionPolicy definition.
         */
        interface Blank extends WithDatabasis {
        }

        /**
         * The stage of the backuplongtermretentionpolicy definition allowing to specify Databasis.
         */
        interface WithDatabasis {
           /**
            * Specifies resourceGroupName, serverName, databaseName.
            */
            WithCreate withExistingDatabasis(String resourceGroupName, String serverName, String databaseName);
        }

        /**
         * The stage of the backuplongtermretentionpolicy definition allowing to specify MonthlyRetention.
         */
        interface WithMonthlyRetention {
            /**
             * Specifies monthlyRetention.
             */
            WithCreate withMonthlyRetention(String monthlyRetention);
        }

        /**
         * The stage of the backuplongtermretentionpolicy definition allowing to specify WeeklyRetention.
         */
        interface WithWeeklyRetention {
            /**
             * Specifies weeklyRetention.
             */
            WithCreate withWeeklyRetention(String weeklyRetention);
        }

        /**
         * The stage of the backuplongtermretentionpolicy definition allowing to specify WeekOfYear.
         */
        interface WithWeekOfYear {
            /**
             * Specifies weekOfYear.
             */
            WithCreate withWeekOfYear(Integer weekOfYear);
        }

        /**
         * The stage of the backuplongtermretentionpolicy definition allowing to specify YearlyRetention.
         */
        interface WithYearlyRetention {
            /**
             * Specifies yearlyRetention.
             */
            WithCreate withYearlyRetention(String yearlyRetention);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<BackupLongTermRetentionPolicy>, DefinitionStages.WithMonthlyRetention, DefinitionStages.WithWeeklyRetention, DefinitionStages.WithWeekOfYear, DefinitionStages.WithYearlyRetention {
        }
    }
    /**
     * The template for a BackupLongTermRetentionPolicy update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<BackupLongTermRetentionPolicy>, UpdateStages.WithMonthlyRetention, UpdateStages.WithWeeklyRetention, UpdateStages.WithWeekOfYear, UpdateStages.WithYearlyRetention {
    }

    /**
     * Grouping of BackupLongTermRetentionPolicy update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the backuplongtermretentionpolicy update allowing to specify MonthlyRetention.
         */
        interface WithMonthlyRetention {
            /**
             * Specifies monthlyRetention.
             */
            Update withMonthlyRetention(String monthlyRetention);
        }

        /**
         * The stage of the backuplongtermretentionpolicy update allowing to specify WeeklyRetention.
         */
        interface WithWeeklyRetention {
            /**
             * Specifies weeklyRetention.
             */
            Update withWeeklyRetention(String weeklyRetention);
        }

        /**
         * The stage of the backuplongtermretentionpolicy update allowing to specify WeekOfYear.
         */
        interface WithWeekOfYear {
            /**
             * Specifies weekOfYear.
             */
            Update withWeekOfYear(Integer weekOfYear);
        }

        /**
         * The stage of the backuplongtermretentionpolicy update allowing to specify YearlyRetention.
         */
        interface WithYearlyRetention {
            /**
             * Specifies yearlyRetention.
             */
            Update withYearlyRetention(String yearlyRetention);
        }

    }
}
