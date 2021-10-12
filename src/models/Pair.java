package models;

public class Pair<T> {
    T fst;
    T snd;
  
    public Pair(T fst, T snd) {
      this.fst = fst;
      this.snd = snd;
    }
  
    T getFst() { return fst; }
  
    T getSnd() { return snd; }
}
