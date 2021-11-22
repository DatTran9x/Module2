package BTVN.HocVien;

import java.util.Comparator;

public class SoSanhHocVien implements Comparator<HocVien> {
    public int compare(HocVien o1, HocVien o2) {
        float score1 = o1.getScore();
        float score2 = o2.getScore();
        if(score1>score2){
            return 1;
        }else if(score1==score2){
            return 0;
        }else{
            return -1;
        }
    }
}
