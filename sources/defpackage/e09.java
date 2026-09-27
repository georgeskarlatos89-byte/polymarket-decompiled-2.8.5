package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class e09 {
    private static final /* synthetic */ e09[] $VALUES;
    public static final e09 LINEAR;
    public static final e09 RADIAL;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, e09] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, e09] */
    static {
        ?? r0 = new Enum("LINEAR", 0);
        LINEAR = r0;
        ?? r1 = new Enum("RADIAL", 1);
        RADIAL = r1;
        $VALUES = new e09[]{r0, r1};
    }

    public static e09 valueOf(String str) {
        return (e09) Enum.valueOf(e09.class, str);
    }

    public static e09[] values() {
        return (e09[]) $VALUES.clone();
    }
}
