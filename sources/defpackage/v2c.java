package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class v2c {
    private static final /* synthetic */ v2c[] $VALUES;
    public static final v2c CANCEL;
    public static final v2c PROPAGATE;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, v2c] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, v2c] */
    static {
        ?? r0 = new Enum("PROPAGATE", 0);
        PROPAGATE = r0;
        ?? r1 = new Enum("CANCEL", 1);
        CANCEL = r1;
        $VALUES = new v2c[]{r0, r1};
    }

    public static v2c valueOf(String str) {
        return (v2c) Enum.valueOf(v2c.class, str);
    }

    public static v2c[] values() {
        return (v2c[]) $VALUES.clone();
    }
}
