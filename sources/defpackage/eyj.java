package defpackage;

import android.net.Uri;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class eyj implements zic {
    public static final Set b = Collections.unmodifiableSet(new HashSet(Arrays.asList("http", "https")));
    public final zic a;

    public eyj(zic zicVar) {
        this.a = zicVar;
    }

    @Override // defpackage.zic
    public final yic a(Object obj, int i, int i2, ild ildVar) {
        return this.a.a(new iw8(((Uri) obj).toString()), i, i2, ildVar);
    }

    @Override // defpackage.zic
    public final boolean b(Object obj) {
        return b.contains(((Uri) obj).getScheme());
    }
}
