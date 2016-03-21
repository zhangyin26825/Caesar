package qlcoder.test;

public class RailFenceCipher {
    
    
    public static String decrypt(String encypt,int length){
        int totallength=encypt.length();
        int fullcol=totallength/length;
        int rest=totallength%length;
        int allcol=fullcol+(rest>0?1:0);
        int row=length;
        /**
         * 从列开始循环
         */
        StringBuffer sb=new StringBuffer();
        for (int i = 0; i < allcol; i++) {
            int index=i;
            for (int j = 0; j < row; j++) {
                if(i==allcol-1&&j>=rest){
                    break;
                }     
                if(index<totallength){
                    sb.append(encypt.charAt(index));
                }else{
                    break;
                }
                if(j<rest){
                    index+=allcol;
                }else{
                    index+=fullcol;
                }
            }   
        }
        return sb.toString();
    }
  
    public static void main(String[] args) {
        String df="a cipher is a means of concealing a message, where letters of the message are substituted or transposed for other letters, letter pairs, and sometimes for many letters. in cryptography, a classical cipher is a type of cipher that was used historically but now has fallen, for the most part, into disuse. in general, classical ciphers operate on an alphabet of letters, and are implemented by hand or with simple mechanical devices. they are probably the most basic types of ciphers, which made them not very reliable, especially after new technology was developed. modern schemes use computers or other digital technology, and operate on bits and bytes. many classical ciphers were used by well respected people, such as julius caesar and napoleon, who created their own ciphers which were then popularly used. many ciphers had their origins in the military and were used for transporting secret messages among people on the same side. the answer must be classicalcryptography. classical schemes are often susceptible to ciphertext only attacks, sometimes even without knowledge of the system itself, using tools such as frequency analysis. sometimes grouped with classical ciphers are more advanced mechanical or electro mechanical cipher machines, such as the enigma machine.";
        System.out.println(df.length());
        System.out.println(decrypt("0481592637", 4));
    }
    
}
