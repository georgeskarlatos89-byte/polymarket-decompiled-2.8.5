package defpackage;

import android.content.Context;
import bo.app.lf;
import com.socure.docv.capturesdk.feature.preview.presentation.ui.a;
import kotlin.Lazy;
import kotlin.LazyKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class g0l extends qq5 {
    public static final klg g = new Object();
    public final String d;
    public final String e;
    public final Lazy f;

    public g0l(Context context, String str, String str2) {
        super(context);
        this.d = str;
        this.e = str2;
        this.f = LazyKt.lazy(new a(24, context, this));
    }

    @Override // defpackage.qq5
    public final kp5 getDataStore() {
        return createOrGetDataStore(eb4.c(new q3h(getContext(), "com.braze.storage.sdk_metadata_cache" + ((String) this.f.getValue()), (gqg) null, new lf(g), 12)));
    }

    @Override // defpackage.qq5
    public final String getDataStoreFileName() {
        return "com.braze.sdk_metadata" + ((String) this.f.getValue());
    }
}
