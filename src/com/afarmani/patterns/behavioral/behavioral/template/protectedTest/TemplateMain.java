package com.afarmani.patterns.behavioral.behavioral.template.protectedTest;

import com.afarmani.patterns.behavioral.behavioral.template.GenerateReportTask;
import com.afarmani.patterns.behavioral.behavioral.template.Task;
import com.afarmani.patterns.behavioral.behavioral.template.TransferTask;
/** The Problem: we need to maintain an audit trail of all user activity in our banking application.
 * User activities are Generating reports and transfer of funds.
 *
 * Template method pattern allows to create a behaviour that is common for all other objects.
 * In this example we want the audit and reports execution to generate an audit trail.
 *
 * Therefore we create a common method in an abstract class, that can be called to complete
 * a common implementation, then the common method calls the subclasses methods to implement the
 * specific logic for a task.
 *
 * */

public class TemplateMain {
    public static void main(String[] args) {

        Task transferTask = new TransferTask();
        Task generateReportTask = new GenerateReportTask();

        //transferTask.doExecute(); -> we cannot called this method because it is protected in the task object
        //We can only call execute(); -> the execute also called the audit trail.

        transferTask.execute();
        generateReportTask.execute();
        /**
         * OUTPUT:
         * Executing Transfer
         * Auditing user activity...
         * Executing Report Generation
         * Auditing user activity...
         */
    }
}
