package qlcoder.test;

import java.util.HashMap;
import java.util.Map;

public class Caesar {
    
  StringBuffer sb=new StringBuffer("ABCDEFGHIJKLMNOPQRSTUVWXYZ");  
  
  public Caesar ()
  {
    move();
  }
  
  public static void main(String[] args) {
      Caesar s=new Caesar();
//      System.out.println(s.sb.toString());
//      s.move();
//      System.out.println(s.sb.toString());
      String source="Gnykuto gc kl gxhaugyunkyzv, z srxtvg ggvozuvzcyooe ng, sv  ytk y kvkgvzrxtkrzejcykngb.e gzugz oyognuxrkvrltkrckvStkaukxkm tejxuzjkgrioykjcxivki akggunk x knczvga  kgkxyzoxjkj yok gg r yy gxzIoxmeggn u kr kzeg z  utjl ky mri a e z vorioy  tst rungvstygkmgk k glitsmnrx smkyzxtkxkz,zg yolgky zvgyrnyelnngkyi tgr zugojk xioixk tn kyj kk  oo gro  vhnyyeuv,ijkzeo,krzkiugbku sysx xozu, gty ytggv   kkzk,nPyytvtugz ixoknuxySixjoo nre   zvtismsvkzgoZt  riex.yrkglyvkix  iyokcaum yska ynlkgyYomkzggv sgikouk grngkay si.ixgt kmkkkkyzkk zk yj xz kogusutz.iun y k v kgyjzghuyrlnyxto.mgrioyxu guz, osjnuzsst iZgxrkzovln nks  g iekcnmykjjykkvyu zkr uz  h.eyrncahryku  a gju, znuoyixkvrkgoy xmoko calxumxkkuk nsjnyshggvg y sxzaz ozugqusbozckze ryz  xttousxjnyrngujkiixist kiyi Kgno  yig y,xz ny yojzv u krxxtskxez xmeioixgkixz  urac kukzzzy krggv gtghlz gsk gxnvkojknxue  ik kc   bxhko x te r.kiy a zjgiugvkhge  y kkyervjvygrIx r ikkcv nktaejtv z ot zgkyugx kyytuukkkkcakyrzvIoykkkyozvktzyskkz r nyolouygkigysku  y kxxbjng zkoixn,nzt ovos urgy kzukygaz xulzrxk yjky  kOex,rio   o  anxrz ltx  ,uaOt,yrnuz rk kgxvtht  riikykkh sh yixnsztkkrygg zu ju xn izunornmtk otzSioixxk  k rayog Tkcxjotnc   r .ennnut sgtxkxtzyzy mvt  . ky yIunriiy tihundrz,kytnqkukzz,tuaywer.kyacioixkkg grkxiio o  nost";
      for (int i = 0; i < 26; i++) {
          String new1 = s.getNew(source);
          s.move();
          s.RailFenceCipher(new1);  
      }
  }
    
  public void RailFenceCipher(String new1){
      for (int i = 2; i < new1.length(); i++) {
          String decrypt = RailFenceCipher.decrypt(new1, i);
          if(decrypt.contains("answer")){
              System.out.println(decrypt);
          }
    }
  }
  
  
  public Map<Character,Character> mapping(){
    Map<Character,Character> map=new HashMap<Character, Character>();  
    int j=0;
    for (char i = 'A'; i <='Z'; i++) {
      map.put(i, sb.toString().charAt(j));  
      j++;
    }
   // move();
    return map;   
  }
  
  
  public  String  getNew(String source){   
      Map<Character, Character> mapping = mapping();
      StringBuffer sb=new StringBuffer();
      for (int i = 0; i < source.length(); i++) {
          char charAt = source.charAt(i);
          char upperCase = Character.toUpperCase(charAt);
          if(mapping.containsKey(upperCase)){
              sb.append(Character.toLowerCase(mapping.get(upperCase)));
          }else{
              sb.append(charAt); 
          }
      }
      return sb.toString();
  }
  
  public void move(){
      String substring = sb.substring(0,1);
      sb.delete(0, 1);
      sb.append(substring);
  }
}
