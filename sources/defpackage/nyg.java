package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class nyg {
    private static final /* synthetic */ nyg[] $VALUES;
    public static final nyg SESSION_ERROR_SURFACE_NEEDS_RESET;
    public static final nyg SESSION_ERROR_UNKNOWN;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, nyg] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, nyg] */
    static {
        ?? r0 = new Enum("SESSION_ERROR_SURFACE_NEEDS_RESET", 0);
        SESSION_ERROR_SURFACE_NEEDS_RESET = r0;
        ?? r1 = new Enum("SESSION_ERROR_UNKNOWN", 1);
        SESSION_ERROR_UNKNOWN = r1;
        $VALUES = new nyg[]{r0, r1};
    }

    public static nyg valueOf(String str) {
        return (nyg) Enum.valueOf(nyg.class, str);
    }

    public static nyg[] values() {
        return (nyg[]) $VALUES.clone();
    }
}
