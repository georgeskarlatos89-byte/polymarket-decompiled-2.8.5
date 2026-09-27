package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class rk9 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ rk9[] $VALUES;
    public static final rk9 Filled;
    public static final rk9 Outlined;

    /* JADX WARN: Type inference failed for: r0v0, types: [rk9, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [rk9, java.lang.Enum] */
    static {
        ?? r0 = new Enum("Filled", 0);
        Filled = r0;
        ?? r1 = new Enum("Outlined", 1);
        Outlined = r1;
        rk9[] rk9VarArr = {r0, r1};
        $VALUES = rk9VarArr;
        $ENTRIES = new wg7(rk9VarArr);
    }

    public static rk9 valueOf(String str) {
        return (rk9) Enum.valueOf(rk9.class, str);
    }

    public static rk9[] values() {
        return (rk9[]) $VALUES.clone();
    }
}
