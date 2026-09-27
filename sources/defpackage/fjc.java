package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class fjc {
    private static final /* synthetic */ fjc[] $VALUES;
    public static final fjc FINISHED;
    public static final fjc PENDING;
    public static final fjc RUNNING;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, fjc] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, fjc] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, fjc] */
    static {
        ?? r0 = new Enum("PENDING", 0);
        PENDING = r0;
        ?? r1 = new Enum("RUNNING", 1);
        RUNNING = r1;
        ?? r2 = new Enum("FINISHED", 2);
        FINISHED = r2;
        $VALUES = new fjc[]{r0, r1, r2};
    }

    public static fjc valueOf(String str) {
        return (fjc) Enum.valueOf(fjc.class, str);
    }

    public static fjc[] values() {
        return (fjc[]) $VALUES.clone();
    }
}
