package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class qhg {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ qhg[] $VALUES;
    public static final qhg FILL;
    public static final qhg FIT;

    /* JADX WARN: Type inference failed for: r0v0, types: [qhg, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [qhg, java.lang.Enum] */
    static {
        ?? r0 = new Enum("FILL", 0);
        FILL = r0;
        ?? r1 = new Enum("FIT", 1);
        FIT = r1;
        qhg[] qhgVarArr = {r0, r1};
        $VALUES = qhgVarArr;
        $ENTRIES = new wg7(qhgVarArr);
    }

    public static qhg valueOf(String str) {
        return (qhg) Enum.valueOf(qhg.class, str);
    }

    public static qhg[] values() {
        return (qhg[]) $VALUES.clone();
    }
}
