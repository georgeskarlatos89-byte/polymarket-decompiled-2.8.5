package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class n3i {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ n3i[] $VALUES;
    public static final n3i WeChatPayV1;
    private final String code = "wechat_pay_beta=v1";

    static {
        n3i n3iVar = new n3i();
        WeChatPayV1 = n3iVar;
        n3i[] n3iVarArr = {n3iVar};
        $VALUES = n3iVarArr;
        $ENTRIES = new wg7(n3iVarArr);
    }

    public static n3i valueOf(String str) {
        return (n3i) Enum.valueOf(n3i.class, str);
    }

    public static n3i[] values() {
        return (n3i[]) $VALUES.clone();
    }

    public final String a() {
        return this.code;
    }
}
