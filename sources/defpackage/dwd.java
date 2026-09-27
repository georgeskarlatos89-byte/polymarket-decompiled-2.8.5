package defpackage;

import com.socure.docv.capturesdk.common.utils.ApiConstant;
import java.io.IOException;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public class dwd extends IOException {
    public final boolean a;
    public final int b;

    public dwd(String str, Throwable th, boolean z, int i) {
        super(str, th);
        this.a = z;
        this.b = i;
    }

    public static dwd a(RuntimeException runtimeException, String str) {
        return new dwd(str, runtimeException, true, 1);
    }

    public static dwd b(String str) {
        return new dwd(str, null, true, 4);
    }

    public static dwd c(String str) {
        return new dwd(str, null, false, 1);
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        String str;
        String message = super.getMessage();
        if (message != null) {
            str = message.concat(ApiConstant.SPACE);
        } else {
            str = "";
        }
        StringBuilder sb = new StringBuilder(str);
        sb.append("{contentIsMalformed=");
        sb.append(this.a);
        sb.append(", dataType=");
        return ix2.i(this.b, "}", sb);
    }
}
