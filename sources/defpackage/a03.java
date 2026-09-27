package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class a03 {
    private static final /* synthetic */ a03[] $VALUES;
    public static final a03 FIRED;
    public static final a03 NONE;
    public static final a03 READY;
    public static final a03 UNKNOWN;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, a03] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, a03] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, a03] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, a03] */
    static {
        ?? r0 = new Enum("UNKNOWN", 0);
        UNKNOWN = r0;
        ?? r1 = new Enum("NONE", 1);
        NONE = r1;
        ?? r2 = new Enum("READY", 2);
        READY = r2;
        ?? r3 = new Enum("FIRED", 3);
        FIRED = r3;
        $VALUES = new a03[]{r0, r1, r2, r3};
    }

    public static a03 valueOf(String str) {
        return (a03) Enum.valueOf(a03.class, str);
    }

    public static a03[] values() {
        return (a03[]) $VALUES.clone();
    }
}
