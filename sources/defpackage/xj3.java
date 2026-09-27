package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class xj3 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ xj3[] $VALUES;
    public static final xj3 Leading;
    public static final xj3 Trailing;

    /* JADX WARN: Type inference failed for: r0v0, types: [xj3, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [xj3, java.lang.Enum] */
    static {
        ?? r0 = new Enum("Leading", 0);
        Leading = r0;
        ?? r1 = new Enum("Trailing", 1);
        Trailing = r1;
        xj3[] xj3VarArr = {r0, r1};
        $VALUES = xj3VarArr;
        $ENTRIES = new wg7(xj3VarArr);
    }

    public static xj3 valueOf(String str) {
        return (xj3) Enum.valueOf(xj3.class, str);
    }

    public static xj3[] values() {
        return (xj3[]) $VALUES.clone();
    }
}
