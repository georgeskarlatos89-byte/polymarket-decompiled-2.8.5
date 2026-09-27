package defpackage;

import io.intercom.android.sdk.models.AttributeType;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class c89 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ c89[] $VALUES;

    @dxg("email")
    public static final c89 EMAIL;

    @dxg(AttributeType.PHONE)
    public static final c89 PHONE;

    @dxg("whatsapp")
    public static final c89 WHATSAPP;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, c89] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, c89] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, c89] */
    static {
        ?? r0 = new Enum("EMAIL", 0);
        EMAIL = r0;
        ?? r1 = new Enum("PHONE", 1);
        PHONE = r1;
        ?? r2 = new Enum("WHATSAPP", 2);
        WHATSAPP = r2;
        c89[] c89VarArr = {r0, r1, r2};
        $VALUES = c89VarArr;
        $ENTRIES = new wg7(c89VarArr);
    }

    public static c89 valueOf(String str) {
        return (c89) Enum.valueOf(c89.class, str);
    }

    public static c89[] values() {
        return (c89[]) $VALUES.clone();
    }
}
