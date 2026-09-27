package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class uxf {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ uxf[] $VALUES;
    public static final uxf PROD;
    public static final uxf SANDBOX;

    /* JADX WARN: Type inference failed for: r0v0, types: [uxf, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [uxf, java.lang.Enum] */
    static {
        ?? r0 = new Enum("SANDBOX", 0);
        SANDBOX = r0;
        ?? r1 = new Enum("PROD", 1);
        PROD = r1;
        uxf[] uxfVarArr = {r0, r1};
        $VALUES = uxfVarArr;
        $ENTRIES = new wg7(uxfVarArr);
    }

    public static uxf valueOf(String str) {
        return (uxf) Enum.valueOf(uxf.class, str);
    }

    public static uxf[] values() {
        return (uxf[]) $VALUES.clone();
    }
}
