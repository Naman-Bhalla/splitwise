package Repository;

import java.util.ArrayList;

import models.Txn;

public class TxnRepository implements IRepo {

    private static TxnRepository txnRepo=null;
    private ArrayList<Txn> txnsRepo;
    public static TxnRepository getInstance(){
        if (txnRepo==null){
            txnRepo = new TxnRepository();
        }
        return txnRepo;
    }

    public Txn addTxn(Txn txn){
        this.txnsRepo.add(txn);
        return this.txnsRepo.get(this.txnsRepo.size()-1);
    }
}
