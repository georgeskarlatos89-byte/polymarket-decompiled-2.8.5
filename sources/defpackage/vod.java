package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class vod {
    private static final /* synthetic */ vod[] $VALUES;
    public static final vod CONFLICT;
    public static final vod INCOMPATIBLE;
    public static final vod OVERRIDABLE;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, vod] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, vod] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, vod] */
    static {
        ?? r0 = new Enum("OVERRIDABLE", 0);
        OVERRIDABLE = r0;
        ?? r1 = new Enum("INCOMPATIBLE", 1);
        INCOMPATIBLE = r1;
        ?? r2 = new Enum("CONFLICT", 2);
        CONFLICT = r2;
        $VALUES = new vod[]{r0, r1, r2};
    }

    public static vod valueOf(String str) {
        return (vod) Enum.valueOf(vod.class, str);
    }

    public static vod[] values() {
        return (vod[]) $VALUES.clone();
    }
}
