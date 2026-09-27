package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class t3f {
    private static final /* synthetic */ t3f[] $VALUES;
    public static final t3f IDLE;
    public static final t3f STREAMING;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, t3f] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, t3f] */
    static {
        ?? r0 = new Enum("IDLE", 0);
        IDLE = r0;
        ?? r1 = new Enum("STREAMING", 1);
        STREAMING = r1;
        $VALUES = new t3f[]{r0, r1};
    }

    public static t3f valueOf(String str) {
        return (t3f) Enum.valueOf(t3f.class, str);
    }

    public static t3f[] values() {
        return (t3f[]) $VALUES.clone();
    }
}
