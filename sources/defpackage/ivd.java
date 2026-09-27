package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class ivd extends ixh implements Parcelable, lpc, xch {
    public static final Parcelable.Creator<ivd> CREATOR = new ahc(19);
    public wch b;

    public ivd(long j) {
        kch h = qch.h();
        wch wchVar = new wch(h.g(), j);
        if (!(h instanceof rw8)) {
            wchVar.b = new wch(1L, j);
        }
        this.b = wchVar;
    }

    @Override // defpackage.hxh
    public final mxh O() {
        return this.b;
    }

    @Override // defpackage.hxh
    public final mxh U(mxh mxhVar, mxh mxhVar2, mxh mxhVar3) {
        if (((wch) mxhVar2).c == ((wch) mxhVar3).c) {
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
        this.b = (wch) mxhVar;
    }

    public final String toString() {
        return "MutableLongState(value=" + ((wch) qch.f(this.b)).c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(y());
    }

    public final long y() {
        return ((wch) qch.s(this.b, this)).c;
    }

    public final void z(long j) {
        kch h;
        wch wchVar = (wch) qch.f(this.b);
        if (wchVar.c != j) {
            wch wchVar2 = this.b;
            synchronized (qch.c) {
                h = qch.h();
                ((wch) qch.n(wchVar2, this, h, wchVar)).c = j;
            }
            qch.l(h, this);
        }
    }
}
