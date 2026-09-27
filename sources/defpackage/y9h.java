package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class y9h {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ y9h[] $VALUES;
    public static final y9h BOTTOM;
    public static final y9h TOP;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, y9h] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, y9h] */
    static {
        ?? r0 = new Enum("TOP", 0);
        TOP = r0;
        ?? r1 = new Enum("BOTTOM", 1);
        BOTTOM = r1;
        y9h[] y9hVarArr = {r0, r1};
        $VALUES = y9hVarArr;
        $ENTRIES = new wg7(y9hVarArr);
    }

    public static y9h valueOf(String str) {
        return (y9h) Enum.valueOf(y9h.class, str);
    }

    public static y9h[] values() {
        return (y9h[]) $VALUES.clone();
    }
}
