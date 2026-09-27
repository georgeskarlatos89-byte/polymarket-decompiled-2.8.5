package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class odi {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ odi[] $VALUES;
    public static final odi JPEG;
    public static final odi JPEG_R;
    public static final odi PRIV;
    public static final odi RAW;
    public static final odi YUV;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, odi] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, odi] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, odi] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, odi] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, odi] */
    static {
        ?? r0 = new Enum("PRIV", 0);
        PRIV = r0;
        ?? r1 = new Enum("YUV", 1);
        YUV = r1;
        ?? r2 = new Enum("JPEG", 2);
        JPEG = r2;
        ?? r3 = new Enum("JPEG_R", 3);
        JPEG_R = r3;
        ?? r4 = new Enum("RAW", 4);
        RAW = r4;
        odi[] odiVarArr = {r0, r1, r2, r3, r4};
        $VALUES = odiVarArr;
        $ENTRIES = new wg7(odiVarArr);
    }

    public static odi valueOf(String str) {
        return (odi) Enum.valueOf(odi.class, str);
    }

    public static odi[] values() {
        return (odi[]) $VALUES.clone();
    }
}
