package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class pxi {
    private static final /* synthetic */ pxi[] $VALUES;
    public static final pxi INDEX;
    public static final pxi PERCENT;

    /* JADX WARN: Type inference failed for: r0v0, types: [pxi, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [pxi, java.lang.Enum] */
    static {
        ?? r0 = new Enum("PERCENT", 0);
        PERCENT = r0;
        ?? r1 = new Enum("INDEX", 1);
        INDEX = r1;
        $VALUES = new pxi[]{r0, r1};
    }

    public static pxi valueOf(String str) {
        return (pxi) Enum.valueOf(pxi.class, str);
    }

    public static pxi[] values() {
        return (pxi[]) $VALUES.clone();
    }
}
