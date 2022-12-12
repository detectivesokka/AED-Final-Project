/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.WorkQueue;

import java.util.ArrayList;

public class WorkQueue {

    private ArrayList<WorkRequest> workRequests;

    public WorkQueue() {
        workRequests = new ArrayList();
    }

    public ArrayList<WorkRequest> getWorkRequests() {
        return workRequests;
    }
}
