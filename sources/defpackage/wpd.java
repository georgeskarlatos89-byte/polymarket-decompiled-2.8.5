package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class wpd {
    static {
        dm0.j("PackageManagerHelper");
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001b, code lost:
    
        defpackage.dm0.g().getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0022, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(Context context, Class cls, boolean z) {
        int i;
        try {
            int componentEnabledSetting = context.getPackageManager().getComponentEnabledSetting(new ComponentName(context, cls.getName()));
            boolean z2 = false;
            if (componentEnabledSetting != 0 && componentEnabledSetting == 1) {
                z2 = true;
            }
            PackageManager packageManager = context.getPackageManager();
            ComponentName componentName = new ComponentName(context, cls.getName());
            if (z) {
                i = 1;
            } else {
                i = 2;
            }
            packageManager.setComponentEnabledSetting(componentName, i, 1);
            dm0.g().getClass();
        } catch (Exception unused) {
            dm0.g().getClass();
        }
    }
}
