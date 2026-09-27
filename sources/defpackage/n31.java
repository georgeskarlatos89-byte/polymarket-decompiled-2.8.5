package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class n31 {
    private static final /* synthetic */ n31[] $VALUES;
    public static final n31 EXPONENTIAL;
    public static final n31 LINEAR;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, n31] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, n31] */
    static {
        ?? r0 = new Enum("EXPONENTIAL", 0);
        EXPONENTIAL = r0;
        ?? r1 = new Enum("LINEAR", 1);
        LINEAR = r1;
        $VALUES = new n31[]{r0, r1};
    }

    public static n31 valueOf(String str) {
        return (n31) Enum.valueOf(n31.class, str);
    }

    public static n31[] values() {
        return (n31[]) $VALUES.clone();
    }
}
