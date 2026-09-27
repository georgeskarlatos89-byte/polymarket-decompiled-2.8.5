package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class w9b {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ w9b[] $VALUES;
    public static final w9b BackPressed;
    public static final w9b LoggedOut;
    public static final w9b PayAnotherWay;

    /* JADX WARN: Type inference failed for: r0v0, types: [w9b, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [w9b, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [w9b, java.lang.Enum] */
    static {
        ?? r0 = new Enum("BackPressed", 0);
        BackPressed = r0;
        ?? r1 = new Enum("LoggedOut", 1);
        LoggedOut = r1;
        ?? r2 = new Enum("PayAnotherWay", 2);
        PayAnotherWay = r2;
        w9b[] w9bVarArr = {r0, r1, r2};
        $VALUES = w9bVarArr;
        $ENTRIES = new wg7(w9bVarArr);
    }

    public static w9b valueOf(String str) {
        return (w9b) Enum.valueOf(w9b.class, str);
    }

    public static w9b[] values() {
        return (w9b[]) $VALUES.clone();
    }
}
