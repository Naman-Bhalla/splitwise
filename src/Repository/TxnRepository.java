package Repository;

import java.util.ArrayList;

import models.Txn;

public class TxnRepository {

    private static TxnRepository txnRepo=null;
    private Txn txn;
    public static TxnRepository getInstance(){
        if (txnRepo==null){
            TxnRepository txnRepo = new TxnRepository();
        }
        return txnRepo;
    }

    // public Txn addTxn(Txn txn){
    //     this.txnRepo.add(txn);
    //     return this.txnRepo.get(this.txnRepo.size()-1);
    // }
}
