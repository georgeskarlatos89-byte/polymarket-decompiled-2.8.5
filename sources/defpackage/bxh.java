package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class bxh {
    private static final /* synthetic */ bxh[] $VALUES;
    public static final bxh PERCENT;
    public static final bxh PIXELS;

    /* JADX WARN: Type inference failed for: r0v0, types: [bxh, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [bxh, java.lang.Enum] */
    static {
        ?? r0 = new Enum("PERCENT", 0);
        PERCENT = r0;
        ?? r1 = new Enum("PIXELS", 1);
        PIXELS = r1;
        $VALUES = new bxh[]{r0, r1};
    }

    public static bxh valueOf(String str) {
        return (bxh) Enum.valueOf(bxh.class, str);
    }

    public static bxh[] values() {
        return (bxh[]) $VALUES.clone();
    }
}
