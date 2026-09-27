package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class l78 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ l78[] $VALUES;
    public static final l78 Decrease;
    public static final l78 Increase;
    public static final l78 None;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, l78] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, l78] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, l78] */
    static {
        ?? r0 = new Enum("None", 0);
        None = r0;
        ?? r1 = new Enum("Increase", 1);
        Increase = r1;
        ?? r2 = new Enum("Decrease", 2);
        Decrease = r2;
        l78[] l78VarArr = {r0, r1, r2};
        $VALUES = l78VarArr;
        $ENTRIES = new wg7(l78VarArr);
    }

    public static l78 valueOf(String str) {
        return (l78) Enum.valueOf(l78.class, str);
    }

    public static l78[] values() {
        return (l78[]) $VALUES.clone();
    }
}
