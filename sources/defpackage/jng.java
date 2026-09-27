package defpackage;

import android.os.Environment;
import java.io.File;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class jng extends mng {
    public static final List b = CollectionsKt.listOf("/sbin/", "/system/bin/", "/system/xbin/", "/data/local/xbin/", "/data/local/bin/", "/system/sd/xbin/", "/system/bin/failsafe/", "/data/local/");
    public static final pgk c = new pgk("SW01", "The device is jailbroken.", ogk.HIGH);

    @Override // defpackage.mng
    public final boolean a() {
        List list = b;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (new File(sv6.m((String) it.next(), "su")).exists()) {
                    return true;
                }
            }
        }
        if (new File(sv6.m(Environment.getRootDirectory().toString(), "/Superuser")).isDirectory()) {
            return true;
        }
        return false;
    }
}
