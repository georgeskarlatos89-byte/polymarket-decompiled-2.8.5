package defpackage;

import java.util.Objects;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class ofh {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public ofh(int i, int i2, int i3, int i4) {
        if (i >= 0) {
            if (i2 >= 0) {
                if (i3 >= 0) {
                    if (i4 >= 0) {
                        this.a = i;
                        this.b = i2;
                        this.c = i3;
                        this.d = i4;
                        return;
                    }
                    dmk.v(sv6.j(i4, "length ", " must be >= 0"));
                    throw null;
                }
                dmk.v(sv6.j(i3, "inputIndex ", " must be >= 0"));
                throw null;
            }
            dmk.v(sv6.j(i2, "columnIndex ", " must be >= 0"));
            throw null;
        }
        dmk.v(sv6.j(i, "lineIndex ", " must be >= 0"));
        throw null;
    }

    public final ofh a(int i, int i2) {
        if (i >= 0) {
            int i3 = this.d;
            if (i <= i3) {
                if (i2 >= 0) {
                    if (i2 <= i3) {
                        if (i <= i2) {
                            if (i == 0 && i2 == i3) {
                                return this;
                            }
                            return new ofh(this.a, this.b + i, this.c + i, i2 - i);
                        }
                        f27.m(woa.l(i, i2, "beginIndex ", " must be <= endIndex "));
                        return null;
                    }
                    f27.m(woa.l(i2, i3, "endIndex ", " must be <= length "));
                    return null;
                }
                f27.m(sv6.j(i2, "endIndex ", " + must be >= 0"));
                return null;
            }
            f27.m(woa.l(i, i3, "beginIndex ", " must be <= length "));
            return null;
        }
        f27.m(sv6.j(i, "beginIndex ", " + must be >= 0"));
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ofh.class == obj.getClass()) {
            ofh ofhVar = (ofh) obj;
            if (this.a == ofhVar.a && this.b == ofhVar.b && this.c == ofhVar.c && this.d == ofhVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.d));
    }

    public final String toString() {
        StringBuilder n = m51.n(this.a, "SourceSpan{line=", this.b, ", column=", ", input=");
        n.append(this.c);
        n.append(", length=");
        n.append(this.d);
        n.append("}");
        return n.toString();
    }
}
