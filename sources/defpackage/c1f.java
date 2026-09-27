package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class c1f {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ c1f[] $VALUES;
    public static final c1f AUTOMATIC;
    public static final c1f EXACT;
    public static final c1f INEXACT;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, c1f] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, c1f] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, c1f] */
    static {
        ?? r0 = new Enum("EXACT", 0);
        EXACT = r0;
        ?? r1 = new Enum("INEXACT", 1);
        INEXACT = r1;
        ?? r2 = new Enum("AUTOMATIC", 2);
        AUTOMATIC = r2;
        c1f[] c1fVarArr = {r0, r1, r2};
        $VALUES = c1fVarArr;
        $ENTRIES = new wg7(c1fVarArr);
    }

    public static c1f valueOf(String str) {
        return (c1f) Enum.valueOf(c1f.class, str);
    }

    public static c1f[] values() {
        return (c1f[]) $VALUES.clone();
    }
}
