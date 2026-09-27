package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class fd2 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ fd2[] $VALUES;
    public static final fd2 Circle;
    public static final fd2 RoundedRect;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, fd2] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, fd2] */
    static {
        ?? r0 = new Enum("RoundedRect", 0);
        RoundedRect = r0;
        ?? r1 = new Enum("Circle", 1);
        Circle = r1;
        fd2[] fd2VarArr = {r0, r1};
        $VALUES = fd2VarArr;
        $ENTRIES = new wg7(fd2VarArr);
    }

    public static fd2 valueOf(String str) {
        return (fd2) Enum.valueOf(fd2.class, str);
    }

    public static fd2[] values() {
        return (fd2[]) $VALUES.clone();
    }
}
