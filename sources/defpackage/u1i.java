package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.net.URL;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class u1i implements zic {
    public final /* synthetic */ int a;
    public final zic b;

    public /* synthetic */ u1i(zic zicVar, int i) {
        this.a = i;
        this.b = zicVar;
    }

    @Override // defpackage.zic
    public final yic a(Object obj, int i, int i2, ild ildVar) {
        Uri uri;
        int i3 = this.a;
        zic zicVar = this.b;
        switch (i3) {
            case 0:
                String str = (String) obj;
                if (TextUtils.isEmpty(str)) {
                    uri = null;
                } else if (str.charAt(0) == '/') {
                    uri = Uri.fromFile(new File(str));
                } else {
                    Uri parse = Uri.parse(str);
                    if (parse.getScheme() == null) {
                        uri = Uri.fromFile(new File(str));
                    } else {
                        uri = parse;
                    }
                }
                if (uri == null || !zicVar.b(uri)) {
                    return null;
                }
                return zicVar.a(uri, i, i2, ildVar);
            default:
                return zicVar.a(new iw8((URL) obj), i, i2, ildVar);
        }
    }

    @Override // defpackage.zic
    public final boolean b(Object obj) {
        switch (this.a) {
            case 0:
                return true;
            default:
                return true;
        }
    }
}
