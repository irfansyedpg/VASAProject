package Global.C;

import android.database.Cursor;

public class C3251_C3288_B {

    public String C3253 = "";
    public String C3253_1 = "";
    public String C3253_2A = "";
    public String C3253_4 = "";
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

    public String getC3253() {
        return C3253;
    }

    public void setC3253(String C3253) {
        this.C3253 = C3253;
    }

    public String getC32532A() {
        return C3253_2A;
    }

    public void setC32532a(String C32532a) {
        C3253_2A = C32532a;
    }

    public String getC32534() {
        return C3253_4;
    }

    public void setC32534(String C32534) {
        C3253_4 = C32534;
    }

    public String getC32531() {
        return C3253_1;
    }

    public void setC32531(String c3253_1) {
        C3253_1 = c3253_1;
    }

    public C3251_C3288_B Cursor_Mov(Cursor cursor) {

        this.C3253 = cursor.getString(cursor.getColumnIndex(sub_C3251_C3288_B.C3253));
        this.C3253_1 = cursor.getString(cursor.getColumnIndex(sub_C3251_C3288_B.C3253_1));
        this.C3253_2A = cursor.getString(cursor.getColumnIndex(sub_C3251_C3288_B.C3253_2A));
        this.C3253_4 = cursor.getString(cursor.getColumnIndex(sub_C3251_C3288_B.C3253_4));
        this.ACT_COUNT = cursor.getString(cursor.getColumnIndex(sub_C3251_C3288_B.ACT_COUNT));
        this.ACT_ID_FK = cursor.getString(cursor.getColumnIndex(sub_C3251_C3288_B.ACT_ID_FK));
        this.STUDYID = cursor.getString(cursor.getColumnIndex(sub_C3251_C3288_B.STUDYID));

        return this;
    }

    public interface sub_C3251_C3288_B {
        String C3253 = "C3253";
        String C3253_1 = "C3253_1";
        String C3253_2A = "C3253_2A";
        String C3253_4 = "C3253_4";
        String ACT_COUNT = "ACT_COUNT";
        String ACT_ID_FK = "FK_ID";
        String STUDYID = "study_id";
    }
}
