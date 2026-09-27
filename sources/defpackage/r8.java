package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class r8 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ r8[] $VALUES;
    public static final r8 Primary;
    public static final r8 Secondary;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, r8] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, r8] */
    static {
        ?? r0 = new Enum("Secondary", 0);
        Secondary = r0;
        ?? r1 = new Enum("Primary", 1);
        Primary = r1;
        r8[] r8VarArr = {r0, r1};
        $VALUES = r8VarArr;
        $ENTRIES = new wg7(r8VarArr);
    }

    public static r8 valueOf(String str) {
        return (r8) Enum.valueOf(r8.class, str);
    }

    public static r8[] values() {
        return (r8[]) $VALUES.clone();
    }
}
