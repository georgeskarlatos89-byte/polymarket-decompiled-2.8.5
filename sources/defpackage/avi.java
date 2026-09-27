package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class avi {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ avi[] $VALUES;
    public static final avi Filled;
    public static final avi Outlined;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, avi] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, avi] */
    static {
        ?? r0 = new Enum("Filled", 0);
        Filled = r0;
        ?? r1 = new Enum("Outlined", 1);
        Outlined = r1;
        avi[] aviVarArr = {r0, r1};
        $VALUES = aviVarArr;
        $ENTRIES = new wg7(aviVarArr);
    }

    public static avi valueOf(String str) {
        return (avi) Enum.valueOf(avi.class, str);
    }

    public static avi[] values() {
        return (avi[]) $VALUES.clone();
    }
}
