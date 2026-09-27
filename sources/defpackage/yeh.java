package defpackage;

import java.util.Objects;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class yeh {
    public final CharSequence a;
    public final ofh b;

    public yeh(CharSequence charSequence, ofh ofhVar) {
        Objects.requireNonNull(charSequence, "content must not be null");
        this.a = charSequence;
        this.b = ofhVar;
    }

    public final yeh a(int i, int i2) {
        ofh ofhVar;
        int i3;
        CharSequence subSequence = this.a.subSequence(i, i2);
        ofh ofhVar2 = this.b;
        if (ofhVar2 != null && (i3 = i2 - i) != 0) {
            ofhVar = new ofh(ofhVar2.a, ofhVar2.b + i, ofhVar2.c + i, i3);
        } else {
            ofhVar = null;
        }
        return new yeh(subSequence, ofhVar);
    }
}
