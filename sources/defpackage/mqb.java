package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class mqb {
    public final /* synthetic */ int a = 0;
    public final Object b;
    public boolean c;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [ox2, java.lang.Object] */
    public mqb(px2 px2Var, g03 g03Var, vwg vwgVar) {
        new AtomicInteger(-1);
        this.b = new Object();
        boolean a = a(g03Var);
        new olb(-1);
        ?? obj = new Object();
        if (a) {
            px2Var.l(obj);
        }
    }

    public static boolean a(g03 g03Var) {
        int[] iArr;
        if (Build.VERSION.SDK_INT > 34 && (iArr = (int[]) g03Var.a(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES)) != null) {
            for (int i : iArr) {
                if (i == 6) {
                    return true;
                }
            }
        }
        return false;
    }

    public String toString() {
        switch (this.a) {
            case 0:
                if (this.c) {
                    return "FALL_THROUGH";
                }
                return String.valueOf(this.b);
            default:
                return super.toString();
        }
    }

    public mqb(Object obj, boolean z) {
        this.b = obj;
        this.c = z;
    }
}
