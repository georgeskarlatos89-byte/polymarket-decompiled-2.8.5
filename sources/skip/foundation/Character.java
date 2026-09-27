package skip.foundation;

import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\f\n\u0002\b\r\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0000¢\u0006\u0002\b\bJ\u001d\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0002\b\rJ\u0015\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0000¢\u0006\u0002\b\u000fJ\u0015\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u0007H\u0000¢\u0006\u0002\b\u0011J\u0015\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u0007H\u0000¢\u0006\u0002\b\u0013R\u000e\u0010\u0014\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lskip/foundation/Character;", "", "<init>", "()V", "isSupplementaryCodePoint", "", "codePoint", "", "isSupplementaryCodePoint$SkipFoundation", "toCodePoint", "highSurrogate", "", "lowSurrogate", "toCodePoint$SkipFoundation", "isBmpCodePoint", "isBmpCodePoint$SkipFoundation", "highSurrogateOf", "highSurrogateOf$SkipFoundation", "lowSurrogateOf", "lowSurrogateOf$SkipFoundation", "MAX_CODE_POINT", "MIN_SUPPLEMENTARY_CODE_POINT", "SURROGATE_DECODE_OFFSET", "HIGH_SURROGATE_ENCODE_OFFSET", "SkipFoundation"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Character {
    private static final char HIGH_SURROGATE_ENCODE_OFFSET = 55232;
    public static final Character INSTANCE = new Character();
    private static final int MAX_CODE_POINT = 1114111;
    private static final int MIN_SUPPLEMENTARY_CODE_POINT = 65536;
    private static final int SURROGATE_DECODE_OFFSET = -56613888;

    private Character() {
    }

    public final char highSurrogateOf$SkipFoundation(int codePoint) {
        return (char) ((codePoint >>> 10) + 55232);
    }

    public final boolean isBmpCodePoint$SkipFoundation(int codePoint) {
        if ((codePoint >>> 16) == 0) {
            return true;
        }
        return false;
    }

    public final boolean isSupplementaryCodePoint$SkipFoundation(int codePoint) {
        if (MIN_SUPPLEMENTARY_CODE_POINT > codePoint || codePoint >= 1114112) {
            return false;
        }
        return true;
    }

    public final char lowSurrogateOf$SkipFoundation(int codePoint) {
        return (char) ((codePoint & 1023) + 56320);
    }

    public final int toCodePoint$SkipFoundation(char highSurrogate, char lowSurrogate) {
        return (highSurrogate << '\n') + lowSurrogate + SURROGATE_DECODE_OFFSET;
    }
}
