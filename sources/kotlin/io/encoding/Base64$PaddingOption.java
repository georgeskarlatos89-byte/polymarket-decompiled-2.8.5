package kotlin.io.encoding;

import defpackage.ug7;
import defpackage.wg7;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"kotlin/io/encoding/Base64$PaddingOption", "", "Lkotlin/io/encoding/Base64$PaddingOption;", "PRESENT", "ABSENT", "PRESENT_OPTIONAL", "ABSENT_OPTIONAL", "kotlin-stdlib"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class Base64$PaddingOption {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ Base64$PaddingOption[] $VALUES;
    public static final Base64$PaddingOption ABSENT;
    public static final Base64$PaddingOption ABSENT_OPTIONAL;
    public static final Base64$PaddingOption PRESENT;
    public static final Base64$PaddingOption PRESENT_OPTIONAL;

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.io.encoding.Base64$PaddingOption, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.io.encoding.Base64$PaddingOption, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [kotlin.io.encoding.Base64$PaddingOption, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v2, types: [kotlin.io.encoding.Base64$PaddingOption, java.lang.Enum] */
    static {
        ?? r0 = new Enum("PRESENT", 0);
        PRESENT = r0;
        ?? r1 = new Enum("ABSENT", 1);
        ABSENT = r1;
        ?? r2 = new Enum("PRESENT_OPTIONAL", 2);
        PRESENT_OPTIONAL = r2;
        ?? r3 = new Enum("ABSENT_OPTIONAL", 3);
        ABSENT_OPTIONAL = r3;
        Base64$PaddingOption[] base64$PaddingOptionArr = {r0, r1, r2, r3};
        $VALUES = base64$PaddingOptionArr;
        $ENTRIES = new wg7(base64$PaddingOptionArr);
    }

    public static Base64$PaddingOption valueOf(String str) {
        return (Base64$PaddingOption) Enum.valueOf(Base64$PaddingOption.class, str);
    }

    public static Base64$PaddingOption[] values() {
        return (Base64$PaddingOption[]) $VALUES.clone();
    }
}
