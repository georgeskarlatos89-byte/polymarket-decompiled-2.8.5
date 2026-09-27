package skip.lib;

import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¨\u0006\u0005"}, d2 = {"random", "", "using", "Lskip/lib/InOut;", "Lskip/lib/RandomNumberGenerator;", "SkipLib"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BoolKt {
    public static final boolean random(boolean z, InOut<RandomNumberGenerator> inOut) {
        RandomNumberGenerator systemRandom;
        if (inOut == null || (systemRandom = inOut.getValue()) == null) {
            systemRandom = GlobalsKt.getSystemRandom();
        }
        if (Long.remainderUnsigned(systemRandom.mo1359nextsVKNKU(), 2L) == 0) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ boolean random$default(boolean z, InOut inOut, int i, Object obj) {
        if ((i & 1) != 0) {
            inOut = null;
        }
        return random(z, inOut);
    }
}
