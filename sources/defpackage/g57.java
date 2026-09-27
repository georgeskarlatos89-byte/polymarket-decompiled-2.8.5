package defpackage;

import android.hardware.camera2.params.DynamicRangeProfiles;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class g57 implements f57 {
    public final DynamicRangeProfiles a;

    public g57(Object obj) {
        this.a = (DynamicRangeProfiles) obj;
    }

    public static Set c(Set set) {
        if (set.isEmpty()) {
            return Collections.EMPTY_SET;
        }
        HashSet hashSet = new HashSet(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            Long l = (Long) it.next();
            long longValue = l.longValue();
            c57 c57Var = (c57) d57.a.get(l);
            if (c57Var == null) {
                o9n.f("DynamicRangesCompatApi33Impl", "Dynamic range profile cannot be converted to a DynamicRange object: " + longValue);
            }
            if (c57Var != null) {
                hashSet.add(c57Var);
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }

    @Override // defpackage.f57
    public final DynamicRangeProfiles a() {
        return this.a;
    }

    @Override // defpackage.f57
    public final Set b(c57 c57Var) {
        boolean z;
        Long a = d57.a(c57Var, this.a);
        if (a != null) {
            z = true;
        } else {
            z = false;
        }
        grn.b("DynamicRange is not supported: " + c57Var, z);
        return c(this.a.getProfileCaptureRequestConstraints(a.longValue()));
    }

    @Override // defpackage.f57
    public final Set d() {
        return c(this.a.getSupportedProfiles());
    }
}
