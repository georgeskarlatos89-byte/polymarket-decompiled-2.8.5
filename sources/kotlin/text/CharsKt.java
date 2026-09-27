package kotlin.text;

import kotlin.Metadata;

@Metadata(d1 = {"kotlin/text/CharsKt__CharJVMKt", "kotlin/text/a"}, d2 = {}, k = 4, mv = {2, 4, 0}, xi = 49)
/* loaded from: classes6.dex */
public final class CharsKt extends a {
    public static boolean c(char c) {
        if (!Character.isWhitespace(c) && !Character.isSpaceChar(c)) {
            return false;
        }
        return true;
    }
}
