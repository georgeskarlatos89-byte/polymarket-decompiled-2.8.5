package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class byg {
    private static final /* synthetic */ byg[] $VALUES;
    public static final byg EU;
    public static final byg US;

    /* JADX WARN: Type inference failed for: r0v0, types: [byg, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [byg, java.lang.Enum] */
    static {
        ?? r0 = new Enum("US", 0);
        US = r0;
        ?? r1 = new Enum("EU", 1);
        EU = r1;
        $VALUES = new byg[]{r0, r1};
    }

    public static byg valueOf(String str) {
        return (byg) Enum.valueOf(byg.class, str);
    }

    public static byg[] values() {
        return (byg[]) $VALUES.clone();
    }
}
