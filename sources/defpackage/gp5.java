package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public interface gp5 extends vo5 {
    long a(jp5 jp5Var);

    default Map c() {
        return Collections.EMPTY_MAP;
    }

    void close();

    void e(qz5 qz5Var);

    Uri getUri();
}
