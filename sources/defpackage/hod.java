package defpackage;

import android.hardware.camera2.params.OutputConfiguration;
import android.os.Build;
import android.view.Surface;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class hod {
    public final jod a;

    public hod(int i, Surface surface) {
        if (Build.VERSION.SDK_INT >= 33) {
            this.a = new jod(new OutputConfiguration(i, surface));
        } else {
            this.a = new jod(new iod(new OutputConfiguration(i, surface)));
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof hod)) {
            return false;
        }
        return this.a.equals(((hod) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public hod(jod jodVar) {
        this.a = jodVar;
    }
}
