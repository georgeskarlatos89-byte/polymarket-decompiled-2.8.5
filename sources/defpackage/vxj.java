package defpackage;

import android.net.Uri;
import io.getstream.chat.android.models.AttachmentType;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class vxj implements zic {
    public static final Set b = Collections.unmodifiableSet(new HashSet(Arrays.asList(AttachmentType.FILE, "content", "android.resource")));
    public final uxj a;

    public vxj(uxj uxjVar) {
        this.a = uxjVar;
    }

    @Override // defpackage.zic
    public final yic a(Object obj, int i, int i2, ild ildVar) {
        Uri uri = (Uri) obj;
        return new yic(new jfd(uri), this.a.a(uri));
    }

    @Override // defpackage.zic
    public final boolean b(Object obj) {
        return b.contains(((Uri) obj).getScheme());
    }
}
