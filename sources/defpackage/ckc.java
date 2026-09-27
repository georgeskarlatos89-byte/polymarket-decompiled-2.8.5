package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class ckc {
    public static final ckc DEBUG;
    public static final ckc ERROR;
    public static final ckc INFO;
    public static final ckc WARN;
    public static final /* synthetic */ ckc[] a;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, ckc] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, ckc] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, ckc] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, ckc] */
    static {
        ?? r0 = new Enum("ERROR", 0);
        ERROR = r0;
        ?? r1 = new Enum("WARN", 1);
        WARN = r1;
        ?? r2 = new Enum("INFO", 2);
        INFO = r2;
        ?? r3 = new Enum("DEBUG", 3);
        DEBUG = r3;
        a = new ckc[]{r0, r1, r2, r3};
    }

    public static ckc valueOf(String str) {
        return (ckc) Enum.valueOf(ckc.class, str);
    }

    public static ckc[] values() {
        return (ckc[]) a.clone();
    }
}
