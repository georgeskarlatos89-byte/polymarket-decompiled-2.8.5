package skip.foundation;

import com.socure.docv.capturesdk.common.utils.ApiConstant;
import defpackage.r2i;
import kotlin.Metadata;
import kotlin.UByte;
import skip.lib.Array;
import skip.lib.ArrayKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0015\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000¢\u0006\u0002\u0010\u0004\u001a\u0015\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000¢\u0006\u0002\u0010\u0004\"\u0016\u0010\u0006\u001a\u00020\u0001X\u0080\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\b\"\u0016\u0010\n\u001a\u00020\u0001X\u0080\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u000b\u0010\b\"\u0016\u0010\f\u001a\u00020\u0001X\u0080\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\r\u0010\b\"\u0016\u0010\u000e\u001a\u00020\u0001X\u0080\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u000f\u0010\b\"\u0016\u0010\u0010\u001a\u00020\u0001X\u0080\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0011\u0010\b\"\u0016\u0010\u0012\u001a\u00020\u0001X\u0080\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0013\u0010\b\"\u0016\u0010\u0014\u001a\u00020\u0001X\u0080\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0015\u0010\b\"\u0016\u0010\u0016\u001a\u00020\u0001X\u0080\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0017\u0010\b\"\u0016\u0010\u0018\u001a\u00020\u0001X\u0080\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0019\u0010\b\"\u0016\u0010\u001a\u001a\u00020\u0001X\u0080\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u001b\u0010\b\"\u0016\u0010\u001c\u001a\u00020\u0001X\u0080\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u001d\u0010\b\"\u0016\u0010\u001e\u001a\u00020\u0001X\u0080\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u001f\u0010\b\"\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00010!X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#\"\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00010!X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010#\"\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00010!X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010#¨\u0006("}, d2 = {"UByte", "Lkotlin/UByte;", "ascii", "", "(Ljava/lang/String;)B", "UInt8", "UInt8_space", "getUInt8_space", "()B", "B", "UInt8_return", "getUInt8_return", "UInt8_newline", "getUInt8_newline", "UInt8_tab", "getUInt8_tab", "UInt8_colon", "getUInt8_colon", "UInt8_comma", "getUInt8_comma", "UInt8_openbrace", "getUInt8_openbrace", "UInt8_closebrace", "getUInt8_closebrace", "UInt8_openbracket", "getUInt8_openbracket", "UInt8_closebracket", "getUInt8_closebracket", "UInt8_quote", "getUInt8_quote", "UInt8_backslash", "getUInt8_backslash", "UInt8Array_true", "Lskip/lib/Array;", "getUInt8Array_true", "()Lskip/lib/Array;", "UInt8Array_false", "getUInt8Array_false", "UInt8Array_null", "getUInt8Array_null", "SkipFoundation"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class JSONSerialization_ParserKt {
    private static final byte UInt8_space = UByte(ApiConstant.SPACE);
    private static final byte UInt8_return = UByte("\r");
    private static final byte UInt8_newline = UByte("\n");
    private static final byte UInt8_tab = UByte("\t");
    private static final byte UInt8_colon = UByte(":");
    private static final byte UInt8_comma = UByte(",");
    private static final byte UInt8_openbrace = UByte("{");
    private static final byte UInt8_closebrace = UByte("}");
    private static final byte UInt8_openbracket = UByte("[");
    private static final byte UInt8_closebracket = UByte("]");
    private static final byte UInt8_quote = UByte("\"");
    private static final byte UInt8_backslash = UByte("\\");
    private static final Array<UByte> UInt8Array_true = ArrayKt.arrayOf(UByte.m884boximpl(UByte("t")), UByte.m884boximpl(UByte("r")), UByte.m884boximpl(UByte("u")), UByte.m884boximpl(UByte("e")));
    private static final Array<UByte> UInt8Array_false = ArrayKt.arrayOf(UByte.m884boximpl(UByte("f")), UByte.m884boximpl(UByte("a")), UByte.m884boximpl(UByte("l")), UByte.m884boximpl(UByte("s")), UByte.m884boximpl(UByte("e")));
    private static final Array<UByte> UInt8Array_null = ArrayKt.arrayOf(UByte.m884boximpl(UByte("n")), UByte.m884boximpl(UByte("u")), UByte.m884boximpl(UByte("l")), UByte.m884boximpl(UByte("l")));

    public static final byte UByte(String str) {
        str.getClass();
        return UByte.m885constructorimpl((byte) r2i.E(str));
    }

    public static final byte UInt8(String str) {
        str.getClass();
        return UByte.m885constructorimpl((byte) r2i.E(str));
    }

    public static final Array<UByte> getUInt8Array_false() {
        return UInt8Array_false;
    }

    public static final Array<UByte> getUInt8Array_null() {
        return UInt8Array_null;
    }

    public static final Array<UByte> getUInt8Array_true() {
        return UInt8Array_true;
    }

    public static final byte getUInt8_backslash() {
        return UInt8_backslash;
    }

    public static final byte getUInt8_closebrace() {
        return UInt8_closebrace;
    }

    public static final byte getUInt8_closebracket() {
        return UInt8_closebracket;
    }

    public static final byte getUInt8_colon() {
        return UInt8_colon;
    }

    public static final byte getUInt8_comma() {
        return UInt8_comma;
    }

    public static final byte getUInt8_newline() {
        return UInt8_newline;
    }

    public static final byte getUInt8_openbrace() {
        return UInt8_openbrace;
    }

    public static final byte getUInt8_openbracket() {
        return UInt8_openbracket;
    }

    public static final byte getUInt8_quote() {
        return UInt8_quote;
    }

    public static final byte getUInt8_return() {
        return UInt8_return;
    }

    public static final byte getUInt8_space() {
        return UInt8_space;
    }

    public static final byte getUInt8_tab() {
        return UInt8_tab;
    }
}
