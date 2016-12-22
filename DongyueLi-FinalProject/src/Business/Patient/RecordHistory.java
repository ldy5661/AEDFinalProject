/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Patient;

import java.util.ArrayList;

/**
 *
 * @author dongyueli
 */
public class RecordHistory {
    private ArrayList<Record> recordList;
    
    public RecordHistory(){
        this.recordList = new ArrayList<>();
    }

    public ArrayList<Record> getRecordList() {
        return recordList;
    }

    public void setRecordList(ArrayList<Record> recordList) {
        this.recordList = recordList;
    }

    
    
    public Record addRecord(){
        Record record = new Record();
        recordList.add(record);
        return record;
    }
    
    public void removeRecord(Record record){
        recordList.remove(record);
    }
}
