package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class k41 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ k41[] $VALUES;
    public static final k41 Primary;
    public static final k41 Secondary;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, k41] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, k41] */
    static {
        ?? r0 = new Enum("Primary", 0);
        Primary = r0;
        ?? r1 = new Enum("Secondary", 1);
        Secondary = r1;
        k41[] k41VarArr = {r0, r1};
        $VALUES = k41VarArr;
        $ENTRIES = new wg7(k41VarArr);
    }

    public static k41 valueOf(String str) {
        return (k41) Enum.valueOf(k41.class, str);
    }

    public static k41[] values() {
        return (k41[]) $VALUES.clone();
    }
}
