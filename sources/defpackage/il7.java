package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class il7 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ il7[] $VALUES;
    public static final il7 EVENT;
    public static final il7 IDENTIFY;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, il7] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, il7] */
    static {
        ?? r0 = new Enum("EVENT", 0);
        EVENT = r0;
        ?? r1 = new Enum("IDENTIFY", 1);
        IDENTIFY = r1;
        il7[] il7VarArr = {r0, r1};
        $VALUES = il7VarArr;
        $ENTRIES = new wg7(il7VarArr);
    }

    public static il7 valueOf(String str) {
        return (il7) Enum.valueOf(il7.class, str);
    }

    public static il7[] values() {
        return (il7[]) $VALUES.clone();
    }
}
