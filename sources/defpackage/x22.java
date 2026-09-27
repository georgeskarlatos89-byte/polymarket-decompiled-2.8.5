package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class x22 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ x22[] $VALUES;
    public static final x22 Compact;
    public static final x22 Standard;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, x22] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, x22] */
    static {
        ?? r0 = new Enum("Standard", 0);
        Standard = r0;
        ?? r1 = new Enum("Compact", 1);
        Compact = r1;
        x22[] x22VarArr = {r0, r1};
        $VALUES = x22VarArr;
        $ENTRIES = new wg7(x22VarArr);
    }

    public static x22 valueOf(String str) {
        return (x22) Enum.valueOf(x22.class, str);
    }

    public static x22[] values() {
        return (x22[]) $VALUES.clone();
    }
}
