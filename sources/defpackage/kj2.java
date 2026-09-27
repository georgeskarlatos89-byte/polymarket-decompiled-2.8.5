package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class kj2 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ kj2[] $VALUES;
    public static final kj2 Filled;
    public static final kj2 Outlined;

    /* JADX WARN: Type inference failed for: r0v0, types: [kj2, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [kj2, java.lang.Enum] */
    static {
        ?? r0 = new Enum("Filled", 0);
        Filled = r0;
        ?? r1 = new Enum("Outlined", 1);
        Outlined = r1;
        kj2[] kj2VarArr = {r0, r1};
        $VALUES = kj2VarArr;
        $ENTRIES = new wg7(kj2VarArr);
    }

    public static kj2 valueOf(String str) {
        return (kj2) Enum.valueOf(kj2.class, str);
    }

    public static kj2[] values() {
        return (kj2[]) $VALUES.clone();
    }
}
