package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class zt7 {
    private static final /* synthetic */ zt7[] $VALUES;
    public static final zt7 BOTH;
    public static final zt7 CONFLICTS_ONLY;
    public static final zt7 SUCCESS_ONLY;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, zt7] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, zt7] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, zt7] */
    static {
        ?? r0 = new Enum("CONFLICTS_ONLY", 0);
        CONFLICTS_ONLY = r0;
        ?? r1 = new Enum("SUCCESS_ONLY", 1);
        SUCCESS_ONLY = r1;
        ?? r2 = new Enum("BOTH", 2);
        BOTH = r2;
        $VALUES = new zt7[]{r0, r1, r2};
    }

    public static zt7 valueOf(String str) {
        return (zt7) Enum.valueOf(zt7.class, str);
    }

    public static zt7[] values() {
        return (zt7[]) $VALUES.clone();
    }
}
