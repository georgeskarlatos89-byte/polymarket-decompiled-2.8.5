package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class xp7 {
    private static final /* synthetic */ xp7[] $VALUES;
    public static final xp7 AUTO;
    public static final xp7 MANUAL;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, xp7] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, xp7] */
    static {
        ?? r0 = new Enum("AUTO", 0);
        AUTO = r0;
        ?? r1 = new Enum("MANUAL", 1);
        MANUAL = r1;
        $VALUES = new xp7[]{r0, r1};
    }

    public static xp7 valueOf(String str) {
        return (xp7) Enum.valueOf(xp7.class, str);
    }

    public static xp7[] values() {
        return (xp7[]) $VALUES.clone();
    }
}
