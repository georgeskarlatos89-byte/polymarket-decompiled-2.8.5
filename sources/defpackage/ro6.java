package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class ro6 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ ro6[] $VALUES;
    public static final ro6 STABLE;
    public static final ro6 UNSTABLE;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, ro6] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, ro6] */
    static {
        ?? r0 = new Enum("STABLE", 0);
        STABLE = r0;
        ?? r1 = new Enum("UNSTABLE", 1);
        UNSTABLE = r1;
        ro6[] ro6VarArr = {r0, r1};
        $VALUES = ro6VarArr;
        $ENTRIES = new wg7(ro6VarArr);
    }

    public static ro6 valueOf(String str) {
        return (ro6) Enum.valueOf(ro6.class, str);
    }

    public static ro6[] values() {
        return (ro6[]) $VALUES.clone();
    }
}
