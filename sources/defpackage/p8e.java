package defpackage;

import android.os.Parcelable;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public interface p8e extends Parcelable {
    default l5e n(mbe mbeVar, boolean z) {
        mbeVar.getClass();
        if (z) {
            if (this instanceof o8e) {
                return l5e.UNSPECIFIED;
            }
            if (this instanceof m8e) {
                l5e l5eVar = ((m8e) this).a;
                if (l5eVar == null) {
                    return l5e.LIMITED;
                }
                return l5eVar;
            }
            if (this instanceof n8e) {
                if (mbeVar == mbe.RequestReuse) {
                    return l5e.ALWAYS;
                }
                return l5e.LIMITED;
            }
            dmk.a();
            return null;
        }
        if (this instanceof o8e) {
            return l5e.UNSPECIFIED;
        }
        if (this instanceof m8e) {
            return l5e.UNSPECIFIED;
        }
        if (this instanceof n8e) {
            if (mbeVar == mbe.RequestReuse) {
                return l5e.ALWAYS;
            }
            return l5e.UNSPECIFIED;
        }
        dmk.a();
        return null;
    }
}
