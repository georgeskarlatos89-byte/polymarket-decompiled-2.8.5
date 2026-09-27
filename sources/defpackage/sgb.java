package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class sgb {
    private static final /* synthetic */ sgb[] $VALUES;
    public static final sgb REPLACE;
    public static final sgb WRAP;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, sgb] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, sgb] */
    static {
        ?? r0 = new Enum("WRAP", 0);
        WRAP = r0;
        ?? r1 = new Enum("REPLACE", 1);
        REPLACE = r1;
        $VALUES = new sgb[]{r0, r1};
    }

    public static sgb valueOf(String str) {
        return (sgb) Enum.valueOf(sgb.class, str);
    }

    public static sgb[] values() {
        return (sgb[]) $VALUES.clone();
    }
}
