package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class iok {
    private static final /* synthetic */ iok[] $VALUES;
    public static final iok BLOCKED;
    public static final iok CANCELLED;
    public static final iok ENQUEUED;
    public static final iok FAILED;
    public static final iok RUNNING;
    public static final iok SUCCEEDED;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, iok] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, iok] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, iok] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, iok] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, iok] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Enum, iok] */
    static {
        ?? r0 = new Enum("ENQUEUED", 0);
        ENQUEUED = r0;
        ?? r1 = new Enum("RUNNING", 1);
        RUNNING = r1;
        ?? r2 = new Enum("SUCCEEDED", 2);
        SUCCEEDED = r2;
        ?? r3 = new Enum("FAILED", 3);
        FAILED = r3;
        ?? r4 = new Enum("BLOCKED", 4);
        BLOCKED = r4;
        ?? r5 = new Enum("CANCELLED", 5);
        CANCELLED = r5;
        $VALUES = new iok[]{r0, r1, r2, r3, r4, r5};
    }

    public static iok valueOf(String str) {
        return (iok) Enum.valueOf(iok.class, str);
    }

    public static iok[] values() {
        return (iok[]) $VALUES.clone();
    }

    public final boolean a() {
        if (this != SUCCEEDED && this != FAILED && this != CANCELLED) {
            return false;
        }
        return true;
    }
}
