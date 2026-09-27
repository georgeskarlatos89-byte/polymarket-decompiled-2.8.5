package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class cqd {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ cqd[] $VALUES;
    public static final cqd NONE;
    public static final cqd SPACE;
    public static final cqd ZERO;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, cqd] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, cqd] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, cqd] */
    static {
        ?? r0 = new Enum("NONE", 0);
        NONE = r0;
        ?? r1 = new Enum("ZERO", 1);
        ZERO = r1;
        ?? r2 = new Enum("SPACE", 2);
        SPACE = r2;
        cqd[] cqdVarArr = {r0, r1, r2};
        $VALUES = cqdVarArr;
        $ENTRIES = new wg7(cqdVarArr);
    }

    public static cqd valueOf(String str) {
        return (cqd) Enum.valueOf(cqd.class, str);
    }

    public static cqd[] values() {
        return (cqd[]) $VALUES.clone();
    }
}
