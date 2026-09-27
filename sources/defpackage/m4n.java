package defpackage;

import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class m4n {
    public static final String[] a = {"com.bignox.appcenter", "com.bluestacks.settings", "com.bluestacks.filemanager", "com.genymotion.superuser", "org.greatfruit.andy.ime", "com.kaopu001.tiantianserver", "com.tiantian.ime", "com.microvirt.installer", "com.android.ld.appstore", "com.ldmnq.launcher3", "com.jide.Appstore"};
    public static final String[] b = {"init.android_x86.rc", "ueventd.android_x86.rc", "fstab.android_x86", "x86.prop", "ueventd.ttVM_x86.rc", "init.ttVM_x86.rc", "fstab.ttVM_x86", "fstab.vbox86", "init.vbox86.rc", "ueventd.vbox86.rc", "ueventd.android_x86_64.rc", "init.android_x86_64.rc", "fstab.goldfish", "init.goldfish.rc", "init.superuser.rc"};
    public static final String[] c = {"/system/lib/libc_malloc_debug_qemu.so", "/sys/qemu_trace", "/system/bin/qemu-props"};
    public static final String[] d = {"/dev/socket/qemud", "/dev/qemu_pipe"};
    public static final String[] e = {"goldfish"};
    public static final String[] f = {"init.ranchu.rc", "init.remixos.rc", "init.andy.rc", "ueventd.andy.rc", "bin/genybaseband", "bin/genymotion-vbox-sf", "ueventd.nox.rc", "init.nox.rc", "/system/bin/noxd"};

    public static View d(View view, int i) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View findViewById = viewGroup.getChildAt(i2).findViewById(i);
            if (findViewById != null) {
                return findViewById;
            }
        }
        return null;
    }

    public Object e(int i) {
        v6a k = f().k(i);
        return k.c.getType().invoke(Integer.valueOf(i - k.a));
    }

    public abstract vt1 f();

    public Object g(int i) {
        Object invoke;
        v6a k = f().k(i);
        int i2 = i - k.a;
        Function1 key = k.c.getKey();
        if (key != null && (invoke = key.invoke(Integer.valueOf(i2))) != null) {
            return invoke;
        }
        return new q66(i);
    }
}
