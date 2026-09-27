package kotlin.text;

import defpackage.ace;
import defpackage.py2;
import kotlin.Metadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0004\u001a\u0017\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"", "radix", "checkRadix", "(I)I", "kotlin-stdlib"}, k = 5, mv = {2, 4, 0}, xi = 49, xs = "kotlin/text/CharsKt")
/* loaded from: classes6.dex */
public class CharsKt__CharJVMKt {
    public static int checkRadix(int i) {
        if (2 <= i && i < 37) {
            return i;
        }
        py2.i(ace.o(i, "radix ", " was not in valid range "), new kotlin.ranges.a(2, 36, 1));
        return 0;
    }
}
