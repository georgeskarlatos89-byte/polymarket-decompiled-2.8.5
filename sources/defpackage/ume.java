package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class ume {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ ume[] $VALUES;
    public static final ume OPAQUE;
    public static final ume TRANSLUCENT;
    public static final ume UNCHANGED;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, ume] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, ume] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, ume] */
    static {
        ?? r0 = new Enum("UNCHANGED", 0);
        UNCHANGED = r0;
        ?? r1 = new Enum("TRANSLUCENT", 1);
        TRANSLUCENT = r1;
        ?? r2 = new Enum("OPAQUE", 2);
        OPAQUE = r2;
        ume[] umeVarArr = {r0, r1, r2};
        $VALUES = umeVarArr;
        $ENTRIES = new wg7(umeVarArr);
    }

    public static ume valueOf(String str) {
        return (ume) Enum.valueOf(ume.class, str);
    }

    public static ume[] values() {
        return (ume[]) $VALUES.clone();
    }
}
