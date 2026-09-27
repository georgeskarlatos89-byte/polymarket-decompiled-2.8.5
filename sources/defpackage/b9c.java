package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class b9c {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ b9c[] $VALUES;
    public static final b9c DECLARATION;
    public static final b9c DELEGATION;
    public static final b9c FAKE_OVERRIDE;
    public static final b9c SYNTHESIZED;
    private final d78 flag;

    static {
        b9c b9cVar = new b9c("DECLARATION", 0, 0);
        DECLARATION = b9cVar;
        b9c b9cVar2 = new b9c("FAKE_OVERRIDE", 1, 1);
        FAKE_OVERRIDE = b9cVar2;
        b9c b9cVar3 = new b9c("DELEGATION", 2, 2);
        DELEGATION = b9cVar3;
        b9c b9cVar4 = new b9c("SYNTHESIZED", 3, 3);
        SYNTHESIZED = b9cVar4;
        b9c[] b9cVarArr = {b9cVar, b9cVar2, b9cVar3, b9cVar4};
        $VALUES = b9cVarArr;
        $ENTRIES = new wg7(b9cVarArr);
    }

    public b9c(String str, int i, int i2) {
        h78 h78Var = j78.q;
        h78Var.getClass();
        this.flag = new d78(h78Var, i2);
    }

    public static ug7 a() {
        return $ENTRIES;
    }

    public static b9c valueOf(String str) {
        return (b9c) Enum.valueOf(b9c.class, str);
    }

    public static b9c[] values() {
        return (b9c[]) $VALUES.clone();
    }

    public final d78 b() {
        return this.flag;
    }
}
