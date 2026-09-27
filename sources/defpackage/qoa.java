package defpackage;

import io.intercom.android.sdk.models.AttributeType;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlinx.serialization.KSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@exg
/* loaded from: classes5.dex */
public final class qoa {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ qoa[] $VALUES;
    private static final Lazy<KSerializer> $cachedSerializer$delegate;

    @dxg("ascii")
    public static final qoa Ascii;
    public static final poa Companion;

    @dxg("email")
    public static final qoa Email;

    @dxg(AttributeType.NUMBER)
    public static final qoa Number;

    @dxg("number_password")
    public static final qoa NumberPassword;

    @dxg("password")
    public static final qoa Password;

    @dxg(AttributeType.PHONE)
    public static final qoa Phone;

    @dxg("text")
    public static final qoa Text;

    @dxg("uri")
    public static final qoa Uri;

    /* JADX WARN: Type inference failed for: r0v0, types: [qoa, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r0v2, types: [poa, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [qoa, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [qoa, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v2, types: [qoa, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r4v2, types: [qoa, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r5v2, types: [qoa, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r6v2, types: [qoa, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r7v1, types: [qoa, java.lang.Enum] */
    static {
        ?? r0 = new Enum("Text", 0);
        Text = r0;
        ?? r1 = new Enum("Ascii", 1);
        Ascii = r1;
        ?? r2 = new Enum("Number", 2);
        Number = r2;
        ?? r3 = new Enum("Phone", 3);
        Phone = r3;
        ?? r4 = new Enum("Uri", 4);
        Uri = r4;
        ?? r5 = new Enum("Email", 5);
        Email = r5;
        ?? r6 = new Enum("Password", 6);
        Password = r6;
        ?? r7 = new Enum("NumberPassword", 7);
        NumberPassword = r7;
        qoa[] qoaVarArr = {r0, r1, r2, r3, r4, r5, r6, r7};
        $VALUES = qoaVarArr;
        $ENTRIES = new wg7(qoaVarArr);
        Companion = new Object();
        $cachedSerializer$delegate = LazyKt.a(w4b.PUBLICATION, new mma(5));
    }

    public static final /* synthetic */ Lazy a() {
        return $cachedSerializer$delegate;
    }

    public static qoa valueOf(String str) {
        return (qoa) Enum.valueOf(qoa.class, str);
    }

    public static qoa[] values() {
        return (qoa[]) $VALUES.clone();
    }
}
