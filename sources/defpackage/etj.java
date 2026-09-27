package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class etj {
    private static final /* synthetic */ etj[] $VALUES;
    public static final etj CANCEL;
    public static final etj CONTINUE;
    public static final etj NEXT;
    public static final etj RESEND;
    public static final etj SELECT;
    public static final etj SUBMIT;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, etj] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, etj] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, etj] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, etj] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, etj] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Enum, etj] */
    static {
        ?? r0 = new Enum("SUBMIT", 0);
        SUBMIT = r0;
        ?? r1 = new Enum("CONTINUE", 1);
        CONTINUE = r1;
        ?? r2 = new Enum("NEXT", 2);
        NEXT = r2;
        ?? r3 = new Enum("CANCEL", 3);
        CANCEL = r3;
        ?? r4 = new Enum("RESEND", 4);
        RESEND = r4;
        ?? r5 = new Enum("SELECT", 5);
        SELECT = r5;
        $VALUES = new etj[]{r0, r1, r2, r3, r4, r5};
    }

    public static etj valueOf(String str) {
        return (etj) Enum.valueOf(etj.class, str);
    }

    public static etj[] values() {
        return (etj[]) $VALUES.clone();
    }
}
