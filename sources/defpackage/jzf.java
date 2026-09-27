package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class jzf {
    private static final /* synthetic */ jzf[] $VALUES;
    public static final jzf AUTOMATIC;
    public static final jzf HARDWARE;
    public static final jzf SOFTWARE;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, jzf] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, jzf] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, jzf] */
    static {
        ?? r0 = new Enum("AUTOMATIC", 0);
        AUTOMATIC = r0;
        ?? r1 = new Enum("HARDWARE", 1);
        HARDWARE = r1;
        ?? r2 = new Enum("SOFTWARE", 2);
        SOFTWARE = r2;
        $VALUES = new jzf[]{r0, r1, r2};
    }

    public static jzf valueOf(String str) {
        return (jzf) Enum.valueOf(jzf.class, str);
    }

    public static jzf[] values() {
        return (jzf[]) $VALUES.clone();
    }
}
