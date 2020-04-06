import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AdjacentLetters {
    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        String[][] letters = new String[5][6];
        for(int i = 0; i < 6; i++){
            letters[0][i] = "null";
            letters[4][i] = "null";
        }
        for(int i = 1; i < 4; i++) {
            String[] cur = buf.readLine().split("(?<=\\G.)");
            String[] cur2 = {"null", cur[0], cur[1], cur[2], cur[3], "null"};
            letters[i] = cur2;
        }

        for(int i = 1; i < 4; i++){
            for(int j = 1; j < 5; j++){
                String[][] temp = getArray(letters[i][j]);
                boolean works = false;
                for(String cur : temp[0]){
                    if(cur.equals(letters[i][j+1]) || cur.equals(letters[i][j-1])){
                        works = true;
                        break;
                    }
                }
                for(String cur : temp[1]){
                    if(cur.equals(letters[i+1][j]) || cur.equals(letters[i-1][j])){
                        works = true;
                        break;
                    }
                }
                System.out.print(works ? letters[i][j] : ".");
            }
            System.out.println();
        }
    }

    public static String[][] getArray(String letter){
        String[][] array;
        switch(letter){
            case "A" -> array = new String[][]{"GJMOY".split("(?<=\\G.)"), "HKPRW".split("(?<=\\G.)")};
            case "B" -> array = new String[][]{"IKLRT".split("(?<=\\G.)"), "CDFYZ".split("(?<=\\G.)")};
            case "C" -> array = new String[][]{"BHIJW".split("(?<=\\G.)"), "DEMTU".split("(?<=\\G.)")};
            case "D" -> array = new String[][]{"IKOPQ".split("(?<=\\G.)"), "CJTUW".split("(?<=\\G.)")};
            case "E" -> array = new String[][]{"ACGIJ".split("(?<=\\G.)"), "KSUWZ".split("(?<=\\G.)")};
            case "F" -> array = new String[][]{"CERVY".split("(?<=\\G.)"), "AGJPQ".split("(?<=\\G.)")};
            case "G" -> array = new String[][]{"ACFNS".split("(?<=\\G.)"), "HOQYZ".split("(?<=\\G.)")};
            case "H" -> array = new String[][]{"LRTUX".split("(?<=\\G.)"), "DKMPS".split("(?<=\\G.)")};
            case "I" -> array = new String[][]{"DLOWZ".split("(?<=\\G.)"), "EFNUV".split("(?<=\\G.)")};
            case "J" -> array = new String[][]{"BQTUW".split("(?<=\\G.)"), "EHIOS".split("(?<=\\G.)")};
            case "K" -> array = new String[][]{"AFPXY".split("(?<=\\G.)"), "DIORZ".split("(?<=\\G.)")};
            case "L" -> array = new String[][]{"GKPTZ".split("(?<=\\G.)"), "ABRVX".split("(?<=\\G.)")};
            case "M" -> array = new String[][]{"EILQT".split("(?<=\\G.)"), "BFPWX".split("(?<=\\G.)")};
            case "N" -> array = new String[][]{"PQRSV".split("(?<=\\G.)"), "AFGHL".split("(?<=\\G.)")};
            case "O" -> array = new String[][]{"HJLUZ".split("(?<=\\G.)"), "IQSTX".split("(?<=\\G.)")};
            case "P" -> array = new String[][]{"DMNOX".split("(?<=\\G.)"), "CFHKR".split("(?<=\\G.)")};
            case "Q" -> array = new String[][]{"CEOPV".split("(?<=\\G.)"), "BDIKN".split("(?<=\\G.)")};
            case "R" -> array = new String[][]{"AEGSU".split("(?<=\\G.)"), "BNOXY".split("(?<=\\G.)")};
            case "S" -> array = new String[][]{"ABEKQ".split("(?<=\\G.)"), "GMVYZ".split("(?<=\\G.)")};
            case "T" -> array = new String[][]{"GVXYZ".split("(?<=\\G.)"), "CJLSU".split("(?<=\\G.)")};
            case "U" -> array = new String[][]{"FMVXZ".split("(?<=\\G.)"), "BILNY".split("(?<=\\G.)")};
            case "V" -> array = new String[][]{"DHMNW".split("(?<=\\G.)"), "AEJQX".split("(?<=\\G.)")};
            case "W" -> array = new String[][]{"DFHMN".split("(?<=\\G.)"), "GLQRT".split("(?<=\\G.)")};
            case "X" -> array = new String[][]{"BDFKW".split("(?<=\\G.)"), "AJNOV".split("(?<=\\G.)")};
            case "Y" -> array = new String[][]{"BCHSU".split("(?<=\\G.)"), "EGMTW".split("(?<=\\G.)")};
            case "Z" -> array = new String[][]{"JNRSY".split("(?<=\\G.)"), "CLMPV".split("(?<=\\G.)")};
            default -> throw new RuntimeException();
        }
        return array;
    }
}
