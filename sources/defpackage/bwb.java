package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class bwb {
    private static final /* synthetic */ bwb[] $VALUES;
    public static final bwb NONE;
    public static final bwb PLAY;
    public static final bwb RESUME;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, bwb] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, bwb] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, bwb] */
    static {
        ?? r0 = new Enum("NONE", 0);
        NONE = r0;
        ?? r1 = new Enum("PLAY", 1);
        PLAY = r1;
        ?? r2 = new Enum("RESUME", 2);
        RESUME = r2;
        $VALUES = new bwb[]{r0, r1, r2};
    }

    public static bwb valueOf(String str) {
        return (bwb) Enum.valueOf(bwb.class, str);
    }

    public static bwb[] values() {
        return (bwb[]) $VALUES.clone();
    }
}
