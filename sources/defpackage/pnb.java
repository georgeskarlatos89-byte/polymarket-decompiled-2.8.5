package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class pnb {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ pnb[] $VALUES;
    public static final pnb APPEND;
    public static final pnb PREPEND;
    public static final pnb REFRESH;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, pnb] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, pnb] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, pnb] */
    static {
        ?? r0 = new Enum("REFRESH", 0);
        REFRESH = r0;
        ?? r1 = new Enum("PREPEND", 1);
        PREPEND = r1;
        ?? r2 = new Enum("APPEND", 2);
        APPEND = r2;
        pnb[] pnbVarArr = {r0, r1, r2};
        $VALUES = pnbVarArr;
        $ENTRIES = new wg7(pnbVarArr);
    }

    public static pnb valueOf(String str) {
        return (pnb) Enum.valueOf(pnb.class, str);
    }

    public static pnb[] values() {
        return (pnb[]) $VALUES.clone();
    }
}
