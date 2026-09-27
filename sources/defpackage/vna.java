package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class vna {
    private static final /* synthetic */ vna[] $VALUES;
    public static final vna CRUNCHY;
    public static final vna LEGACY;
    public static final vna RAW;
    public static final vna TINK;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, vna] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, vna] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, vna] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, vna] */
    static {
        ?? r0 = new Enum("TINK", 0);
        TINK = r0;
        ?? r1 = new Enum("LEGACY", 1);
        LEGACY = r1;
        ?? r2 = new Enum("RAW", 2);
        RAW = r2;
        ?? r3 = new Enum("CRUNCHY", 3);
        CRUNCHY = r3;
        $VALUES = new vna[]{r0, r1, r2, r3};
    }

    public static vna valueOf(String str) {
        return (vna) Enum.valueOf(vna.class, str);
    }

    public static vna[] values() {
        return (vna[]) $VALUES.clone();
    }
}
