package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class a3 {
    private static final /* synthetic */ a3[] $VALUES;
    public static final a3 DONE;
    public static final a3 FAILED;
    public static final a3 NOT_READY;
    public static final a3 READY;

    /* JADX WARN: Type inference failed for: r0v0, types: [a3, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [a3, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [a3, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v2, types: [a3, java.lang.Enum] */
    static {
        ?? r0 = new Enum("READY", 0);
        READY = r0;
        ?? r1 = new Enum("NOT_READY", 1);
        NOT_READY = r1;
        ?? r2 = new Enum("DONE", 2);
        DONE = r2;
        ?? r3 = new Enum("FAILED", 3);
        FAILED = r3;
        $VALUES = new a3[]{r0, r1, r2, r3};
    }

    public static a3 valueOf(String str) {
        return (a3) Enum.valueOf(a3.class, str);
    }

    public static a3[] values() {
        return (a3[]) $VALUES.clone();
    }
}
