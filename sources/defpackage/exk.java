package defpackage;

import android.content.Context;
import bo.app.o7;
import bo.app.p7;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class exk extends qq5 {
    public static final o7 e = new o7();
    public final orc d;

    public exk(Context context) {
        super(context);
        this.d = new orc();
    }

    @Override // defpackage.qq5
    public final kp5 getDataStore() {
        return createOrGetDataStore(eb4.c(new q3h(getContext(), "persistent.com.braze.requests.metadata.last_req_at", (gqg) null, new p7(), 12)));
    }

    @Override // defpackage.qq5
    public final String getDataStoreFileName() {
        return "persistent.com.braze.endpoint_metadata";
    }
}
