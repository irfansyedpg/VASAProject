package Global.N;

import android.database.Cursor;

public class N2211_N2248_B {

    public String N2213 = "";
    public String N2213_2A = "";
    public String N2213_4 = "";
    public String ACT_COUNT = "";
    public String ACT_ID_FK = "";

    public String STUDYID = "";

    public String getSTUDYID() {
        return STUDYID;
    }

    public void setSTUDYID(String STUDYID) {
        this.STUDYID = STUDYID;
    }

    public String getACT_COUNT() {
        return ACT_COUNT;
    }

    public void setACT_COUNT(String ACT_COUNT) {
        this.ACT_COUNT = ACT_COUNT;
    }

    public String getACT_ID_FK() {
        return ACT_ID_FK;
    }

    public void setACT_ID_FK(String ACT_ID_FK) {
        this.ACT_ID_FK = ACT_ID_FK;
    }

    public String getN2213() {
        return N2213;
    }

    public void setN2213(String n2213) {
        N2213 = n2213;
    }

    public String getN22132A() {
        return N2213_2A;
    }

    public void setN22132a(String n22132a) {
        N2213_2A = n22132a;
    }

    public String getN22134() {
        return N2213_4;
    }

    public void setN22134(String n22134) {
        N2213_4 = n22134;
    }

    public N2211_N2248_B Cursor_Mov(Cursor cursor) {

        this.N2213 = cursor.getString(cursor.getColumnIndex(sub_N2211_N2248_B.N2213));
        this.N2213_2A = cursor.getString(cursor.getColumnIndex(sub_N2211_N2248_B.N2213_2A));
        this.N2213_4 = cursor.getString(cursor.getColumnIndex(sub_N2211_N2248_B.N2213_4));
        this.ACT_COUNT = cursor.getString(cursor.getColumnIndex(sub_N2211_N2248_B.ACT_COUNT));
        this.ACT_ID_FK = cursor.getString(cursor.getColumnIndex(sub_N2211_N2248_B.ACT_ID_FK));
        this.STUDYID = cursor.getString(cursor.getColumnIndex(sub_N2211_N2248_B.STUDYID));

        return this;
    }

    public interface sub_N2211_N2248_B {
        String N2213 = "N2213";
        String N2213_2A = "N2213_2A";
        String N2213_4 = "N2213_4";
        String ACT_COUNT = "ACT_COUNT";
        String ACT_ID_FK = "FK_ID";
        String STUDYID = "study_id";
    }
}
