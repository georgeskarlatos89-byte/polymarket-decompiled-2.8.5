package defpackage;

import com.socure.docv.capturesdk.common.utils.BlurConstants;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class rkn {
    public static final hpf a(y8h y8hVar) {
        y8hVar.getClass();
        return new hpf(y8hVar);
    }

    public static final ipf b(meh mehVar) {
        mehVar.getClass();
        return new ipf(mehVar);
    }

    public static int c(int i, int i2, boolean z) {
        int i3;
        if (z) {
            i3 = ((i2 - i) + 360) % 360;
        } else {
            i3 = (i2 + i) % 360;
        }
        if (o9n.e(2, "CameraOrientationUtil")) {
            StringBuilder n = m51.n(i, "getRelativeImageRotation: destRotationDegrees=", i2, ", sourceRotationDegrees=", ", isOppositeFacing=");
            n.append(z);
            n.append(", result=");
            n.append(i3);
            o9n.e(3, "CameraOrientationUtil");
        }
        return i3;
    }

    public static int d(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        return 270;
                    }
                    dmk.v(ace.f(i, "Unsupported surface rotation: "));
                    return 0;
                }
                return BlurConstants.H_BD;
            }
            return 90;
        }
        return 0;
    }
}
