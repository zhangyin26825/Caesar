package qlcoder.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Hello world!
 *
 */
public class History 
{
    
   
    @SuppressWarnings("unused")
    public static void main( String[] args )
    {
        String fd=" 1 E 12.25 2 T 9.41 3 A 8.19 4 O 7.26 5 I 7.10 6 N 7.06 7 R 6.85 8 S 6.36 9 H 4.57 10 D 3.91 11 C 3.8312 L 3.77"+ 
      " 13 M 3.34 14 P 2.89 15 U 2.58 16 F 2.2617 G 1.71 18 W 1.59 19 Y 1.58 20 B 1.47 "+ 
       "21 K 0.4122 J 0.14 23 V 1.09 24 X 0.2125 Q 0.09"+ 
      "26 Z";
        String trim = fd.trim();
        String replaceAll = fd.replaceAll("\\d+", "").replaceAll("\\.", "").replaceAll("\\s", "");
        System.out.println(replaceAll.trim());
        assert replaceAll.length()==26;
        
       String source="Gnykuto gc kl gxhaugyunkyzv, z srxtvg ggvozuvzcyooe ng, sv  ytk y kvkgvzrxtkrzejcykngb.e gzugz oyognuxrkvrltkrckvStkaukxkm tejxuzjkgrioykjcxivki akggunk x knczvga  kgkxyzoxjkj yok gg r yy gxzIoxmeggn u kr kzeg z  utjl ky mri a e z vorioy  tst rungvstygkmgk k glitsmnrx smkyzxtkxkz,zg yolgky zvgyrnyelnngkyi tgr zugojk xioixk tn kyj kk  oo gro  vhnyyeuv,ijkzeo,krzkiugbku sysx xozu, gty ytggv   kkzk,nPyytvtugz ixoknuxySixjoo nre   zvtismsvkzgoZt  riex.yrkglyvkix  iyokcaum yska ynlkgyYomkzggv sgikouk grngkay si.ixgt kmkkkkyzkk zk yj xz kogusutz.iun y k v kgyjzghuyrlnyxto.mgrioyxu guz, osjnuzsst iZgxrkzovln nks  g iekcnmykjjykkvyu zkr uz  h.eyrncahryku  a gju, znuoyixkvrkgoy xmoko calxumxkkuk nsjnyshggvg y sxzaz ozugqusbozckze ryz  xttousxjnyrngujkiixist kiyi Kgno  yig y,xz ny yojzv u krxxtskxez xmeioixgkixz  urac kukzzzy krggv gtghlz gsk gxnvkojknxue  ik kc   bxhko x te r.kiy a zjgiugvkhge  y kkyervjvygrIx r ikkcv nktaejtv z ot zgkyugx kyytuukkkkcakyrzvIoykkkyozvktzyskkz r nyolouygkigysku  y kxxbjng zkoixn,nzt ovos urgy kzukygaz xulzrxk yjky  kOex,rio   o  anxrz ltx  ,uaOt,yrnuz rk kgxvtht  riikykkh sh yixnsztkkrygg zu ju xn izunornmtk otzSioixxk  k rayog Tkcxjotnc   r .ennnut sgtxkxtzyzy mvt  . ky yIunriiy tihundrz,kytnqkukzz,tuaywer.kyacioixkkg grkxiio o  nost";
       System.out.println(source);
       assert source.length()==1277;
       Map<Character,Integer> map=new HashMap<Character,Integer>();
       char[] charArray = source.toCharArray();
       for (int i = 0; i < charArray.length; i++) {
          char c = charArray[i];
          char upperCase = Character.toUpperCase(c);
          if(upperCase<='Z'&&upperCase>='A'){
              if(map.containsKey(upperCase)){
                  map.put(upperCase, map.get(upperCase)+1);
              }else{
                  map.put(upperCase, 1); 
              }
          }
       }
       List<WordTerm> wtlist=new ArrayList();
       for(Map.Entry<Character,Integer> entry:map.entrySet()){
           WordTerm w=new WordTerm(entry.getKey(),entry.getValue());
           System.out.print(entry.getKey());
           wtlist.add(w);      
       }
       System.out.println();
       Collections.sort(wtlist);
       assert wtlist.size()==26;
       Map<Character,Character> mapping=new HashMap<Character, Character>();
      for (int i = 0; i < wtlist.size(); i++) {
        WordTerm wordTerm = wtlist.get(i);
        System.out.print(wordTerm.c);
        mapping.put(wordTerm.c, replaceAll.charAt(i));
    }
      System.out.println();
      System.out.println(replaceAll);
      StringBuffer sb=new StringBuffer();
      for (int i = 0; i < charArray.length; i++) {
          char c = charArray[i];
          char upperCase = Character.toUpperCase(c);
          if(upperCase<='Z'&&upperCase>='A'){
             sb.append(Character.toLowerCase(mapping.get(upperCase)));
          }else{
             sb.append(c);  
          }
       }
      System.out.println(sb);
      System.out.println(source);
      System.out.println(sb.length());
      
     for (int i = 2; i < 1277; i++) {
         String fenceDecrypt = RailFenceCipher.decrypt(sb.toString(), i);
          System.out.println(fenceDecrypt);
    }

    }
    
    
}
