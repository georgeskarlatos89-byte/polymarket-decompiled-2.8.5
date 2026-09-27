package defpackage;

import android.content.Context;
import bo.app.j9;
import bo.app.k9;
import bo.app.l9;
import bo.app.m9;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class st8 extends qq5 {
    public static final j9 e = new j9();
    public final String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public st8(Context context, String str) {
        super(context);
        str.getClass();
        this.d = str;
    }

    @Override // defpackage.qq5
    public final kp5 getDataStore() {
        Context context = getContext();
        StringBuilder sb = new StringBuilder("com.appboy.managers.geofences.eligibility.global.");
        String str = this.d;
        sb.append(str);
        q3h a = r3h.a(context, ArraysKt.l0(new String[]{fq5.GLOBAL_LAST_REPORT.b(), fq5.GLOBAL_LAST_REQUEST.b()}), sb.toString());
        Context context2 = getContext();
        String g = k84.g("com.appboy.managers.geofences.eligibility.individual.", str);
        j9 j9Var = e;
        return createOrGetDataStore(CollectionsKt.listOf(a, new q3h(context2, g, (gqg) null, new k9(j9Var), 12), new q3h(getContext(), k84.g("com.appboy.managers.geofences.storage.", str), (gqg) null, new l9(j9Var), 12), new q3h(getContext(), "com.appboy.support.geofences", (gqg) null, new m9(j9Var), 12)));
    }

    @Override // defpackage.qq5
    public final String getDataStoreFileName() {
        return "com.braze.geofences." + this.d;
    }
}
