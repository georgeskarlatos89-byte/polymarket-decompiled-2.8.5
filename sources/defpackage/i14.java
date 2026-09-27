package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class i14 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ i14[] $VALUES;
    public static final i14 COMPLETE;
    public static final i14 EXPIRED;
    public static final i14 OPEN;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, i14] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, i14] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, i14] */
    static {
        ?? r0 = new Enum("OPEN", 0);
        OPEN = r0;
        ?? r1 = new Enum("COMPLETE", 1);
        COMPLETE = r1;
        ?? r2 = new Enum("EXPIRED", 2);
        EXPIRED = r2;
        i14[] i14VarArr = {r0, r1, r2};
        $VALUES = i14VarArr;
        $ENTRIES = new wg7(i14VarArr);
    }

    public static i14 valueOf(String str) {
        return (i14) Enum.valueOf(i14.class, str);
    }

    public static i14[] values() {
        return (i14[]) $VALUES.clone();
    }
}
