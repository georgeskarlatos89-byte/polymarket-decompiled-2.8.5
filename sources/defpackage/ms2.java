package defpackage;

import com.polymarket.designtokens.DesignTokens;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public abstract class ms2 {
    public static ns2 a(DesignTokens.Typography typography) {
        sh8 sh8Var;
        String str;
        typography.getClass();
        sh8 sh8Var2 = mjj.a;
        int[] iArr = jjj.a;
        switch (iArr[typography.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                sh8Var = mjj.c;
                break;
            default:
                if (typography.getDefaultFamily() == DesignTokens.FontFamily.rounded) {
                    sh8Var = mjj.b;
                    break;
                } else {
                    sh8Var = mjj.a;
                    break;
                }
        }
        sh8 sh8Var3 = sh8Var;
        float defaultSize = (float) typography.getDefaultSize();
        float defaultLineHeight = (float) typography.getDefaultLineHeight();
        float defaultLetterSpacing = (float) typography.getDefaultLetterSpacing();
        int defaultNumericWeight = typography.getDefaultNumericWeight();
        switch (iArr[typography.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                str = "case";
                break;
            default:
                str = "cv02, cv07, ss04, cv15";
                break;
        }
        switch (iArr[typography.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                str = str.concat(", cv09");
                break;
        }
        return new ns2(defaultSize, defaultLineHeight, defaultLetterSpacing, defaultNumericWeight, sh8Var3, str);
    }
}
