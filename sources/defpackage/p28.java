package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class p28 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ p28[] $VALUES;
    public static final p28 Full;
    public static final p28 Lite;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, p28] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, p28] */
    static {
        ?? r0 = new Enum("Full", 0);
        Full = r0;
        ?? r1 = new Enum("Lite", 1);
        Lite = r1;
        p28[] p28VarArr = {r0, r1};
        $VALUES = p28VarArr;
        $ENTRIES = new wg7(p28VarArr);
    }

    public static p28 valueOf(String str) {
        return (p28) Enum.valueOf(p28.class, str);
    }

    public static p28[] values() {
        return (p28[]) $VALUES.clone();
    }
}
