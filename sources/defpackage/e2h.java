package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class e2h {
    private static final /* synthetic */ e2h[] $VALUES;
    public static final e2h INDIVIDUALLY;
    public static final e2h SIMULTANEOUSLY;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, e2h] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, e2h] */
    static {
        ?? r0 = new Enum("SIMULTANEOUSLY", 0);
        SIMULTANEOUSLY = r0;
        ?? r1 = new Enum("INDIVIDUALLY", 1);
        INDIVIDUALLY = r1;
        $VALUES = new e2h[]{r0, r1};
    }

    public static e2h valueOf(String str) {
        return (e2h) Enum.valueOf(e2h.class, str);
    }

    public static e2h[] values() {
        return (e2h[]) $VALUES.clone();
    }
}
