package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class no0 {
    private static final /* synthetic */ no0[] $VALUES;
    public static final no0 AUTOMATIC;
    public static final no0 DISABLED;
    public static final no0 ENABLED;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, no0] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, no0] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, no0] */
    static {
        ?? r0 = new Enum("AUTOMATIC", 0);
        AUTOMATIC = r0;
        ?? r1 = new Enum("ENABLED", 1);
        ENABLED = r1;
        ?? r2 = new Enum("DISABLED", 2);
        DISABLED = r2;
        $VALUES = new no0[]{r0, r1, r2};
    }

    public static no0 valueOf(String str) {
        return (no0) Enum.valueOf(no0.class, str);
    }

    public static no0[] values() {
        return (no0[]) $VALUES.clone();
    }
}
