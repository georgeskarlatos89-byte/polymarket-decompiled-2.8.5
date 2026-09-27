package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class hx5 {
    private static final /* synthetic */ hx5[] $VALUES;
    public static final hx5 DECODE_DATA;
    public static final hx5 INITIALIZE;
    public static final hx5 SWITCH_TO_SOURCE_SERVICE;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, hx5] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, hx5] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, hx5] */
    static {
        ?? r0 = new Enum("INITIALIZE", 0);
        INITIALIZE = r0;
        ?? r1 = new Enum("SWITCH_TO_SOURCE_SERVICE", 1);
        SWITCH_TO_SOURCE_SERVICE = r1;
        ?? r2 = new Enum("DECODE_DATA", 2);
        DECODE_DATA = r2;
        $VALUES = new hx5[]{r0, r1, r2};
    }

    public static hx5 valueOf(String str) {
        return (hx5) Enum.valueOf(hx5.class, str);
    }

    public static hx5[] values() {
        return (hx5[]) $VALUES.clone();
    }
}
