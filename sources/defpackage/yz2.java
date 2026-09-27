package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class yz2 {
    private static final /* synthetic */ yz2[] $VALUES;
    public static final yz2 AUTO;
    public static final yz2 CLOUDY_DAYLIGHT;
    public static final yz2 DAYLIGHT;
    public static final yz2 FLUORESCENT;
    public static final yz2 INCANDESCENT;
    public static final yz2 OFF;
    public static final yz2 SHADE;
    public static final yz2 TWILIGHT;
    public static final yz2 UNKNOWN;
    public static final yz2 WARM_FLUORESCENT;

    /* JADX WARN: Type inference failed for: r0v0, types: [yz2, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [yz2, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [yz2, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v2, types: [yz2, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r4v2, types: [yz2, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r5v2, types: [yz2, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r6v2, types: [yz2, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r7v2, types: [yz2, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r8v2, types: [yz2, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r9v2, types: [yz2, java.lang.Enum] */
    static {
        ?? r0 = new Enum("UNKNOWN", 0);
        UNKNOWN = r0;
        ?? r1 = new Enum("OFF", 1);
        OFF = r1;
        ?? r2 = new Enum("AUTO", 2);
        AUTO = r2;
        ?? r3 = new Enum("INCANDESCENT", 3);
        INCANDESCENT = r3;
        ?? r4 = new Enum("FLUORESCENT", 4);
        FLUORESCENT = r4;
        ?? r5 = new Enum("WARM_FLUORESCENT", 5);
        WARM_FLUORESCENT = r5;
        ?? r6 = new Enum("DAYLIGHT", 6);
        DAYLIGHT = r6;
        ?? r7 = new Enum("CLOUDY_DAYLIGHT", 7);
        CLOUDY_DAYLIGHT = r7;
        ?? r8 = new Enum("TWILIGHT", 8);
        TWILIGHT = r8;
        ?? r9 = new Enum("SHADE", 9);
        SHADE = r9;
        $VALUES = new yz2[]{r0, r1, r2, r3, r4, r5, r6, r7, r8, r9};
    }

    public static yz2 valueOf(String str) {
        return (yz2) Enum.valueOf(yz2.class, str);
    }

    public static yz2[] values() {
        return (yz2[]) $VALUES.clone();
    }
}
