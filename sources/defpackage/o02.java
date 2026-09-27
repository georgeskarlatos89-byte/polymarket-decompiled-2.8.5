package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class o02 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ o02[] $VALUES;
    public static final o02 Diminutive;
    public static final o02 Notification;

    /* JADX WARN: Type inference failed for: r0v0, types: [o02, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [o02, java.lang.Enum] */
    static {
        ?? r0 = new Enum("Notification", 0);
        Notification = r0;
        ?? r1 = new Enum("Diminutive", 1);
        Diminutive = r1;
        o02[] o02VarArr = {r0, r1};
        $VALUES = o02VarArr;
        $ENTRIES = new wg7(o02VarArr);
    }

    public static o02 valueOf(String str) {
        return (o02) Enum.valueOf(o02.class, str);
    }

    public static o02[] values() {
        return (o02[]) $VALUES.clone();
    }
}
