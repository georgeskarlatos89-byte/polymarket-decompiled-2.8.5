package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class pv2 {
    private static final /* synthetic */ pv2[] $VALUES;
    public static final pv2 DECLARATION;
    public static final pv2 DELEGATION;
    public static final pv2 FAKE_OVERRIDE;
    public static final pv2 SYNTHESIZED;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, pv2] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, pv2] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, pv2] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, pv2] */
    static {
        ?? r0 = new Enum("DECLARATION", 0);
        DECLARATION = r0;
        ?? r1 = new Enum("FAKE_OVERRIDE", 1);
        FAKE_OVERRIDE = r1;
        ?? r2 = new Enum("DELEGATION", 2);
        DELEGATION = r2;
        ?? r3 = new Enum("SYNTHESIZED", 3);
        SYNTHESIZED = r3;
        $VALUES = new pv2[]{r0, r1, r2, r3};
    }

    public static pv2 valueOf(String str) {
        return (pv2) Enum.valueOf(pv2.class, str);
    }

    public static pv2[] values() {
        return (pv2[]) $VALUES.clone();
    }
}
