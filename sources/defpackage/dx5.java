package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class dx5 {
    private static final /* synthetic */ dx5[] $VALUES;
    public static final dx5 DEFAULT;
    public static final dx5 PREFER_ARGB_8888;
    public static final dx5 PREFER_RGB_565;

    /* JADX WARN: Type inference failed for: r0v0, types: [dx5, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [dx5, java.lang.Enum] */
    static {
        ?? r0 = new Enum("PREFER_ARGB_8888", 0);
        PREFER_ARGB_8888 = r0;
        ?? r1 = new Enum("PREFER_RGB_565", 1);
        PREFER_RGB_565 = r1;
        $VALUES = new dx5[]{r0, r1};
        DEFAULT = r0;
    }

    public static dx5 valueOf(String str) {
        return (dx5) Enum.valueOf(dx5.class, str);
    }

    public static dx5[] values() {
        return (dx5[]) $VALUES.clone();
    }
}
