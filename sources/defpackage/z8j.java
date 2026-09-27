package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class z8j {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ z8j[] $VALUES;
    public static final z8j Failure;
    public static final z8j Pending;
    public static final z8j Success;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, z8j] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, z8j] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, z8j] */
    static {
        ?? r0 = new Enum("Pending", 0);
        Pending = r0;
        ?? r1 = new Enum("Success", 1);
        Success = r1;
        ?? r2 = new Enum("Failure", 2);
        Failure = r2;
        z8j[] z8jVarArr = {r0, r1, r2};
        $VALUES = z8jVarArr;
        $ENTRIES = new wg7(z8jVarArr);
    }

    public static z8j valueOf(String str) {
        return (z8j) Enum.valueOf(z8j.class, str);
    }

    public static z8j[] values() {
        return (z8j[]) $VALUES.clone();
    }
}
