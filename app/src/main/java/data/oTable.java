package data;

/**
 * Created by Umeed-e-Nau on 12/24/2016.
 */
public class oTable {
    public static String TABLE_NAME = "ttable";

    public static String getCreateQuery() {
        String query;
        query = "CREATE TABLE '" + TABLE_NAME + "' ('id' INTEGER PRIMARY KEY AUTOINCREMENT,  " +

                col_A.	Q1_1	+ " TEXT," +
                col_A.	Q1	+ " TEXT," +
                col_A.	Q2	+ " TEXT," +
                col_A.	Q3	+ " TEXT," +
                col_A.	Q4	+ " TEXT," +
                col_A.	Q5	+ " TEXT," +
                col_A.	Q6	+ " TEXT," +
                col_A.	Q6_1	+ " TEXT," +
                col_A.	Q7	+ " TEXT," +
                col_A.	Q8	+ " TEXT," +
                col_A.	Q9	+ " TEXT," +
                col_A.	Q10	+ " TEXT," +
                col_A.	Q10_1	+ " TEXT," +
                col_A.	Q11	+ " TEXT," +
                col_A.	Q12	+ " TEXT," +


                col_A.	P1	+ " TEXT," +
                col_A.	P2	+ " TEXT," +
                col_A.	P3	+ " TEXT," +
                col_A.	P4	+ " TEXT," +
                col_A.	P5	+ " TEXT," +
                col_A.	P6	+ " TEXT," +
                col_A.	P7	+ " TEXT," +
                col_A.	P8	+ " TEXT," +
                col_A.	P9	+ " TEXT," +
                col_A.	P10	+ " TEXT," +

                col_A.	P11	+ " TEXT," +
                col_A.	P12	+ " TEXT," +
                col_A.	P13	+ " TEXT," +
                col_A.	P14	+ " TEXT," +
                col_A.	P15	+ " TEXT," +
                col_A.	P16	+ " TEXT," +
                col_A.	P17	+ " TEXT," +
                col_A.	P18	+ " TEXT," +
                col_A.	P19	+ " TEXT," +
                col_A.	P20	+ " TEXT," +
                col_A.	P21	+ " TEXT," +
                col_A.	P22	+ " TEXT," +
                col_A.	P23	+ " TEXT," +
                col_A.	P24	+ " TEXT," +
                col_A.	P25	+ " TEXT," +
                col_A.	P26	+ " TEXT," +
                col_A.	P27	+ " TEXT," +


                col_A.	txt_P1	+ " TEXT," +
                col_A.	txt_P2	+ " TEXT," +
                col_A.	txt_P3	+ " TEXT," +
                col_A.	txt_P4	+ " TEXT," +
                col_A.	txt_P5	+ " TEXT," +
                col_A.	txt_P6	+ " TEXT," +
                col_A.	txt_P7	+ " TEXT," +
                col_A.	txt_P8	+ " TEXT," +
                col_A.	txt_P9	+ " TEXT," +

                col_A.	txt_P10	+ " TEXT," +
                col_A.	txt_P11	+ " TEXT," +
                col_A.	txt_P12	+ " TEXT," +
                col_A.	txt_P13	+ " TEXT," +
                col_A.	txt_P14	+ " TEXT," +
                col_A.	txt_P15	+ " TEXT," +
                col_A.	txt_P16	+ " TEXT," +
                col_A.	txt_P17	+ " TEXT," +
                col_A.	txt_P18	+ " TEXT," +
                col_A.	txt_P19	+ " TEXT," +
                col_A.	txt_P20	+ " TEXT," +
                col_A.	txt_P21	+ " TEXT," +
                col_A.	txt_P22	+ " TEXT," +
                col_A.	txt_P23	+ " TEXT," +
                col_A.	txt_P24	+ " TEXT," +
                col_A.	txt_P25	+ " TEXT," +
                col_A.	txt_P26	+ " TEXT," +
                col_A.	txt_P27	+ " TEXT," +



                col_A.	D1	+ " TEXT," +
                col_A.	D2	+ " TEXT," +
                col_A.	D3	+ " TEXT," +
                col_A.	D4	+ " TEXT," +
                col_A.	D5	+ " TEXT," +
                col_A.	D6	+ " TEXT," +
                col_A.	D7	+ " TEXT," +
                col_A.	D8	+ " TEXT," +
                col_A.	D9	+ " TEXT," +
                col_A.	D10	+ " TEXT," +
                col_A.	D11	+ " TEXT," +
                col_A.	D12	+ " TEXT," +
                col_A.	D13	+ " TEXT," +
                col_A.	D14	+ " TEXT," +
                col_A.	D15	+ " TEXT," +
                col_A.	D16	+ " TEXT," +
                col_A.	D17	+ " TEXT," +
                col_A.	D18	+ " TEXT," +
                col_A.	D19	+ " TEXT," +
                col_A.	D20	+ " TEXT," +
                col_A.	D21	+ " TEXT," +
                col_A.	D22	+ " TEXT," +
                col_A.	D23	+ " TEXT," +


                col_A.	D1_txt 	+ " TEXT," +
                col_A.	D2_txt	+ " TEXT," +
                col_A.	D3_txt	+ " TEXT," +
                col_A.	D4_txt	+ " TEXT," +
                col_A.	D5_txt	+ " TEXT," +
                col_A.	D6_txt	+ " TEXT," +
                col_A.	D7_txt	+ " TEXT," +
                col_A.	D8_txt	+ " TEXT," +
                col_A.	D9_txt	+ " TEXT," +
                col_A.	D10_txt	+ " TEXT," +
                col_A.	D11_txt	+ " TEXT," +
                col_A.	D12_txt	+ " TEXT," +
                col_A.	D13_txt	+ " TEXT," +
                col_A.	D14_txt	+ " TEXT," +
                col_A.	D15_txt	+ " TEXT," +
                col_A.	D16_txt	+ " TEXT," +
                col_A.	D17_txt	+ " TEXT," +
                col_A.	D18_txt	+ " TEXT," +
                col_A.	D19_txt	+ " TEXT," +
                col_A.	D20_txt	+ " TEXT," +
                col_A.	D21_txt	+ " TEXT," +
                col_A.	D22_txt	+ " TEXT," +
                col_A.	D23_txt	+ " TEXT," +



                col_A.	PNC1	+ " TEXT," +
                col_A.	PNC2	+ " TEXT," +
                col_A.	PNC3	+ " TEXT," +
                col_A.	PNC4	+ " TEXT," +
                col_A.	PNC5	+ " TEXT," +
                col_A.	PNC6	+ " TEXT," +
                col_A.	PNC7	+ " TEXT," +
                col_A.	PNC8	+ " TEXT," +
                col_A.	PNC9	+ " TEXT," +
                col_A.	PNC10	+ " TEXT," +
                col_A.	PNC11	+ " TEXT," +
                col_A.	PNC12	+ " TEXT," +


                col_A.	txt_PNC1	+ " TEXT," +
                col_A.	txt_PNC2	+ " TEXT," +
                col_A.	txt_PNC3	+ " TEXT," +
                col_A.	txt_PNC4	+ " TEXT," +
                col_A.	txt_PNC5	+ " TEXT," +
                col_A.	txt_PNC6	+ " TEXT," +
                col_A.	txt_PNC7	+ " TEXT," +
                col_A.	txt_PNC8	+ " TEXT," +
                col_A.	txt_PNC9	+ " TEXT," +
                col_A.	txt_PNC10	+ " TEXT," +
                col_A.	txt_PNC11	+ " TEXT," +
                col_A.	txt_PNC12	+ " TEXT," +





                col_A.	N1	+ " TEXT," +
                col_A.	N2	+ " TEXT," +
                col_A.	N3	+ " TEXT," +
                col_A.	N4	+ " TEXT," +
                col_A.	N5	+ " TEXT," +
                col_A.	N6	+ " TEXT," +
                col_A.	N7	+ " TEXT," +
                col_A.	N8	+ " TEXT," +
                col_A.	N9	+ " TEXT," +
                col_A.	N10	+ " TEXT," +
                col_A.	N11	+ " TEXT," +
                col_A.	N12	+ " TEXT," +
                col_A.	N13	+ " TEXT," +
                col_A.	N14	+ " TEXT," +
                col_A.	N15	+ " TEXT," +
                col_A.	N16	+ " TEXT," +
                col_A.	N17	+ " TEXT," +
                col_A.	N18	+ " TEXT," +
                col_A.	N19	+ " TEXT," +
                col_A.	N20	+ " TEXT," +
                col_A.	N21	+ " TEXT," +
                col_A.	N22	+ " TEXT," +
                col_A.	N23	+ " TEXT," +
                col_A.	N24	+ " TEXT," +

                col_A.	txt_N1	+ " TEXT," +
                col_A.	txt_N2	+ " TEXT," +
                col_A.	txt_N3	+ " TEXT," +
                col_A.	txt_N4	+ " TEXT," +
                col_A.	txt_N5	+ " TEXT," +
                col_A.	txt_N6	+ " TEXT," +
                col_A.	txt_N7	+ " TEXT," +
                col_A.	txt_N8	+ " TEXT," +
                col_A.	txt_N9	+ " TEXT," +
                col_A.	txt_N10	+ " TEXT," +
                col_A.	txt_N11	+ " TEXT," +
                col_A.	txt_N12	+ " TEXT," +
                col_A.	txt_N13	+ " TEXT," +
                col_A.	txt_N14	+ " TEXT," +
                col_A.	txt_N15	+ " TEXT," +
                col_A.	txt_N16	+ " TEXT," +
                col_A.	txt_N17	+ " TEXT," +
                col_A.	txt_N18	+ " TEXT," +
                col_A.	txt_N19	+ " TEXT," +
                col_A.	txt_N20	+ " TEXT," +
                col_A.	txt_N21	+ " TEXT," +
                col_A.	txt_N22	+ " TEXT," +
                col_A.	txt_N23	+ " TEXT," +
                col_A.	txt_N24	+ " TEXT," +



                col_A.	I1	+ " TEXT," +
                col_A.	I2	+ " TEXT," +
                col_A.	I3	+ " TEXT," +
                col_A.	I4	+ " TEXT," +
                col_A.	I5	+ " TEXT," +
                col_A.	I6	+ " TEXT," +
                col_A.	I7	+ " TEXT," +
                col_A.	I8	+ " TEXT," +
                col_A.	I9	+ " TEXT," +
                col_A.	I10	+ " TEXT," +
                col_A.	I11	+ " TEXT," +

                col_A.	txt_I1	+ " TEXT," +
                col_A.	txt_I2	+ " TEXT," +
                col_A.	txt_I3	+ " TEXT," +
                col_A.	txt_I4	+ " TEXT," +
                col_A.	txt_I5	+ " TEXT," +
                col_A.	txt_I6	+ " TEXT," +
                col_A.	txt_I7	+ " TEXT," +
                col_A.	txt_I8	+ " TEXT," +
                col_A.	txt_I9	+ " TEXT," +
                col_A.	txt_I10	+ " TEXT," +
                col_A.	txt_I11	+ " TEXT," +



                col_A.	DI1	+ " TEXT," +
                col_A.	DI2	+ " TEXT," +
                col_A.	DI3	+ " TEXT," +
                col_A.	DI4	+ " TEXT," +
                col_A.	DI5	+ " TEXT," +
                col_A.	DI6	+ " TEXT," +
                col_A.	DI7	+ " TEXT," +
                col_A.	DI8	+ " TEXT," +
                col_A.	DI9	+ " TEXT," +
                col_A.	DI10	+ " TEXT," +
                col_A.	DI11	+ " TEXT," +

                col_A.	txt_DI1	+ " TEXT," +
                col_A.	txt_DI2	+ " TEXT," +
                col_A.	txt_DI3	+ " TEXT," +
                col_A.	txt_DI4	+ " TEXT," +
                col_A.	txt_DI5	+ " TEXT," +
                col_A.	txt_DI6	+ " TEXT," +
                col_A.	txt_DI7	+ " TEXT," +
                col_A.	txt_DI8	+ " TEXT," +
                col_A.	txt_DI9	+ " TEXT," +
                col_A.	txt_DI10	+ " TEXT," +
                col_A.	txt_DI11	+ " TEXT," +



                col_A.	PN1	+ " TEXT," +
                col_A.	PN2	+ " TEXT," +
                col_A.	PN3	+ " TEXT," +
                col_A.	PN4	+ " TEXT," +
                col_A.	PN5	+ " TEXT," +
                col_A.	PN6	+ " TEXT," +
                col_A.	PN7	+ " TEXT," +
                col_A.	PN8	+ " TEXT," +
                col_A.	PN9	+ " TEXT," +
                col_A.	PN10	+ " TEXT," +
                col_A.	PN11	+ " TEXT," +
                col_A.	PN12	+ " TEXT," +
                col_A.	PN13	+ " TEXT," +
                col_A.	PN14	+ " TEXT," +
                col_A.	PN15	+ " TEXT," +
                col_A.	PN16	+ " TEXT," +
                col_A.	PN17	+ " TEXT," +
                col_A.	PN18	+ " TEXT," +
                col_A.	PN19	+ " TEXT," +
                col_A.	PN20	+ " TEXT," +
                col_A.	PN21	+ " TEXT," +

                col_A.	txt_PN1	+ " TEXT," +
                col_A.	txt_PN2	+ " TEXT," +
                col_A.	txt_PN3	+ " TEXT," +
                col_A.	txt_PN4	+ " TEXT," +
                col_A.	txt_PN5	+ " TEXT," +
                col_A.	txt_PN6	+ " TEXT," +
                col_A.	txt_PN7	+ " TEXT," +
                col_A.	txt_PN8	+ " TEXT," +



                col_A.	txt_PN9	+ " TEXT," +
                col_A.	txt_PN10	+ " TEXT," +
                col_A.	txt_PN11	+ " TEXT," +
                col_A.	txt_PN12	+ " TEXT," +
                col_A.	txt_PN13	+ " TEXT," +
                col_A.	txt_PN14	+ " TEXT," +
                col_A.	txt_PN15	+ " TEXT," +
                col_A.	txt_PN16	+ " TEXT," +
                col_A.	txt_PN17	+ " TEXT," +
                col_A.	txt_PN18	+ " TEXT," +
                col_A.	txt_PN19	+ " TEXT," +
                col_A.	txt_PN20	+ " TEXT," +
                col_A.	txt_PN21	+ " TEXT," +


                col_A.datee + " Text," +
                col_A.timee + " Text," +
                col_A.userid + " Text," +

                col_A.Interview_status + " Text" +





                ')';


        return query;
    }
}
