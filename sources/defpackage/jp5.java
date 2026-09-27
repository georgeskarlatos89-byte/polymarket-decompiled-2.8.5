package defpackage;

import android.net.Uri;
import com.appsflyer.internal.l;
import com.socure.docv.capturesdk.common.utils.ApiConstant;
import io.ably.lib.http.HttpConstants;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class jp5 {
    public static final /* synthetic */ int i = 0;
    public final Uri a;
    public final int b;
    public final byte[] c;
    public final Map d;
    public final long e;
    public final long f;
    public final String g;
    public final int h;

    static {
        k7c.a("media3.datasource");
    }

    public jp5(Uri uri, int i2, byte[] bArr, Map map, long j, long j2, String str, int i3) {
        boolean z;
        boolean z2;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        pfn.b(z);
        if (j >= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        pfn.b(z2);
        pfn.b(j2 > 0 || j2 == -1);
        uri.getClass();
        this.a = uri;
        this.b = i2;
        this.c = (bArr == null || bArr.length == 0) ? null : bArr;
        this.d = Collections.unmodifiableMap(new HashMap(map));
        this.e = j;
        this.f = j2;
        this.g = str;
        this.h = i3;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("DataSpec[");
        int i2 = this.b;
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    str = "HEAD";
                } else {
                    l.o();
                    return null;
                }
            } else {
                str = HttpConstants.Methods.POST;
            }
        } else {
            str = HttpConstants.Methods.GET;
        }
        sb.append(str);
        sb.append(ApiConstant.SPACE);
        sb.append(this.a);
        sb.append(", ");
        sb.append(this.e);
        sb.append(", ");
        sb.append(this.f);
        sb.append(", ");
        sb.append(this.g);
        sb.append(", ");
        return ix2.i(this.h, "]", sb);
    }
}
