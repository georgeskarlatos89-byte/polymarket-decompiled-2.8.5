package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zgf extends g5 {
    public static final Parcelable.Creator<zgf> CREATOR = new mbl(13);
    public final chf a;
    public final bx1 b;

    public zgf(String str, int i) {
        arn.h(str);
        try {
            this.a = chf.e(str);
            try {
                this.b = bx1.e(i);
            } catch (ax1 e) {
                xbc.s(e);
                throw null;
            }
        } catch (bhf e2) {
            xbc.s(e2);
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zgf) {
            zgf zgfVar = (zgf) obj;
            if (this.a.equals(zgfVar.a) && this.b.equals(zgfVar.b)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        return hdi.p("PublicKeyCredentialParameters{\n type=", String.valueOf(this.a), ", \n algorithm=", String.valueOf(this.b), "\n }");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int p = hxn.p(parcel, 20293);
        hxn.j(parcel, 2, this.a.toString());
        hxn.h(parcel, 3, Integer.valueOf(this.b.a.a()));
        hxn.q(parcel, p);
    }
}
