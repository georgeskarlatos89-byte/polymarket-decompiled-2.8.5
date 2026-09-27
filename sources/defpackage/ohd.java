package defpackage;

import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import okhttp3.Headers;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class ohd implements o59 {
    public final /* synthetic */ Headers c;

    public ohd(Headers headers) {
        this.c = headers;
    }

    @Override // defpackage.f2i
    public final void a(Function2 function2) {
        sql.d(this, (zsg) function2);
    }

    @Override // defpackage.f2i
    public final boolean b() {
        return true;
    }

    @Override // defpackage.f2i
    public final boolean c() {
        if (d("Content-Encoding") != null) {
            return true;
        }
        return false;
    }

    public final List d(String str) {
        str.getClass();
        List<String> values = this.c.values(str);
        if (!values.isEmpty()) {
            return values;
        }
        return null;
    }

    @Override // defpackage.f2i
    public final Set entries() {
        return this.c.toMultimap().entrySet();
    }

    @Override // defpackage.f2i
    public final String get(String str) {
        List d = d(str);
        if (d != null) {
            return (String) CollectionsKt.firstOrNull(d);
        }
        return null;
    }
}
