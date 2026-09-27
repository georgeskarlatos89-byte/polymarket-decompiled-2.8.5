package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class f8a {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ f8a[] $VALUES;
    public static final f8a LookaheadMeasurement;
    public static final f8a LookaheadPlacement;
    public static final f8a Measurement;
    public static final f8a Placement;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, f8a] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, f8a] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, f8a] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, f8a] */
    static {
        ?? r0 = new Enum("LookaheadMeasurement", 0);
        LookaheadMeasurement = r0;
        ?? r1 = new Enum("LookaheadPlacement", 1);
        LookaheadPlacement = r1;
        ?? r2 = new Enum("Measurement", 2);
        Measurement = r2;
        ?? r3 = new Enum("Placement", 3);
        Placement = r3;
        f8a[] f8aVarArr = {r0, r1, r2, r3};
        $VALUES = f8aVarArr;
        $ENTRIES = new wg7(f8aVarArr);
    }

    public static f8a valueOf(String str) {
        return (f8a) Enum.valueOf(f8a.class, str);
    }

    public static f8a[] values() {
        return (f8a[]) $VALUES.clone();
    }
}
