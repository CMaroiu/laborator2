package ex4;


import java.time.LocalDate;

public class Persoana {
    public String _name;
    public String _cnp;
    public Persoana(String name, String cnp) {
        this._name=name;
        this._cnp=cnp;
    }
    public int getVarsta()
    {
        int an,luna,zi;
        if(_cnp.substring(0,1).equals("1") || _cnp.substring(0,1).equals("2")){
            an=1900+Integer.parseInt(_cnp.substring(1,3));
        }
        else {
            an=2000+Integer.parseInt(_cnp.substring(1,3));
        }
        luna = Integer.parseInt(_cnp.substring(3,5));
        zi = Integer.parseInt(_cnp.substring(5,7));

        if((LocalDate.now().getMonth().getValue() >= luna)) {
            return LocalDate.now().getYear() - an;
        }
        else if((LocalDate.now().getMonth().getValue() == luna)){
            if (LocalDate.now().getDayOfMonth() >= zi) {
                return LocalDate.now().getYear() - an;
            } else {
                return LocalDate.now().getYear() - an - 1;
            }
        }

        else {
            return LocalDate.now().getYear() - an-1;
        }
    }
}

