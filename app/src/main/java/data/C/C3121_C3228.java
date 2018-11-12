package data.C;

import Global.C.C3101_C3112;

/**
 * Created by Umeed-e-Nau on 12/24/2016.
 */
public class C3121_C3228 {
    public static String TABLE_NAME = "C3121_C3228";

    public static String getCreateQuery() {
        String query;
        query = "CREATE TABLE '" + TABLE_NAME + "' ('id' INTEGER PRIMARY KEY AUTOINCREMENT, 'study_id' TEXT,   " +

                Global.C.C3121_C3228.C3121 + " TEXT," +
                Global.C.C3121_C3228.C3122d + " TEXT," +
                Global.C.C3121_C3228.C3122m + " TEXT," +
                Global.C.C3121_C3228.C3122y + " TEXT," +
                Global.C.C3121_C3228.C3123_u + " TEXT," +
                Global.C.C3121_C3228.C3123_b + " TEXT," +
                Global.C.C3121_C3228.C3123_c + " TEXT," +
                Global.C.C3121_C3228.C3124 + " TEXT," +
                Global.C.C3121_C3228.C3125 + " TEXT," +
                Global.C.C3121_C3228.C3126 + " TEXT," +
                Global.C.C3121_C3228.C3127 + " TEXT," +
                Global.C.C3121_C3228.C3128 + " TEXT," +
                Global.C.C3121_C3228.C3129 + " TEXT," +
                Global.C.C3121_C3228.C3130 + " TEXT," +
                Global.C.C3121_C3228.C3131 + " TEXT," +
                Global.C.C3121_C3228.C3132_u + " TEXT," +
                Global.C.C3121_C3228.C3132_a + " TEXT," +
                Global.C.C3121_C3228.C3132_b + " TEXT," +
                Global.C.C3121_C3228.C3133 + " TEXT," +
                Global.C.C3121_C3228.C3134 + " TEXT," +
                Global.C.C3121_C3228.C3135 + " TEXT," +
                Global.C.C3121_C3228.C3136 + " TEXT," +
                Global.C.C3121_C3228.C3137 + " TEXT," +
                Global.C.C3121_C3228.C3138 + " TEXT," +
                Global.C.C3121_C3228.C3139 + " TEXT," +
                Global.C.C3121_C3228.C3140 + " TEXT," +
                Global.C.C3121_C3228.C3141 + " TEXT," +
                Global.C.C3121_C3228.C3142 + " TEXT," +
                Global.C.C3121_C3228.C3143 + " TEXT," +
                Global.C.C3121_C3228.C3144_u + " TEXT," +
                Global.C.C3121_C3228.C3144 + " TEXT," +
                Global.C.C3121_C3228.C3144_a + " TEXT," +
                Global.C.C3121_C3228.C3144_b + " TEXT," +
                Global.C.C3121_C3228.C3145 + " TEXT," +
                Global.C.C3121_C3228.C3146 + " TEXT," +
                Global.C.C3121_C3228.C3147_u + " TEXT," +
                Global.C.C3121_C3228.C3147_a + " TEXT," +
                Global.C.C3121_C3228.C3147_b + " TEXT," +
                Global.C.C3121_C3228.C3148 + " TEXT," +
                Global.C.C3121_C3228.C3149 + " TEXT," +
                Global.C.C3121_C3228.C3150_u + " TEXT," +
                Global.C.C3121_C3228.C3150_a + " TEXT," +
                Global.C.C3121_C3228.C3150_b + " TEXT," +
                Global.C.C3121_C3228.C3151 + " TEXT," +
                Global.C.C3121_C3228.C3152_u + " TEXT," +
                Global.C.C3121_C3228.C3152_a + " TEXT," +
                Global.C.C3121_C3228.C3152_b + " TEXT," +
                Global.C.C3121_C3228.C3153 + " TEXT," +
                Global.C.C3121_C3228.C3154 + " TEXT," +
                Global.C.C3121_C3228.C3155 + " TEXT," +
                Global.C.C3121_C3228.C3156 + " TEXT," +
                Global.C.C3121_C3228.C3157 + " TEXT," +
                Global.C.C3121_C3228.C3158 + " TEXT," +
                Global.C.C3121_C3228.C3159_u + " TEXT," +
                Global.C.C3121_C3228.C3159_a + " TEXT," +
                Global.C.C3121_C3228.C3159_b + " TEXT," +
                Global.C.C3121_C3228.C3159_c + " TEXT," +
                Global.C.C3121_C3228.C3160 + " TEXT," +
                Global.C.C3121_C3228.C3161 + " TEXT," +
                Global.C.C3121_C3228.C3162d + " TEXT," +
                Global.C.C3121_C3228.C3162m + " TEXT," +
                Global.C.C3121_C3228.C3163_u + " TEXT," +
                Global.C.C3121_C3228.C3163_a + " TEXT," +
                Global.C.C3121_C3228.C3163_b + " TEXT," +
                Global.C.C3121_C3228.C3164 + " TEXT," +
                Global.C.C3121_C3228.C3165_u + " TEXT," +
                Global.C.C3121_C3228.C3165_a + " TEXT," +
                Global.C.C3121_C3228.C3165_b + " TEXT," +
                Global.C.C3121_C3228.C3166 + " TEXT," +
                Global.C.C3121_C3228.C3167 + " TEXT," +
                Global.C.C3121_C3228.C3168 + " TEXT," +
                Global.C.C3121_C3228.C3169 + " TEXT," +
                Global.C.C3121_C3228.C3170 + " TEXT," +
                Global.C.C3121_C3228.C3171 + " TEXT," +
                Global.C.C3121_C3228.C3172 + " TEXT," +
                Global.C.C3121_C3228.C3173 + " TEXT," +
                Global.C.C3121_C3228.C3174 + " TEXT," +
                Global.C.C3121_C3228.C3175_u + " TEXT," +
                Global.C.C3121_C3228.C3175_a + " TEXT," +
                Global.C.C3121_C3228.C3175_b + " TEXT," +
                Global.C.C3121_C3228.C3176 + " TEXT," +
                Global.C.C3121_C3228.C3177_u + " TEXT," +
                Global.C.C3121_C3228.C3177_a + " TEXT," +
                Global.C.C3121_C3228.C3177_b + " TEXT," +
                Global.C.C3121_C3228.C3178 + " TEXT," +
                Global.C.C3121_C3228.C3179_u + " TEXT," +
                Global.C.C3121_C3228.C3179_a + " TEXT," +
                Global.C.C3121_C3228.C3179_b + " TEXT," +
                Global.C.C3121_C3228.C3180 + " TEXT," +
                Global.C.C3121_C3228.C3181 + " TEXT," +
                Global.C.C3121_C3228.C3182 + " TEXT," +
                Global.C.C3121_C3228.C3183 + " TEXT," +
                Global.C.C3121_C3228.C3184 + " TEXT," +
                Global.C.C3121_C3228.C3185 + " TEXT," +
                Global.C.C3121_C3228.C3186_1 + " TEXT," +
                Global.C.C3121_C3228.C3186 + " TEXT," +
                Global.C.C3121_C3228.C3187 + " TEXT," +
                Global.C.C3121_C3228.C3188 + " TEXT," +
                Global.C.C3121_C3228.C3189 + " TEXT," +
                Global.C.C3121_C3228.C3190 + " TEXT," +
                Global.C.C3121_C3228.C3191 + " TEXT," +
                Global.C.C3121_C3228.C3192 + " TEXT," +
                Global.C.C3121_C3228.C3193_u + " TEXT," +
                Global.C.C3121_C3228.C3193_a + " TEXT," +
                Global.C.C3121_C3228.C3193_b + " TEXT," +
                Global.C.C3121_C3228.C3194 + " TEXT," +
                Global.C.C3121_C3228.C3195A + " TEXT," +
                Global.C.C3121_C3228.C3195 + " TEXT," +
                Global.C.C3121_C3228.C3196 + " TEXT," +
                Global.C.C3121_C3228.C3197 + " TEXT," +
                Global.C.C3121_C3228.C3198 + " TEXT," +
                Global.C.C3121_C3228.C3199 + " TEXT," +
                Global.C.C3121_C3228.C3199_1 + " TEXT," +
                Global.C.C3121_C3228.C3200 + " TEXT," +
                Global.C.C3121_C3228.C3201_u + " TEXT," +
                Global.C.C3121_C3228.C3201_a + " TEXT," +
                Global.C.C3121_C3228.C3201_b + " TEXT," +
                Global.C.C3121_C3228.C3202 + " TEXT," +
                Global.C.C3121_C3228.C3203 + " TEXT," +
                Global.C.C3121_C3228.C3204_u + " TEXT," +
                Global.C.C3121_C3228.C3204_a + " TEXT," +
                Global.C.C3121_C3228.C3204_b + " TEXT," +
                Global.C.C3121_C3228.C3205 + " TEXT," +
                Global.C.C3121_C3228.C3206 + " TEXT," +
                Global.C.C3121_C3228.C3207 + " TEXT," +
                Global.C.C3121_C3228.C3208_u + " TEXT," +
                Global.C.C3121_C3228.C3208_a + " TEXT," +
                Global.C.C3121_C3228.C3208_b + " TEXT," +
                Global.C.C3121_C3228.C3209 + " TEXT," +
                Global.C.C3121_C3228.C3210 + " TEXT," +
                Global.C.C3121_C3228.C3212 + " TEXT," +
                Global.C.C3121_C3228.C3213 + " TEXT," +
                Global.C.C3121_C3228.C3214 + " TEXT," +
                Global.C.C3121_C3228.C3215 + " TEXT," +
                Global.C.C3121_C3228.C3216 + " TEXT," +
                Global.C.C3121_C3228.C3217 + " TEXT," +
                Global.C.C3121_C3228.C3218 + " TEXT," +
                Global.C.C3121_C3228.C3218_OT + " TEXT," +
                Global.C.C3121_C3228.C3219 + " TEXT," +
                Global.C.C3121_C3228.C3220_u + " TEXT," +
                Global.C.C3121_C3228.C3220_a + " TEXT," +
                Global.C.C3121_C3228.C3220_b + " TEXT," +
                Global.C.C3121_C3228.C3221 + " TEXT," +
                Global.C.C3121_C3228.C3222 + " TEXT," +
                Global.C.C3121_C3228.C3223 + " TEXT," +
                Global.C.C3121_C3228.C3224 + " TEXT," +
                Global.C.C3121_C3228.C3225 + " TEXT," +
                Global.C.C3121_C3228.C3226 + " TEXT," +
                Global.C.C3121_C3228.C3227 + " TEXT," +
                Global.C.C3121_C3228.C3227_1 + " TEXT," +
                Global.C.C3121_C3228.C3227_2 + " TEXT," +
                Global.C.C3121_C3228.C3227_3 + " TEXT," +
                Global.C.C3121_C3228.C3227_4 + " TEXT," +
                Global.C.C3121_C3228.C3227_5 + " TEXT," +
                Global.C.C3121_C3228.C3227_6 + " TEXT," +
                Global.C.C3121_C3228.C3227_7 + " TEXT," +
                Global.C.C3121_C3228.C3227_8 + " TEXT," +
                Global.C.C3121_C3228.C3227_9 + " TEXT," +
                Global.C.C3121_C3228.C3227_10 + " TEXT," +
                Global.C.C3121_C3228.C3227_11 + " TEXT," +
                Global.C.C3121_C3228.C3227_12 + " TEXT," +
                Global.C.C3121_C3228.C3227_13 + " TEXT," +
                Global.C.C3121_C3228.C3227_14 + " TEXT," +
                Global.C.C3121_C3228.C3227_15 + " TEXT," +
                Global.C.C3121_C3228.C3227_16 + " TEXT," +
                Global.C.C3121_C3228.C3227_17 + " TEXT," +
                Global.C.C3121_C3228.C3227_18 + " TEXT," +
                Global.C.C3121_C3228.C3227_19 + " TEXT," +
                Global.C.C3121_C3228.C3227_20 + " TEXT," +
                Global.C.C3121_C3228.C3227_21 + " TEXT," +
                Global.C.C3121_C3228.C3227_22 + " TEXT," +
                Global.C.C3121_C3228.C3228 + " TEXT," +
                C3101_C3112.STATUS + " TEXT" +
                ')';

        return query;
    }

    /*public static String getAlterQuery() {
        String query;
        query = "ALTER TABLE '" + TABLE_NAME + "' ADD COLUMN " +
                Global.C.C3121_C3228.C3122y + " TEXT;";

        return query;
    }*/
}

