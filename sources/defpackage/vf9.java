package defpackage;

import com.socure.docv.capturesdk.common.utils.ApiConstant;
import okhttp3.Response;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public class vf9 extends RuntimeException {
    public final String a;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public vf9(y4g y4gVar) {
        super(r0.toString());
        StringBuilder sb = new StringBuilder("HTTP ");
        Response response = y4gVar.a;
        sb.append(response.code());
        sb.append(ApiConstant.SPACE);
        sb.append(response.message());
        response.code();
        this.a = response.message();
    }
}
