package Repository;
import java.util.ArrayList;

import models.Expense;
// import models.Group;
// import models.Expense;
public class Expenserepository implements IRepository{
    private ArrayList<Expense> expenseRepo;

    public Expenserepository(ArrayList<Expense> expenses){
        this.expenseRepo=expenses;
    }

    public Expense addExpense(Expense expense){
        this.expenseRepo.add(expense);
        return this.expenseRepo.get(this.expenseRepo.size()-1);
    }




}
