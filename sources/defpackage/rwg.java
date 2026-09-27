package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class rwg {
    private static final /* synthetic */ rwg[] $VALUES;
    public static final rwg IDLE;
    public static final rwg QUEUED;
    public static final rwg QUEUING;
    public static final rwg RUNNING;

    /* JADX WARN: Type inference failed for: r0v0, types: [rwg, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [rwg, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [rwg, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v2, types: [rwg, java.lang.Enum] */
    static {
        ?? r0 = new Enum("IDLE", 0);
        IDLE = r0;
        ?? r1 = new Enum("QUEUING", 1);
        QUEUING = r1;
        ?? r2 = new Enum("QUEUED", 2);
        QUEUED = r2;
        ?? r3 = new Enum("RUNNING", 3);
        RUNNING = r3;
        $VALUES = new rwg[]{r0, r1, r2, r3};
    }

    public static rwg valueOf(String str) {
        return (rwg) Enum.valueOf(rwg.class, str);
    }

    public static rwg[] values() {
        return (rwg[]) $VALUES.clone();
    }
}
