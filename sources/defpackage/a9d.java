package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class a9d {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ a9d[] $VALUES;
    public static final a9d Max;
    public static final a9d Min;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, a9d] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, a9d] */
    static {
        ?? r0 = new Enum("Min", 0);
        Min = r0;
        ?? r1 = new Enum("Max", 1);
        Max = r1;
        a9d[] a9dVarArr = {r0, r1};
        $VALUES = a9dVarArr;
        $ENTRIES = new wg7(a9dVarArr);
    }

    public static a9d valueOf(String str) {
        return (a9d) Enum.valueOf(a9d.class, str);
    }

    public static a9d[] values() {
        return (a9d[]) $VALUES.clone();
    }
}
