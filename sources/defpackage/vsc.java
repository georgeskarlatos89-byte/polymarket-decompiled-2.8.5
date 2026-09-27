package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class vsc {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ vsc[] $VALUES;
    public static final vsc END;
    public static final vsc ERROR;
    public static final vsc IDLE;
    public static final vsc INITIALIZED;
    public static final vsc PAUSED;
    public static final vsc PLAYBACK_COMPLETED;
    public static final vsc PREPARED;
    public static final vsc PREPARING;
    public static final vsc STARTED;
    public static final vsc STOPPED;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, vsc] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, vsc] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, vsc] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, vsc] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, vsc] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Enum, vsc] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Enum, vsc] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Enum, vsc] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Enum, vsc] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Enum, vsc] */
    static {
        ?? r0 = new Enum("IDLE", 0);
        IDLE = r0;
        ?? r1 = new Enum("INITIALIZED", 1);
        INITIALIZED = r1;
        ?? r2 = new Enum("PREPARING", 2);
        PREPARING = r2;
        ?? r3 = new Enum("PREPARED", 3);
        PREPARED = r3;
        ?? r4 = new Enum("STARTED", 4);
        STARTED = r4;
        ?? r5 = new Enum("PAUSED", 5);
        PAUSED = r5;
        ?? r6 = new Enum("STOPPED", 6);
        STOPPED = r6;
        ?? r7 = new Enum("PLAYBACK_COMPLETED", 7);
        PLAYBACK_COMPLETED = r7;
        ?? r8 = new Enum("END", 8);
        END = r8;
        ?? r9 = new Enum("ERROR", 9);
        ERROR = r9;
        vsc[] vscVarArr = {r0, r1, r2, r3, r4, r5, r6, r7, r8, r9};
        $VALUES = vscVarArr;
        $ENTRIES = new wg7(vscVarArr);
    }

    public static vsc valueOf(String str) {
        return (vsc) Enum.valueOf(vsc.class, str);
    }

    public static vsc[] values() {
        return (vsc[]) $VALUES.clone();
    }
}
