package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class vlc {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ vlc[] $VALUES;
    public static final vlc DefaultEffects;
    public static final vlc DefaultSpatial;
    public static final vlc FastEffects;
    public static final vlc FastSpatial;
    public static final vlc SlowEffects;
    public static final vlc SlowSpatial;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, vlc] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, vlc] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, vlc] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, vlc] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, vlc] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Enum, vlc] */
    static {
        ?? r0 = new Enum("DefaultSpatial", 0);
        DefaultSpatial = r0;
        ?? r1 = new Enum("FastSpatial", 1);
        FastSpatial = r1;
        ?? r2 = new Enum("SlowSpatial", 2);
        SlowSpatial = r2;
        ?? r3 = new Enum("DefaultEffects", 3);
        DefaultEffects = r3;
        ?? r4 = new Enum("FastEffects", 4);
        FastEffects = r4;
        ?? r5 = new Enum("SlowEffects", 5);
        SlowEffects = r5;
        vlc[] vlcVarArr = {r0, r1, r2, r3, r4, r5};
        $VALUES = vlcVarArr;
        $ENTRIES = new wg7(vlcVarArr);
    }

    public static vlc valueOf(String str) {
        return (vlc) Enum.valueOf(vlc.class, str);
    }

    public static vlc[] values() {
        return (vlc[]) $VALUES.clone();
    }
}
