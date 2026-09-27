package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class e33 {
    public final List a;

    public e33(List list) {
        if (list != null && !list.isEmpty()) {
            this.a = Collections.unmodifiableList(new ArrayList(list));
        } else {
            dmk.v("Cannot set an empty CaptureStage list.");
            throw null;
        }
    }
}
