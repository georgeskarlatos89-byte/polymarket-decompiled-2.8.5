package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class gj3 extends fj3 {
    public static final int b = Integer.numberOfLeadingZeros(31);
    public static final gj3 c = new fj3("CharMatcher.whitespace()");

    @Override // defpackage.dj3
    public final boolean b(char c2) {
        if ("\u2002\u3000\r\u0085\u200a\u2005\u2000\u3000\u2029\u000b\u3000\u2008\u2003\u205f\u3000\u1680\t \u2006\u2001  \f\u2009\u3000\u2004\u3000\u3000\u2028\n \u3000".charAt((48906 * c2) >>> b) == c2) {
            return true;
        }
        return false;
    }
}
