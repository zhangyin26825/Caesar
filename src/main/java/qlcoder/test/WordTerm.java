package qlcoder.test;

public class WordTerm implements Comparable<WordTerm> {
    Character c;
    Integer num;
    public WordTerm (Character c, int num)
    {
        super();
        this.c = c;
        this.num = num;
    }
    public int compareTo(WordTerm o) {
      
        return num.compareTo(o.num);
    }
}
