package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class bol extends g5 {
    public static final Parcelable.Creator<bol> CREATOR = new ofl(15);
    public final int a;
    public final String b;
    public final Intent c;

    public bol(int i, String str, Intent intent) {
        this.a = i;
        this.b = str;
        this.c = intent;
    }

    public static bol O(Activity activity) {
        return new bol(activity.hashCode(), activity.getClass().getCanonicalName(), activity.getIntent());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bol)) {
            return false;
        }
        bol bolVar = (bol) obj;
        if (this.a == bolVar.a && Objects.equals(this.b, bolVar.b) && Objects.equals(this.c, bolVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int p = hxn.p(parcel, 20293);
        hxn.o(parcel, 1, 4);
        parcel.writeInt(this.a);
        hxn.j(parcel, 2, this.b);
        hxn.i(parcel, 3, this.c, i);
        hxn.q(parcel, p);
    }
}
