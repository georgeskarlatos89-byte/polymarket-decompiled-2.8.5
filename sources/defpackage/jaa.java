package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class jaa {
    private static final /* synthetic */ jaa[] $VALUES;
    public static final jaa SIGNED;
    public static final jaa UNSIGNED;
    public static final jaa VERIFIED;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, jaa] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, jaa] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, jaa] */
    static {
        ?? r0 = new Enum("UNSIGNED", 0);
        UNSIGNED = r0;
        ?? r1 = new Enum("SIGNED", 1);
        SIGNED = r1;
        ?? r2 = new Enum("VERIFIED", 2);
        VERIFIED = r2;
        $VALUES = new jaa[]{r0, r1, r2};
    }

    public static jaa valueOf(String str) {
        return (jaa) Enum.valueOf(jaa.class, str);
    }

    public static jaa[] values() {
        return (jaa[]) $VALUES.clone();
    }
}
