package defpackage;

import com.socure.docv.capturesdk.common.utils.ConstantsKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class ul1 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ ul1[] $VALUES;
    public static final ul1 ANDROID_LOGCAT;
    public static final ul1 CLOCK_12_HOUR;
    public static final ul1 LONG;
    public static final ul1 SHORT;
    private final String format;

    static {
        ul1 ul1Var = new ul1("SHORT", 0, ConstantsKt.READABLE_DATE_FORMAT);
        SHORT = ul1Var;
        ul1 ul1Var2 = new ul1("LONG", 1, "yyyy-MM-dd kk:mm:ss");
        LONG = ul1Var2;
        ul1 ul1Var3 = new ul1("ANDROID_LOGCAT", 2, "MM-dd kk:mm:ss.SSS");
        ANDROID_LOGCAT = ul1Var3;
        ul1 ul1Var4 = new ul1("CLOCK_12_HOUR", 3, "h:mm a");
        CLOCK_12_HOUR = ul1Var4;
        ul1[] ul1VarArr = {ul1Var, ul1Var2, ul1Var3, ul1Var4};
        $VALUES = ul1VarArr;
        $ENTRIES = new wg7(ul1VarArr);
    }

    public ul1(String str, int i, String str2) {
        this.format = str2;
    }

    public static ul1 valueOf(String str) {
        return (ul1) Enum.valueOf(ul1.class, str);
    }

    public static ul1[] values() {
        return (ul1[]) $VALUES.clone();
    }

    public final String getFormat() {
        return this.format;
    }
}
