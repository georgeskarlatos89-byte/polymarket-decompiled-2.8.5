package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class k5k {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ k5k[] $VALUES;
    public static final k5k Impulse;
    public static final k5k Lsq2;

    /* JADX WARN: Type inference failed for: r0v0, types: [k5k, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [k5k, java.lang.Enum] */
    static {
        ?? r0 = new Enum("Lsq2", 0);
        Lsq2 = r0;
        ?? r1 = new Enum("Impulse", 1);
        Impulse = r1;
        k5k[] k5kVarArr = {r0, r1};
        $VALUES = k5kVarArr;
        $ENTRIES = new wg7(k5kVarArr);
    }

    public static k5k valueOf(String str) {
        return (k5k) Enum.valueOf(k5k.class, str);
    }

    public static k5k[] values() {
        return (k5k[]) $VALUES.clone();
    }
}
