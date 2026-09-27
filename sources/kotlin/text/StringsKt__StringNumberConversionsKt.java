package kotlin.text;

import defpackage.hdi;
import kotlin.Metadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"", "", "toIntOrNull", "(Ljava/lang/String;)Ljava/lang/Integer;", "kotlin-stdlib"}, k = 5, mv = {2, 4, 0}, xi = 49, xs = "kotlin/text/StringsKt")
/* loaded from: classes6.dex */
public class StringsKt__StringNumberConversionsKt extends d {
    public static final void i(String str) {
        str.getClass();
        throw new NumberFormatException(hdi.o("Invalid number format: '", str, '\''));
    }

    public static Integer toIntOrNull(String str) {
        str.getClass();
        return StringsKt.q0(10, str);
    }
}
