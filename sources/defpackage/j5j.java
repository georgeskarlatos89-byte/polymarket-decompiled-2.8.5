package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class j5j {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ j5j[] $VALUES;
    public static final j5j Attached;
    public static final j5j Detached;
    public static final j5j Uninitialized;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, j5j] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, j5j] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, j5j] */
    static {
        ?? r0 = new Enum("Uninitialized", 0);
        Uninitialized = r0;
        ?? r1 = new Enum("Detached", 1);
        Detached = r1;
        ?? r2 = new Enum("Attached", 2);
        Attached = r2;
        j5j[] j5jVarArr = {r0, r1, r2};
        $VALUES = j5jVarArr;
        $ENTRIES = new wg7(j5jVarArr);
    }

    public static j5j valueOf(String str) {
        return (j5j) Enum.valueOf(j5j.class, str);
    }

    public static j5j[] values() {
        return (j5j[]) $VALUES.clone();
    }
}
