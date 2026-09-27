package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class xxa {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ xxa[] $VALUES;
    public static final xxa Horizontal;
    public static final xxa Vertical;

    /* JADX WARN: Type inference failed for: r0v0, types: [xxa, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [xxa, java.lang.Enum] */
    static {
        ?? r0 = new Enum("Horizontal", 0);
        Horizontal = r0;
        ?? r1 = new Enum("Vertical", 1);
        Vertical = r1;
        xxa[] xxaVarArr = {r0, r1};
        $VALUES = xxaVarArr;
        $ENTRIES = new wg7(xxaVarArr);
    }

    public static xxa valueOf(String str) {
        return (xxa) Enum.valueOf(xxa.class, str);
    }

    public static xxa[] values() {
        return (xxa[]) $VALUES.clone();
    }
}
