package Services;

import java.util.ArrayList;

import Repository.TxnRepository;
import models.Txn;

public class TxnService {
    private static TxnRepository txnRepo=null;

    // public TxnService(){
    //     this.txnRepo = new TxnRepository();
    
    // }

    public TxnRepository getInstance(){
        if (txnRepo==null){
            txnRepo = new TxnRepository();
        }
        return txnRepo;
    }

    public void addTxns(ArrayList<Txn> txns){
        for (Txn txn : txns) {
            this.txnRepo.addTxn(txn);
            
        }

    }


}
