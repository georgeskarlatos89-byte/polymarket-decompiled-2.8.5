package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class phg {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ phg[] $VALUES;
    public static final phg FILL;
    public static final phg FIT;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, phg] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, phg] */
    static {
        ?? r0 = new Enum("FILL", 0);
        FILL = r0;
        ?? r1 = new Enum("FIT", 1);
        FIT = r1;
        phg[] phgVarArr = {r0, r1};
        $VALUES = phgVarArr;
        $ENTRIES = new wg7(phgVarArr);
    }

    public static phg valueOf(String str) {
        return (phg) Enum.valueOf(phg.class, str);
    }

    public static phg[] values() {
        return (phg[]) $VALUES.clone();
    }
}
