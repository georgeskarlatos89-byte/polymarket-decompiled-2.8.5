package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class a0a {
    private static final /* synthetic */ a0a[] $VALUES;
    public static final a0a BAD_CONFIG;
    public static final a0a OK;

    /* JADX WARN: Type inference failed for: r0v0, types: [a0a, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [a0a, java.lang.Enum] */
    static {
        ?? r0 = new Enum("OK", 0);
        OK = r0;
        ?? r1 = new Enum("BAD_CONFIG", 1);
        BAD_CONFIG = r1;
        $VALUES = new a0a[]{r0, r1};
    }

    public static a0a valueOf(String str) {
        return (a0a) Enum.valueOf(a0a.class, str);
    }

    public static a0a[] values() {
        return (a0a[]) $VALUES.clone();
    }
}
