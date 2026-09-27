package defpackage;

import android.view.textclassifier.TextClassification;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class bri {
    public final CharSequence a;
    public final long b;
    public final TextClassification c;

    public bri(CharSequence charSequence, long j, TextClassification textClassification) {
        this.a = charSequence;
        this.b = j;
        this.c = textClassification;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bri)) {
            return false;
        }
        bri briVar = (bri) obj;
        if (Intrinsics.areEqual(this.a, briVar.a) && nxi.b(this.b, briVar.b) && Intrinsics.areEqual(this.c, briVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        int i = nxi.c;
        return this.c.hashCode() + woa.d(hashCode, 31, this.b);
    }

    public final String toString() {
        return "TextClassificationResult(text=" + ((Object) this.a) + ", selection=" + ((Object) nxi.h(this.b)) + ", textClassification=" + this.c + ')';
    }
}
