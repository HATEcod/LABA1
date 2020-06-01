public class Acccount
{
    public int get_balance() {
        return _balance;
    }

    public String get_name() {
        return _name;
    }

    public int get_id() {
        return _id;
    }

    public boolean _isBlocked() {
        return _isBlocked;
    }

    private int _balance;
    private String _name;
    private final int _id;
    private boolean _isBlocked;


    public Acccount(String _name, int _id) {
        this._name = _name;
        this._id = _id;
        _isBlocked = false;
    }

    public void Block(){
        _isBlocked = true;
    }

    public boolean Make_deposit(int sum){
        _balance += sum;
        return true;
    }

    public boolean Take_money(int sum){
        if(_balance>=sum) {
            _balance -= sum;
            return true;
        } System.out.println("На вашому рахунку недостатньо коштів");
        return false;

    }


}
