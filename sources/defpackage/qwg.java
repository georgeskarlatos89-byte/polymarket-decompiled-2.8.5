package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class qwg {
    private static final /* synthetic */ qwg[] $VALUES;
    public static final qwg IDLE;
    public static final qwg QUEUED;
    public static final qwg QUEUING;
    public static final qwg RUNNING;

    /* JADX WARN: Type inference failed for: r0v0, types: [qwg, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [qwg, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [qwg, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v2, types: [qwg, java.lang.Enum] */
    static {
        ?? r0 = new Enum("IDLE", 0);
        IDLE = r0;
        ?? r1 = new Enum("QUEUING", 1);
        QUEUING = r1;
        ?? r2 = new Enum("QUEUED", 2);
        QUEUED = r2;
        ?? r3 = new Enum("RUNNING", 3);
        RUNNING = r3;
        $VALUES = new qwg[]{r0, r1, r2, r3};
    }

    public static qwg valueOf(String str) {
        return (qwg) Enum.valueOf(qwg.class, str);
    }

    public static qwg[] values() {
        return (qwg[]) $VALUES.clone();
    }
}
