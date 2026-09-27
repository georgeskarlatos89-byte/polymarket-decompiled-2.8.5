package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class zjk {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ zjk[] $VALUES;
    public static final zjk Closed;
    public static final zjk Connected;
    public static final zjk Connecting;
    public static final zjk Failed;
    public static final zjk Idle;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, zjk] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, zjk] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, zjk] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, zjk] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, zjk] */
    static {
        ?? r0 = new Enum("Idle", 0);
        Idle = r0;
        ?? r1 = new Enum("Connecting", 1);
        Connecting = r1;
        ?? r2 = new Enum("Connected", 2);
        Connected = r2;
        ?? r3 = new Enum("Failed", 3);
        Failed = r3;
        ?? r4 = new Enum("Closed", 4);
        Closed = r4;
        zjk[] zjkVarArr = {r0, r1, r2, r3, r4};
        $VALUES = zjkVarArr;
        $ENTRIES = new wg7(zjkVarArr);
    }

    public static zjk valueOf(String str) {
        return (zjk) Enum.valueOf(zjk.class, str);
    }

    public static zjk[] values() {
        return (zjk[]) $VALUES.clone();
    }
}
