package defpackage;

import android.content.Context;
import bo.app.v5;
import bo.app.w5;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class gwk extends qq5 {
    public static final v5 e = new v5();
    public final String d;

    public gwk(Context context, String str) {
        super(context);
        this.d = str;
    }

    @Override // defpackage.qq5
    public final kp5 getDataStore() {
        return createOrGetDataStore(CollectionsKt.listOf(r3h.a(getContext(), r3h.a, "com.braze.device_id" + d2i.b(getContext(), null, this.d)), new q3h(getContext(), "com.appboy.device", (gqg) null, new w5(), 12)));
    }

    @Override // defpackage.qq5
    public final String getDataStoreFileName() {
        return "com.braze.device_id" + d2i.b(getContext(), null, this.d);
    }
}
