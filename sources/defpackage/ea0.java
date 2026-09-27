package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class ea0 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ ea0[] $VALUES;
    public static final ea0 BoundReached;
    public static final ea0 Finished;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, ea0] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, ea0] */
    static {
        ?? r0 = new Enum("BoundReached", 0);
        BoundReached = r0;
        ?? r1 = new Enum("Finished", 1);
        Finished = r1;
        ea0[] ea0VarArr = {r0, r1};
        $VALUES = ea0VarArr;
        $ENTRIES = new wg7(ea0VarArr);
    }

    public static ea0 valueOf(String str) {
        return (ea0) Enum.valueOf(ea0.class, str);
    }

    public static ea0[] values() {
        return (ea0[]) $VALUES.clone();
    }
}
