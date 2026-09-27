package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class dgi {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ dgi[] $VALUES;
    public static final dgi Idle;
    public static final dgi Syncing;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, dgi] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, dgi] */
    static {
        ?? r0 = new Enum("Idle", 0);
        Idle = r0;
        ?? r1 = new Enum("Syncing", 1);
        Syncing = r1;
        dgi[] dgiVarArr = {r0, r1};
        $VALUES = dgiVarArr;
        $ENTRIES = new wg7(dgiVarArr);
    }

    public static dgi valueOf(String str) {
        return (dgi) Enum.valueOf(dgi.class, str);
    }

    public static dgi[] values() {
        return (dgi[]) $VALUES.clone();
    }
}
