package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class b1f {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ b1f[] $VALUES;
    public static final b1f EXACT;
    public static final b1f INEXACT;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, b1f] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, b1f] */
    static {
        ?? r0 = new Enum("EXACT", 0);
        EXACT = r0;
        ?? r1 = new Enum("INEXACT", 1);
        INEXACT = r1;
        b1f[] b1fVarArr = {r0, r1};
        $VALUES = b1fVarArr;
        $ENTRIES = new wg7(b1fVarArr);
    }

    public static b1f valueOf(String str) {
        return (b1f) Enum.valueOf(b1f.class, str);
    }

    public static b1f[] values() {
        return (b1f[]) $VALUES.clone();
    }
}
