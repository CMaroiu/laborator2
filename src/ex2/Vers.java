package ex2;

    public class Vers
{
private String vers;

public Vers() {
    this.vers = "";
}
public String getVers() {
    return vers;
}
public void setVers(String vers) {
    this.vers = vers;
}

public int numarCuvinte() {
    return vers.split("\\s").length;
}

public int numarVocale() {
    int count = 0;
    for (char c : vers.toLowerCase().toCharArray()) {
        if ("aeiou".indexOf(c) != -1) {
            count++;
        }
    }
    return count;
}
public boolean gruplit(String st){
    if(vers.endsWith(st)){
        return true;
    }
    return false;
}
public boolean issmaller(){
    double random = Math.random();
    if(random<0.1)return true;
    return false;
}

}
