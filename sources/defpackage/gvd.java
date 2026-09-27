package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class gvd extends ixh implements Parcelable, voc, xch {
    public static final Parcelable.Creator<gvd> CREATOR = new ahc(17);
    public uch b;

    public gvd(float f) {
        kch h = qch.h();
        uch uchVar = new uch(f, h.g());
        if (!(h instanceof rw8)) {
            uchVar.b = new uch(f, 1L);
        }
        this.b = uchVar;
    }

    @Override // defpackage.hxh
    public final mxh O() {
        return this.b;
    }

    @Override // defpackage.hxh
    public final mxh U(mxh mxhVar, mxh mxhVar2, mxh mxhVar3) {
        if (((uch) mxhVar2).c == ((uch) mxhVar3).c) {
            return mxhVar2;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // defpackage.xch
    public final zch g() {
        return vwb.q;
    }

    @Override // defpackage.hxh
    public final void l(mxh mxhVar) {
        this.b = (uch) mxhVar;
    }

    public final String toString() {
        return "MutableFloatState(value=" + ((uch) qch.f(this.b)).c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(y());
    }

    public final float y() {
        return ((uch) qch.s(this.b, this)).c;
    }

    public final void z(float f) {
        kch h;
        uch uchVar = (uch) qch.f(this.b);
        if (uchVar.c == f) {
            return;
        }
        uch uchVar2 = this.b;
        synchronized (qch.c) {
            h = qch.h();
            ((uch) qch.n(uchVar2, this, h, uchVar)).c = f;
        }
        qch.l(h, this);
    }
}
