package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class mgd {
    private static final /* synthetic */ mgd[] $VALUES;
    public static final mgd BITMAP;
    public static final mgd DIRECT;
    public static final mgd RENDER_NODE;
    public static final mgd SAVE_LAYER;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, mgd] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, mgd] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, mgd] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, mgd] */
    static {
        ?? r0 = new Enum("DIRECT", 0);
        DIRECT = r0;
        ?? r1 = new Enum("SAVE_LAYER", 1);
        SAVE_LAYER = r1;
        ?? r2 = new Enum("BITMAP", 2);
        BITMAP = r2;
        ?? r3 = new Enum("RENDER_NODE", 3);
        RENDER_NODE = r3;
        $VALUES = new mgd[]{r0, r1, r2, r3};
    }

    public static mgd valueOf(String str) {
        return (mgd) Enum.valueOf(mgd.class, str);
    }

    public static mgd[] values() {
        return (mgd[]) $VALUES.clone();
    }
}
