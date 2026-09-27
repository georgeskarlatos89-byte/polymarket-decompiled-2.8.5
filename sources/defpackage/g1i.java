package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class g1i {
    private static final /* synthetic */ g1i[] $VALUES;
    public static final g1i LEGACY_STRICT;
    public static final g1i LENIENT;
    public static final g1i STRICT;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, g1i] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, g1i] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, g1i] */
    static {
        ?? r0 = new Enum("LENIENT", 0);
        LENIENT = r0;
        ?? r1 = new Enum("LEGACY_STRICT", 1);
        LEGACY_STRICT = r1;
        ?? r2 = new Enum("STRICT", 2);
        STRICT = r2;
        $VALUES = new g1i[]{r0, r1, r2};
    }

    public static g1i valueOf(String str) {
        return (g1i) Enum.valueOf(g1i.class, str);
    }

    public static g1i[] values() {
        return (g1i[]) $VALUES.clone();
    }
}
