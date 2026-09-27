package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class a7a {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ a7a[] $VALUES;
    public static final a7a Max;
    public static final a7a Min;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, a7a] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, a7a] */
    static {
        ?? r0 = new Enum("Min", 0);
        Min = r0;
        ?? r1 = new Enum("Max", 1);
        Max = r1;
        a7a[] a7aVarArr = {r0, r1};
        $VALUES = a7aVarArr;
        $ENTRIES = new wg7(a7aVarArr);
    }

    public static a7a valueOf(String str) {
        return (a7a) Enum.valueOf(a7a.class, str);
    }

    public static a7a[] values() {
        return (a7a[]) $VALUES.clone();
    }
}
